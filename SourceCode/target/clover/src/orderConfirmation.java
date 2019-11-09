/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.concurrent.TimeUnit;

/**
 * A vasarlas vegso lezarasa, adjon kepet hogy mit, mennyit, mennyiert vasarol az illeto, hova, kinek
 * viszik ki, hogyan stb.
 * Sikeres vasarlas eseten vigyen vissza a **mainPage**-re.
 */

public class orderConfirmation
{public static class __CLR4_3_19k9kk2rvcgxg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Label vasarlas = new Label("A v\u00e1s\u00e1rl\u00e1s v\u00e9gleges\u00edt\u00e9se");

    static Button fizet = new Button("Fizet\u00e9s");
    static Button vissza = new Button("Vissza");

    Rectangle termekhelye = new Rectangle(40,100,80,80);
    Rectangle termekhelye1 = new Rectangle(40,220,80,80);
    Rectangle termekhelye2= new Rectangle(40, 340, 80, 80);

    Label termekneve = new Label("A term\u00e9k neve");
    Label termekneve1 = new Label("A term\u00e9k neve");
    Label termekneve2 = new Label("A term\u00e9k neve");

    Label termekek = new Label("A term\u00e9kek: ");
    Label szemelyes = new Label("Szem\u00e9lyes adatok: ");

    Label nev = new Label("N\u00e9v:");
    Label telefonszam = new Label("Telefonsz\u00e1m");
    Label szallitasiCim = new Label("Sz\u00e1ll\u00edt\u00e1si c\u00edm:");
    Label email = new Label("E-mail:");
    Label szallitasiModszer = new Label("Sz\u00e1ll\u00edt\u00e1si m\u00f3dszer:");
    Label fizetesiModszer = new Label("Fizet\u00e9si m\u00f3dszer:");

    Label osszeg = new Label("Fizetend\u0151:   Ft");


