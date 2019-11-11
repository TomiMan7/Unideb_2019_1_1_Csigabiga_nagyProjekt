/**
 * A registration GUI fuggvenyeit tartalmazo osztaly
 */
public class registrationController
{
    public static void loginShow()
    {
        login login = new login();
        login.loginShow();
    }

    public static void mainPageShow()
    {
        mainPage mainPage = new mainPage();
        mainPage.mainPageShow();
    }

    public static boolean registrationChechk()
    {
        if(registration.felhasznalonevText.getText().equals("")
            || registration.emailText.getText().equals("")
            || registration.jelszoText.getText().equals("")
            || registration.jelszo2Text.getText().equals("")
            || !registration.jelszoText.getText().equals(registration.jelszo2Text.getText())
        )
            return false;
        else
            return true;
    }
}
