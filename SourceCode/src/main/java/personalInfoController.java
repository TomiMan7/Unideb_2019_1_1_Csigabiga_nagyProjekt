/**
 * A personalInfo GUI ablakhoz tartozo fuggvenyeket tartalmazza.
 */
public class personalInfoController
{
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
        ||personalInfo.szallitasiModszerBox.getPromptText().equals("Kérem válasszon szállítási módszert!")
        ||personalInfo.fizetesiModszerBox.getPromptText().equals("Kérem válasszon fizetési módszert!"))
            return false;
        else
            return true;
    }
}