    public void orderConfirmationShow()
    {try{__CLR4_3_19k9kk2rvcgxg.R.inc(344);
        __CLR4_3_19k9kk2rvcgxg.R.inc(345);Stage primaryStage = new Stage();

        __CLR4_3_19k9kk2rvcgxg.R.inc(346);primaryStage.setTitle("The Snail Sale - A v\u00e1s\u00e1rl\u00e1s v\u00e9gleges\u00edt\u00e9se");
        __CLR4_3_19k9kk2rvcgxg.R.inc(347);primaryStage.setResizable(false);

        __CLR4_3_19k9kk2rvcgxg.R.inc(348);javafx.scene.image.Image icon = new Image("./icon.jpg");
        __CLR4_3_19k9kk2rvcgxg.R.inc(349);primaryStage.getIcons().add(icon);

        __CLR4_3_19k9kk2rvcgxg.R.inc(350);Pane layout = new Pane();

        __CLR4_3_19k9kk2rvcgxg.R.inc(351);Scene scene = new Scene(layout, 550, 600);

        __CLR4_3_19k9kk2rvcgxg.R.inc(352);primaryStage.setScene(scene);

        __CLR4_3_19k9kk2rvcgxg.R.inc(353);primaryStage.show();


        __CLR4_3_19k9kk2rvcgxg.R.inc(354);vasarlas.setLayoutX(200);
        __CLR4_3_19k9kk2rvcgxg.R.inc(355);vasarlas.setLayoutY(20);
        __CLR4_3_19k9kk2rvcgxg.R.inc(356);vissza.setLayoutX(30);
        __CLR4_3_19k9kk2rvcgxg.R.inc(357);vissza.setLayoutY(20);
        __CLR4_3_19k9kk2rvcgxg.R.inc(358);vissza.setPrefWidth(100);
        __CLR4_3_19k9kk2rvcgxg.R.inc(359);fizet.setLayoutX(400);
        __CLR4_3_19k9kk2rvcgxg.R.inc(360);fizet.setLayoutY(500);
        __CLR4_3_19k9kk2rvcgxg.R.inc(361);fizet.setPrefWidth(100);

        __CLR4_3_19k9kk2rvcgxg.R.inc(362);osszeg.setLayoutX(280);
        __CLR4_3_19k9kk2rvcgxg.R.inc(363);osszeg.setLayoutY(505);

        __CLR4_3_19k9kk2rvcgxg.R.inc(364);termekek.setLayoutX(40);
        __CLR4_3_19k9kk2rvcgxg.R.inc(365);termekek.setLayoutY(80);

        __CLR4_3_19k9kk2rvcgxg.R.inc(366);szemelyes.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(367);szemelyes.setLayoutY(80);

        __CLR4_3_19k9kk2rvcgxg.R.inc(368);nev.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(369);nev.setLayoutY(100);
        __CLR4_3_19k9kk2rvcgxg.R.inc(370);telefonszam.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(371);telefonszam.setLayoutY(150);
        __CLR4_3_19k9kk2rvcgxg.R.inc(372);szallitasiCim.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(373);szallitasiCim.setLayoutY(200);
        __CLR4_3_19k9kk2rvcgxg.R.inc(374);email.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(375);email.setLayoutY(250);
        __CLR4_3_19k9kk2rvcgxg.R.inc(376);szallitasiModszer.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(377);szallitasiModszer.setLayoutY(300);
        __CLR4_3_19k9kk2rvcgxg.R.inc(378);fizetesiModszer.setLayoutX(310);
        __CLR4_3_19k9kk2rvcgxg.R.inc(379);fizetesiModszer.setLayoutY(350);

        __CLR4_3_19k9kk2rvcgxg.R.inc(380);termekneve.setLayoutX(140);
        __CLR4_3_19k9kk2rvcgxg.R.inc(381);termekneve.setLayoutY(100);

        __CLR4_3_19k9kk2rvcgxg.R.inc(382);termekneve1.setLayoutX(140);
        __CLR4_3_19k9kk2rvcgxg.R.inc(383);termekneve1.setLayoutY(220);

        __CLR4_3_19k9kk2rvcgxg.R.inc(384);termekneve2.setLayoutX(140);
        __CLR4_3_19k9kk2rvcgxg.R.inc(385);termekneve2.setLayoutY(340);

        __CLR4_3_19k9kk2rvcgxg.R.inc(386);termekhelye.setFill(null);
        __CLR4_3_19k9kk2rvcgxg.R.inc(387);termekhelye.setStroke(Color.GRAY);
        __CLR4_3_19k9kk2rvcgxg.R.inc(388);termekhelye.setStrokeWidth(3);

        __CLR4_3_19k9kk2rvcgxg.R.inc(389);termekhelye1.setFill(null);
        __CLR4_3_19k9kk2rvcgxg.R.inc(390);termekhelye1.setStroke(Color.GRAY);
        __CLR4_3_19k9kk2rvcgxg.R.inc(391);termekhelye1.setStrokeWidth(3);

        __CLR4_3_19k9kk2rvcgxg.R.inc(392);termekhelye2.setFill(null);
        __CLR4_3_19k9kk2rvcgxg.R.inc(393);termekhelye2.setStroke(Color.GRAY);
        __CLR4_3_19k9kk2rvcgxg.R.inc(394);termekhelye2.setStrokeWidth(3);

        __CLR4_3_19k9kk2rvcgxg.R.inc(395);layout.getChildren().add(vasarlas);
        __CLR4_3_19k9kk2rvcgxg.R.inc(396);layout.getChildren().add(vissza);

        __CLR4_3_19k9kk2rvcgxg.R.inc(397);layout.getChildren().add(termekek);
        __CLR4_3_19k9kk2rvcgxg.R.inc(398);layout.getChildren().add(szemelyes);
        __CLR4_3_19k9kk2rvcgxg.R.inc(399);layout.getChildren().add(osszeg);

        __CLR4_3_19k9kk2rvcgxg.R.inc(400);layout.getChildren().add(fizet);
        __CLR4_3_19k9kk2rvcgxg.R.inc(401);layout.getChildren().add(termekhelye);
        __CLR4_3_19k9kk2rvcgxg.R.inc(402);layout.getChildren().add(termekhelye1);
        __CLR4_3_19k9kk2rvcgxg.R.inc(403);layout.getChildren().add(termekhelye2);
        __CLR4_3_19k9kk2rvcgxg.R.inc(404);layout.getChildren().add(termekneve);
        __CLR4_3_19k9kk2rvcgxg.R.inc(405);layout.getChildren().add(termekneve1);
        __CLR4_3_19k9kk2rvcgxg.R.inc(406);layout.getChildren().add(termekneve2);

        __CLR4_3_19k9kk2rvcgxg.R.inc(407);layout.getChildren().add(nev);
        __CLR4_3_19k9kk2rvcgxg.R.inc(408);layout.getChildren().add(telefonszam);
        __CLR4_3_19k9kk2rvcgxg.R.inc(409);layout.getChildren().add(szallitasiCim);
        __CLR4_3_19k9kk2rvcgxg.R.inc(410);layout.getChildren().add(email);
        __CLR4_3_19k9kk2rvcgxg.R.inc(411);layout.getChildren().add(szallitasiModszer);
        __CLR4_3_19k9kk2rvcgxg.R.inc(412);layout.getChildren().add(fizetesiModszer);

        __CLR4_3_19k9kk2rvcgxg.R.inc(413);fizet.setOnAction(orderConfirmation::handle);
        __CLR4_3_19k9kk2rvcgxg.R.inc(414);vissza.setOnAction(orderConfirmation::handle);
    }finally{__CLR4_3_19k9kk2rvcgxg.R.flushNeeded();}}

    public static void handle(ActionEvent actionEvent)
    {try{__CLR4_3_19k9kk2rvcgxg.R.inc(415);
        __CLR4_3_19k9kk2rvcgxg.R.inc(416);if((((actionEvent.getSource() == fizet)&&(__CLR4_3_19k9kk2rvcgxg.R.iget(417)!=0|true))||(__CLR4_3_19k9kk2rvcgxg.R.iget(418)==0&false)))
        {{
            __CLR4_3_19k9kk2rvcgxg.R.inc(419);orderConfirmationController.thanks();
            __CLR4_3_19k9kk2rvcgxg.R.inc(420);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_19k9kk2rvcgxg.R.inc(421);orderConfirmationController.mainPageSHow();
        }

        }__CLR4_3_19k9kk2rvcgxg.R.inc(422);if((((actionEvent.getSource() == vissza)&&(__CLR4_3_19k9kk2rvcgxg.R.iget(423)!=0|true))||(__CLR4_3_19k9kk2rvcgxg.R.iget(424)==0&false)))
        {{
            __CLR4_3_19k9kk2rvcgxg.R.inc(425);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_19k9kk2rvcgxg.R.inc(426);orderConfirmationController.personailInfoShow();
        }
    }}finally{__CLR4_3_19k9kk2rvcgxg.R.flushNeeded();}}
}