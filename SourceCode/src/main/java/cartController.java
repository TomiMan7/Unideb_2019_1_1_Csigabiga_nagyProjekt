/**
 * A **cart** GUI-hoz szukseges fuggvenyketet tartalmazza
 */
public class cartController
{
    public static void mainPageShow()
    {
        mainPage mainPage = new mainPage();
        mainPage.mainPageShow();
    }

    public static void personalInfoShow()
    {
        personalInfo personalInfo = new personalInfo();
        personalInfo.personalInfoShow();
    }

    public static void removeGoodFromCart(String good)
    {
        try
        {
            cart.termekneve1Text.setText("");
            cart.termekneve2Text.setText("");
            cart.termekneve3Text.setText("");
            mainPageController.kosar.removeElementAt((Integer.parseInt(good)));
            database.KosarFeltoltese(mainPageController.kosar);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e)
        {
            database.alert("A kosara mar ures!");
        }
    }
}
