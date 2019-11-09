/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * A vasarlashoz szukseges szemelyes informaciokat keri be a vasarlotol.
 * A megfelelo adatok beirasa utan az **orderConfirmation** ablakra visz at.
 */
public class personalInfo
{public static class __CLR4_3_1c8c8k2rvcgzi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,520,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static Button nextPage = new Button("Tov\u00e1bb a v\u00e1s\u00e1rl\u00e1s v\u00e9gleges\u00edt\u00e9s\u00e9hez");
    static Button vissza = new Button("Vissza a kos\u00e1rhoz");

    Label info = new Label("K\u00e9rj\u00fck \u00edrja be az al\u00e1bbi inform\u00e1ci\u00f3kat a v\u00e1s\u00e1rl\u00e1s folytat\u00e1s\u00e1hoz!");
    Label nev = new Label("N\u00e9v:");
    Label telefonszam = new Label("Telefonsz\u00e1m");
    Label szallitasiCim = new Label("Sz\u00e1ll\u00edt\u00e1si c\u00edm:");
    Label email = new Label("E-mail:");
    Label szallitasiModszer = new Label("Sz\u00e1ll\u00edt\u00e1si m\u00f3dszer:");
    Label fizetesiModszer = new Label("Fizet\u00e9si m\u00f3dszer:");

    TextField nevText = new TextField();
    TextField telefonszamText = new TextField();
    TextField szallitasiCimText = new TextField();
    TextField emailText = new TextField();

    ComboBox szallitasiModszerBox = new ComboBox();
    ComboBox fizetesiModszerBox = new ComboBox();

