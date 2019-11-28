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
    static Statement  st = null;
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
        String name = mainPage.keresoSzoveg.getText();
        String type = "name";
        String order = "name";

        mainPage.keresesEredmenye.getItems().clear();

        if(mainPage.nevSzerint.isSelected())
            type = "name";

        else if(mainPage.arSzerint.isSelected())
            type = "price";

        else if(mainPage.ertekelesSzerint.isSelected())
            type = "rating";

        if(mainPage.rendezes.getValue() == "Név szerint növekvő")
            order = "name";

        else if(mainPage.rendezes.getValue() == "Név szerint csökkenő")
            order = "name desc";

        else if(mainPage.rendezes.getValue() == "Ár szerint növekvő")
            order = "price";

        else
            order = "price desc";

        try {
            st   = conn.createStatement();
            rs   = st.executeQuery("select " + type + " from goods where name like '%"+name+"%' order by " + order);

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
            st   = conn.createStatement();
            rs   = st.executeQuery("select number from goods where " + type + " like '"+ input +"'");
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
                st   = conn.createStatement();
                rs   = st.executeQuery("select name from goods where number like '" +kosar.elementAt(i)+"'");
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

    public static boolean Login()
    {
        String dbusername = "";
        int dbpassword = 0;
        int pw = Encrypt(login.jelszoText.getText());
        try {
            st   = conn.createStatement();
            rs   = st.executeQuery("select username, password from users where username like '"+login.felhasznalonevText.getText()
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
        String dbusername = registration.felhasznalonevText.getText();
        String dbemail = registration.emailText.getText();
        int dbpassword = Encrypt(registration.jelszoText.getText());
        try
        {
            st   = conn.createStatement();
            st.executeUpdate("INSERT INTO users (`username`, `email`, `password`) VALUES ('"+dbusername+"', '"+dbemail+"', '"+dbpassword+"')");
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
}
