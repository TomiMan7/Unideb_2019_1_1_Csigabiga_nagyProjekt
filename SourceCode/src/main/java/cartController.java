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
        System.out.println(mainPageController.kosar.size());
        System.out.println(Integer.parseInt(good));
        mainPageController.kosar.removeElementAt(Integer.parseInt(good));
        System.out.println(mainPageController.kosar.size());
    }
}
