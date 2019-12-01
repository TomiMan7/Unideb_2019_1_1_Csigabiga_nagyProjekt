import javafx.scene.control.Button;

import java.util.Vector;

/**
 * A mainPage GUI-hoz tartozo fuggvenyeket tartalmazza.
 */
public class mainPageController
{
    public static Vector kosar = new Vector();

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

    public static void kosarbaTeszem()
    {
        if(kosar.size() <= 2)
        kosar.add(database.KosarbaTesz((String) mainPage.keresesEredmenye.getValue()));

        else
            database.alert("Tele a kosar!");
    }

//    public static int getErtekeles(Button button)
//    {
//        int score = Integer.parseInt(button.getId());
//
//        return score;
//    }
}
