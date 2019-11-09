import javafx.scene.control.Alert;

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

    public static void alert(String message)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Stuff");
        alert.setHeight(200);
        alert.setContentText(message);

        alert.showAndWait();
    }
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

    public static void CloseConnection()
    {
        try
        {
            rs.close();
            st.close();
            conn.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void Query()
    {
        Connect();
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

        else
            order = "name";

        if(mainPage.rendezes.getValue() == "Név szerint csökkenő")
            order = "name desc";

        else if(mainPage.rendezes.getValue() == "Ár szerint növekvő")
            order = "price";

        //if(mainPage.rendezes.getValue() == "Ár szerint csökkenő")
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
            CloseConnection();
        }
        catch (SQLException e)
        {
            alert("Nem sikerult a kereses, hianyzo adatok!");
        }
    }
}
