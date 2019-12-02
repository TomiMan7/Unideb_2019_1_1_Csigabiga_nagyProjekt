import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Ebbe az osztályba kerülnek azok a függvények amik a programhoz
 * szükséges adatbázis kezeléssel kapcsolatosak.
 */
public class database
{
    public static String connection = "";
    static ResultSet  rs = null;
    static Connection conn = null;

    private static boolean loggedIn = false;

    public static boolean CheckLoggedInStatus()
    {
        return loggedIn;
    }

    public static void alert(String message)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Stuff");
        alert.setHeight(500);
        alert.setWidth(200);
        alert.setContentText(message);

        alert.showAndWait();
    }

    public static void Connect()
    {
        connection = "jdbc:mysql://127.0.0.1/csiga?user=root&password= ";

        try
        {
            conn = DriverManager.getConnection(connection);
        }
        catch (SQLException e)
        {
            alert("Nem elerheto az adatbazis!\n\n" + e);
        }
    }

    public static void CloseConnection()
    {
        try
        {
            conn.createStatement();
            conn.close();
        }
        catch (SQLException e)
        {
            alert("Nem sikerult a kapcsolatot zarni!\n" + e);
        }
    }

    public static int Encrypt(String password)
    {
       int pw = password.hashCode();
       return pw;
    }

    public static void Kereses()
    {
        final String name = mainPage.keresoSzoveg.getText();
        final String type;
        final String order;

        mainPage.keresesEredmenye.getItems().clear();

        if(mainPage.arSzerint.isSelected())
            type = "price";
        else if(mainPage.ertekelesSzerint.isSelected())
            type = "rating";
        else
            type = "name";

        if(mainPage.rendezes.getValue() == "Név szerint növekvő")
            order = "name";
        else if(mainPage.rendezes.getValue() == "Név szerint csökkenő")
            order = "name desc";
        else if(mainPage.rendezes.getValue() == "Ár szerint növekvő")
            order = "price";
        else
            order = "price desc";

        try {
            rs   = conn.createStatement().executeQuery("select " + type + " from goods where name like '%"+name+"%' order by " + order);

            int darab = 0;
            while(rs.next())
            {
                String dbname = rs.getString(1);

                mainPage.keresesEredmenye.getItems().add(dbname);

                darab++;
            }
            mainPage.talalatokSzamaszam.setText(Integer.toString(darab));
        }
        catch (SQLException e)
        {
            alert("Nem sikerult a kereses, hianyzo adatok!\n" + e);
        }
    }

    public static int KosarbaTesz(String input)
    {
        int dbnumber = 0;
        String type = "name";

        if(mainPage.nevSzerint.isSelected())
            type = "name";

        else if(mainPage.arSzerint.isSelected())
            type = "price";

        else if(mainPage.ertekelesSzerint.isSelected())
            type = "rating";

        try {
            rs   = conn.createStatement().executeQuery("select number from goods where " + type + " like '"+ input +"'");
            while(rs.next())
            {
                dbnumber = rs.getInt(1);
            }
        }
        catch (SQLException e)
        {
            alert("Nem sikerult a kosarba valo lekerdezes!\n" + e);
        }
        return dbnumber;
    }

    public static void KosarFeltoltese(Vector kosar)
    {
        java.util.List<Label> nevek = new ArrayList<>();
        nevek.add(cart.termekneve1Text);
        nevek.add(cart.termekneve2Text);
        nevek.add(cart.termekneve3Text);
        for(int i = 0; i < kosar.size(); i++)
        {
            try {
                rs   = conn.createStatement().executeQuery("select name from goods where number like '" +kosar.elementAt(i)+"'");
                while(rs.next())
                {
                    nevek.get(i).setText(rs.getString(1));
                }
            }
            catch (SQLException e)
            {
                alert("Nem sikerult a kosar feltoltese!\n" + e);
            }
        }
    }

    public static void KosarVeglegesiteseFeltoltese(Vector kosar)
    {
        java.util.List<Label> nevek = new ArrayList<>();
        java.util.List<Label> arak = new ArrayList<>();
        cartOverviewController.vegosszeg = 0;

        nevek.add(cartOverview.termekneveText);
        nevek.add(cartOverview.termekneve1Text);
        nevek.add(cartOverview.termekneve2Text);

        arak.add(cartOverview.ar);
        arak.add(cartOverview.ar2);
        arak.add(cartOverview.ar3);

        for(int i = 0; i < kosar.size(); i++)
        {
            try {
                rs   = conn.createStatement().executeQuery("select name, price from goods where number like '" +kosar.elementAt(i)+"'");
                while(rs.next())
                {
                    nevek.get(i).setText(rs.getString(1));
                    arak.get(i).setText(String.valueOf(rs.getInt(2)));
                    cartOverviewController.vegosszeg += rs.getInt(2);
                }
            }
            catch (SQLException e)
            {
                alert("Nem sikerult a kosar feltoltese!\n" + e);
            }
        }
        cartOverview.vegosszeg.setText(String.valueOf(cartOverviewController.vegosszeg));
    }

    public static void VasarlasVeglegesiteseFeltoltese(Vector kosar)
    {
        java.util.List<Label> nevek = new ArrayList<>();

        nevek.add(orderConfirmation.termekneveText);
        nevek.add(orderConfirmation.termekneve1Text);
        nevek.add(orderConfirmation.termekneve2Text);

        for(int i = 0; i < kosar.size(); i++)
        {
            try {
                rs   = conn.createStatement().executeQuery("select name from goods where number like '" +kosar.elementAt(i)+"'");
                while(rs.next())
                {
                    nevek.get(i).setText(rs.getString(1));
                }
            }
            catch (SQLException e)
            {
                alert("Nem sikerult a kosar feltoltese!\n" + e);
            }
        }
        System.out.println(cartOverviewController.vegosszeg);
        orderConfirmation.fizetendo.setText(String.valueOf(cartOverviewController.vegosszeg));
    }

    public static boolean Login()
    {
        String dbusername = "";
        int dbpassword = 0;
        int pw = Encrypt(login.jelszoText.getText());
        try {
            rs   = conn.createStatement().executeQuery("select username, password from users where username like '"+login.felhasznalonevText.getText()
                    +"' and password like '"+pw+"'");
            while(rs.next())
            {
                dbusername = rs.getString(1);
                dbpassword = rs.getInt(2);
            }

            if(dbusername.equals(login.felhasznalonevText.getText()) && dbpassword == pw)
            {
                loggedIn = true;
                return true;
            }

            else
                return false;
        }
        catch (SQLException e)
        {
            alert("Nem sikerult a bejelentkezes!\n" + e);
        }
        return true;
    }

    public static boolean registration()
    {
        final String dbusername = registration.felhasznalonevText.getText();
        final String dbemail = registration.emailText.getText();
        int dbpassword = Encrypt(registration.jelszoText.getText());
        try
        {
            conn.createStatement().executeUpdate("INSERT INTO users (`username`, `email`, `password`) VALUES ('"+dbusername+"', '"+dbemail+"', '"+dbpassword+"')");
        }
        catch (SQLIntegrityConstraintViolationException e)
        {
            alert("Foglalt felhasznalonev vagy email!");
            return false;
        }
        catch (SQLException e)
        {
            alert("Nem sikerult a regisztracio!\n" + e);
            return false;
        }
        return true;
    }

    public static void setScore(int number)
    {
        int goodNumber = KosarbaTesz(mainPage.keresesEredmenye.getValue().toString());
        int rating = 0;
        int ratingCount = 0;
        try
        {
            rs   = conn.createStatement().executeQuery("select rating, ratingCount from goods where number like '"+goodNumber+"'");
            while(rs.next())
            {
                rating = rs.getInt(1);
                ratingCount = rs.getInt(2);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        rating += number;
        ratingCount++;

        try
        {
            //UPDATE goods SET rating=5, ratingCount=2 WHERE number like 1;
            conn.createStatement().executeUpdate("UPDATE goods SET rating="+rating+", ratingCount="+ratingCount+" WHERE number like '"+goodNumber+"'");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static int getRating(int number)
    {
        int rating = 0;
        int ratingCount = 0;
        try
        {
            rs   = conn.createStatement().executeQuery("select rating, ratingCount from goods where number like '"+number+"'");
            while(rs.next())
            {
                rating = rs.getInt(1);
                ratingCount = rs.getInt(2);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return (int)rating/ratingCount;
    }
    public static void setOrder()
    {
        String goods;
        goods = orderConfirmation.termekneveText.getText() +","+ orderConfirmation.termekneve1Text.getText() +","+ orderConfirmation.termekneve2Text.getText();
        try
        {
            conn.createStatement().executeUpdate("INSERT INTO orders (`trackingNumber`, `name`, `username` , `phone`, `address`, `email`, `paymentMethod`, `shipmentMethod`, `goods`)" +
                    " VALUES" +
                    "('"+Integer.parseInt(orderConfirmationController.trackingnumber)+"', '"+orderConfirmation.name.getText()+"', '"+mainPage.bejelentkezettNeve.getText()+"', '"+orderConfirmation.tsz.getText()+"', '"+orderConfirmation.szc.getText()+"','"+orderConfirmation.ecim.getText()+"'," +
                    "'"+orderConfirmation.szm.getText()+"','"+orderConfirmation.fm.getText()+"' ,'"+goods+"')");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}