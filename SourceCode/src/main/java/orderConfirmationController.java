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
}
