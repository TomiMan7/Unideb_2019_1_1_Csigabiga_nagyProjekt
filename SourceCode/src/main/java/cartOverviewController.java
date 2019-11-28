/**
 * A cartOverview GUI-hoz tartozo fuggvenyeket tartalmazza.
 */
public class cartOverviewController
{
    public static int vegosszeg = 0;

    public static void personalInfoShow()
    {
        personalInfo personalInfo = new personalInfo();
        personalInfo.personalInfoShow();
    }

    public static void mainPageShow()
    {
        mainPage mainPage = new mainPage();
        mainPage.mainPageShow();
    }

    public static void removeGoodFromCart(String good)
    {
        try
        {
            cartOverview.termekneveText.setText("");
            cartOverview.termekneve1Text.setText("");
            cartOverview.termekneve2Text.setText("");
            cartOverview.ar.setText("");
            cartOverview.ar2.setText("");
            cartOverview.ar3.setText("");

            mainPageController.kosar.removeElementAt((Integer.parseInt(good)));
            database.KosarVeglegesiteseFeltoltese(mainPageController.kosar);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e)
        {
            database.alert("A kosara mar ures!");
            cartOverviewController.mainPageShow();
        }
    }
}
