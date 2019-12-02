/**
 * A personalInfo GUI ablakhoz tartozo fuggvenyeket tartalmazza.
 */
public class personalInfoController
{
    public static String name;
    public static String phone;
    public static String address;
    public static String email;
    public static String delivery;
    public static String payment;


    public static void getInfos()
    {
        name = personalInfo.nevText.getText();
        phone = personalInfo.telefonszamText.getText();
        address = personalInfo.szallitasiCimText.getText();
        email = personalInfo.emailText.getText();
        delivery = personalInfo.szallitasiModszerBox.getValue().toString();
        payment = personalInfo.fizetesiModszerBox.getValue().toString();
    }

    public static void orderConfirmationShow()
    {
        orderConfirmation orderConfirmation = new orderConfirmation();
        orderConfirmation.orderConfirmationShow();
    }

    public static void cartOverViewShow()
    {
        cartOverview cartOverview = new cartOverview();
        cartOverview.cartOverViewShow();
    }

   public static boolean personalInfoCheck()
    {
        if(personalInfo.nevText.getText().equals("")
        ||personalInfo.telefonszamText.getText().equals("")
        ||personalInfo.szallitasiCimText.getText().equals("")
        ||personalInfo.emailText.getText().equals("")
        ||personalInfo.szallitasiModszerBox.getPromptText().equals("")
        ||personalInfo.fizetesiModszerBox.getPromptText().equals(""))
            return false;
        else
            return true;
    }
}
