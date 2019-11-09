import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ebbe az osztályba kerülnek azok a függvények amik a programhoz
 * szükséges adatbázis kezeléssel kapcsolatosak.
 */
public class database
{
    public static String connection = "";
    static ResultSet  rs   = null;
    static Statement  st   = null;
    static Connection conn = null;
//st.executeUpdate(lekerdezes);
    public static void Connect()
    {
        String AdatbazisElerhetosege = new String("127.0.0.1");
        String Felhasznalonev        = new String("root");
        String AdatbazisAzonosito    = new String("csiga");
        String Jelszo             = new String("");
        connection = "jdbc:mysql://" + AdatbazisElerhetosege + "/" + AdatbazisAzonosito + "?user=" + Felhasznalonev+ "&password=" + Jelszo;
        //connection = "jdbc:mysql://127.0.0.1/csiga?user=root&password= ";

        try
        {
            conn = DriverManager.getConnection(connection);
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }

    public static void Query()
    {
        try {
            st   = conn.createStatement();
            rs   = st.executeQuery("select * from users");
            while(rs.next()) {
                String username = rs.getString(1);
                String email = rs.getString(2);
                String password = rs.getString(3);

                mainPage.aruInfo.setText(username + " " + email + " " + password);
            }
        }
        catch (SQLException e)
        {
            System.out.println("Nem sikerult a kereses!");
        }

    }

}
