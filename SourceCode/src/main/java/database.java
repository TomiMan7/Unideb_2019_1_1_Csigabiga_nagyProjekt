import javafx.scene.control.Alert;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

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

   public static String Encrypt(String password)
    {
        System.out.println("Encrypt1");
        byte[] bytesOfMessage = new byte[0];
        try
        {
            System.out.println("Encrypt1");
            bytesOfMessage = password.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);
            System.out.println(thedigest);
            password = thedigest.toString();
        }
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        System.out.println(password);
        return password;
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
            while(rs.next())
            {
                String dbname = rs.getString(1);

                mainPage.keresesEredmenye.getItems().add(dbname);
            }
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
            rs   = st.executeQuery("select number from goods where "+ type + " like '"+ input +"'");
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

    public static boolean Login()
    {
        String dbusername = "";
        String dbpassword = "";
        try {
            st   = conn.createStatement();
            rs   = st.executeQuery("select username, password from users where username like '"+login.felhasznalonevText.getText()
                    +"' and password like '"+login.jelszoText.getText()+"'");
            while(rs.next())
            {
                dbusername = rs.getString(1);
                dbpassword = rs.getString(2);
            }

            if(dbusername.equals(login.felhasznalonevText.getText()) && dbpassword.equals(login.jelszoText.getText()))
                return true;

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
        String dbpassword = registration.jelszoText.getText();
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
