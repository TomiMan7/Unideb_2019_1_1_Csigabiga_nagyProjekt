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
        if(Integer.parseInt(good) + 1 <= mainPageController.kosar.size())
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
            //database.KosarVeglegesiteseFeltoltese(mainPageController.kosar);
            database.alert("Hiba tortent!\n" + e);
        }
        else if(mainPageController.kosar.size() == 0)
            database.alert("A kosara mar ures!");
    }
}
