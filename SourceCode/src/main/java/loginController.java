import javafx.scene.Node;

/**
 * A login GUI-hoz tartozo fuggvenyeket tartalmazza.
 */
public class loginController
{
    public static void registrationShow()
    {
        registration registration = new registration();
        registration.registrationShow();
    }

    public static void mainPageShow()
    {
        mainPage mainPage = new mainPage();
        mainPage.mainPageShow();
    }

    public static void setLogin()
    {
        mainPage.bejelentkezettNeve.setText(login.felhasznalonevText.getText());
    }

    public static boolean LoginCheck()
    {
        if(login.felhasznalonevText.getText().equals("") || login.jelszoText.getText().equals(""))
        {
            database.alert("Hianyzo adat!");
            return false;
        }
        else
            return true;
    }
}