    public void personalInfoShow()
    {try{__CLR4_3_1c8c8k2rvcgzi.R.inc(440);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(441);Stage primaryStage = new Stage();
        __CLR4_3_1c8c8k2rvcgzi.R.inc(442);primaryStage.setTitle("The Snail Sale - Szem\u00e9lyes inform\u00e1ci\u00f3k bek\u00e9r\u00e9se");
        __CLR4_3_1c8c8k2rvcgzi.R.inc(443);primaryStage.setResizable(false);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(444);Image icon = new Image("./icon.jpg");
        __CLR4_3_1c8c8k2rvcgzi.R.inc(445);primaryStage.getIcons().add(icon);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(446);Pane layout = new Pane();


        __CLR4_3_1c8c8k2rvcgzi.R.inc(447);Scene scene = new Scene(layout, 550, 450);


        __CLR4_3_1c8c8k2rvcgzi.R.inc(448);primaryStage.setScene(scene);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(449);primaryStage.show();


        __CLR4_3_1c8c8k2rvcgzi.R.inc(450);info.setLayoutX(100);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(451);info.setLayoutY(20);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(452);nev.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(453);nev.setLayoutY(90);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(454);telefonszam.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(455);telefonszam.setLayoutY(130);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(456);szallitasiCim.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(457);szallitasiCim.setLayoutY(170);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(458);email.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(459);email.setLayoutY(210);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(460);szallitasiModszer.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(461);szallitasiModszer.setLayoutY(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(462);fizetesiModszer.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(463);fizetesiModszer.setLayoutY(290);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(464);nevText.setLayoutX(200);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(465);nevText.setLayoutY(90);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(466);nevText.setPrefWidth(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(467);telefonszamText.setLayoutX(200);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(468);telefonszamText.setLayoutY(130);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(469);telefonszamText.setPrefWidth(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(470);szallitasiCimText.setLayoutX(200);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(471);szallitasiCimText.setLayoutY(170);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(472);szallitasiCimText.setPrefWidth(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(473);emailText.setLayoutX(200);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(474);emailText.setLayoutY(210);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(475);emailText.setPrefWidth(250);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(476);szallitasiModszerBox.setLayoutX(200);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(477);szallitasiModszerBox.setLayoutY(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(478);szallitasiModszerBox.setPromptText("K\u00e9rem v\u00e1lasszon sz\u00e1ll\u00edt\u00e1si m\u00f3dszert!");
        __CLR4_3_1c8c8k2rvcgzi.R.inc(479);szallitasiModszerBox.setPrefWidth(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(480);szallitasiModszerBox.getItems().addAll(
                "Szem\u00e9lyes \u00e1tv\u00e9tel boltunkban",
                "Fut\u00e1rszolg\u00e1lattal val\u00f3 k\u00fcld\u00e9s",
                "Postai \u00faton val\u00f3 k\u00e9zbes\u00edt\u00e9s");
        __CLR4_3_1c8c8k2rvcgzi.R.inc(481);fizetesiModszerBox.setLayoutX(200);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(482);fizetesiModszerBox.setLayoutY(290);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(483);fizetesiModszerBox.setPromptText("K\u00e9rem v\u00e1lasszon fizet\u00e9si m\u00f3dszert!");
        __CLR4_3_1c8c8k2rvcgzi.R.inc(484);fizetesiModszerBox.setPrefWidth(250);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(485);fizetesiModszerBox.getItems().addAll(
                "Bankk\u00e1rty\u00e1s v\u00e1s\u00e1rl\u00e1s",
                "Ut\u00e1nv\u00e9tes v\u00e1s\u00e1rl\u00e1s");


        __CLR4_3_1c8c8k2rvcgzi.R.inc(486);nextPage.setLayoutX(80);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(487);nextPage.setLayoutY(350);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(488);nextPage.setPrefWidth(370);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(489);vissza.setLayoutX(190);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(490);vissza.setLayoutY(400);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(491);vissza.setPrefWidth(150);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(492);layout.getChildren().add(nextPage);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(493);layout.getChildren().add(vissza);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(494);layout.getChildren().add(info);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(495);layout.getChildren().add(nev);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(496);layout.getChildren().add(telefonszam);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(497);layout.getChildren().add(szallitasiCim);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(498);layout.getChildren().add(email);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(499);layout.getChildren().add(szallitasiModszer);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(500);layout.getChildren().add(fizetesiModszer);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(501);layout.getChildren().add(nevText);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(502);layout.getChildren().add(telefonszamText);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(503);layout.getChildren().add(szallitasiCimText);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(504);layout.getChildren().add(emailText);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(505);layout.getChildren().add(szallitasiModszerBox);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(506);layout.getChildren().add(fizetesiModszerBox);

        __CLR4_3_1c8c8k2rvcgzi.R.inc(507);nextPage.setOnAction(personalInfo::handle);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(508);vissza.setOnAction(personalInfo::handle);
    }finally{__CLR4_3_1c8c8k2rvcgzi.R.flushNeeded();}}

    public static void handle(ActionEvent actionEvent)
    {try{__CLR4_3_1c8c8k2rvcgzi.R.inc(509);
        __CLR4_3_1c8c8k2rvcgzi.R.inc(510);if((((actionEvent.getSource() == nextPage)&&(__CLR4_3_1c8c8k2rvcgzi.R.iget(511)!=0|true))||(__CLR4_3_1c8c8k2rvcgzi.R.iget(512)==0&false)))
        {{
            __CLR4_3_1c8c8k2rvcgzi.R.inc(513);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_1c8c8k2rvcgzi.R.inc(514);personalInfoController.orderConfirmationShow();
        }

        }__CLR4_3_1c8c8k2rvcgzi.R.inc(515);if((((actionEvent.getSource() == vissza)&&(__CLR4_3_1c8c8k2rvcgzi.R.iget(516)!=0|true))||(__CLR4_3_1c8c8k2rvcgzi.R.iget(517)==0&false)))
        {{
            __CLR4_3_1c8c8k2rvcgzi.R.inc(518);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_1c8c8k2rvcgzi.R.inc(519);personalInfoController.cartOverViewShow();
        }
    }}finally{__CLR4_3_1c8c8k2rvcgzi.R.flushNeeded();}}
}
