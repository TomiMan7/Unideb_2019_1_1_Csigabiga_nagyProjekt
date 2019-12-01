import javafx.scene.control.Alert;

/**
 * orderConfirmation GUI-hoz tartozo fuggvenyeket tartalmazza.
 */
public class orderConfirmationController
{
    public static void mainPageSHow()
    {
        mainPage mainPage = new mainPage();
        mainPage.mainPageShow();
//        thanks();
    }

    public static void personailInfoShow()
    {
        personalInfo personalInfo = new personalInfo();
        personalInfo.personalInfoShow();
    }

    /*Vagy itt lesz v a database-ben attol fuggoen h lesz generalva a string*/
    public static void trackingNumber()
    {}

    public static void thanks()
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Köszönjük a vásárlást!");
        alert.setHeight(200);
        alert.setContentText("Köszönjük a vásárlást! \n Legközelebb is Nálunk vásároljon!" +
                "\n\nA következő kóddal tudja követni a csomagja helyzetét:\n"
         + "IDE JON MAJD EGY FUGGVENYHIVAS");

        alert.showAndWait();
    }

    public static void pink(String good)
    {
        if(Integer.parseInt(good) + 1 <= mainPageController.kosar.size())
            try
            {
                orderConfirmation.termekneveText.setText("");
                orderConfirmation.termekneve1Text.setText("");
                orderConfirmation.termekneve2Text.setText("");

                database.VasarlasVeglegesiteseFeltoltese(mainPageController.kosar);

            }
            catch (java.lang.ArrayIndexOutOfBoundsException e)
            {
                database.alert("Hiba tortent!\n" + e);
            }
    }
}
