import javax.swing.*;

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
        if(Integer.parseInt(good) + 1 <= mainPageController.kosar.size())
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

            CloseCart();
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e)
        {
            database.alert("Hiba tortent!\n" + e);
        }
        else
            CloseCart();
    }

    public static void CloseCart()
    {
        if(mainPageController.kosar.size() == 0)
        {
            database.alert("A kosara mar ures!");
            cartOverview.primaryStage.close();
            cartOverviewController.mainPageShow();
        }
    }
}
