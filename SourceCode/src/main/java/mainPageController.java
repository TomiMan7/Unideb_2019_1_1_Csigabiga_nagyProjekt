/**
 * A mainPage GUI-hoz tartozo fuggvenyeket tartalmazza.
 */
public class mainPageController
{
    public static void loginShow()
    {
        login login = new login();
        login.loginShow();
    }

    public static void cartOverwiewShow()
    {
        cartOverview cartOverview = new cartOverview();
        cartOverview.cartOverViewShow();
    }

    public static void cartShow()
    {
        cart cart = new cart();
        cart.cartShow();
    }

}
