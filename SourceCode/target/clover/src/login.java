/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * A belepeshez szukseges informaciokat keri be a felhasznalotol.
 * Legyen lehetosege a felhasznalonak ebbol az ablakbol megnyitni a **registration** ablakot
 * hogy regisztralhasson.
 * Sikeres belepes utan a **mainPage** megfeleloen megvaltoztatott ablakat hozza fel.
 */
public class login
{public static class __CLR4_3_13k3kk2rvcgrg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,174,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Button bejelentkezes = new Button("Bejelentkez\u00e9s");
    static Button regisztracio = new Button("Regisztr\u00e1ci\u00f3");

    Label info = new Label("K\u00e9rem jelentkezzen be!");
    Label info2 = new Label("Ha m\u00e9g nincs fi\u00f3kja, k\u00e9rem regisztr\u00e1ljon be itt!");

    Label felhasznalonev = new Label("Felhaszn\u00e1l\u00f3n\u00e9v:");
    Label jelszo = new Label("Jelsz\u00f3:");

    TextField felhasznalonevText = new TextField();
    TextField jelszoText = new TextField();


    public void loginShow()
    {try{__CLR4_3_13k3kk2rvcgrg.R.inc(128);
        __CLR4_3_13k3kk2rvcgrg.R.inc(129);Stage primaryStage = new Stage();
        __CLR4_3_13k3kk2rvcgrg.R.inc(130);primaryStage.setTitle("The Snail Sale - Bejelentkez\u00e9s");
        __CLR4_3_13k3kk2rvcgrg.R.inc(131);primaryStage.setResizable(false);

        __CLR4_3_13k3kk2rvcgrg.R.inc(132);Image icon = new Image("./icon.jpg");
        __CLR4_3_13k3kk2rvcgrg.R.inc(133);primaryStage.getIcons().add(icon);

        __CLR4_3_13k3kk2rvcgrg.R.inc(134);Pane layout = new Pane();

        __CLR4_3_13k3kk2rvcgrg.R.inc(135);Scene scene = new Scene(layout, 550, 400);

        __CLR4_3_13k3kk2rvcgrg.R.inc(136);primaryStage.setScene(scene);
        __CLR4_3_13k3kk2rvcgrg.R.inc(137);primaryStage.show();

        __CLR4_3_13k3kk2rvcgrg.R.inc(138);info.setLayoutX(200);
        __CLR4_3_13k3kk2rvcgrg.R.inc(139);info.setLayoutY(20);
        __CLR4_3_13k3kk2rvcgrg.R.inc(140);info2.setLayoutX(80);
        __CLR4_3_13k3kk2rvcgrg.R.inc(141);info2.setLayoutY(280);
        __CLR4_3_13k3kk2rvcgrg.R.inc(142);felhasznalonev.setLayoutX(80);
        __CLR4_3_13k3kk2rvcgrg.R.inc(143);felhasznalonev.setLayoutY(90);
        __CLR4_3_13k3kk2rvcgrg.R.inc(144);jelszo.setLayoutX(80);
        __CLR4_3_13k3kk2rvcgrg.R.inc(145);jelszo.setLayoutY(130);

        __CLR4_3_13k3kk2rvcgrg.R.inc(146);felhasznalonevText.setLayoutX(200);
        __CLR4_3_13k3kk2rvcgrg.R.inc(147);felhasznalonevText.setLayoutY(90);
        __CLR4_3_13k3kk2rvcgrg.R.inc(148);felhasznalonevText.setPrefWidth(250);
        __CLR4_3_13k3kk2rvcgrg.R.inc(149);jelszoText.setLayoutX(200);
        __CLR4_3_13k3kk2rvcgrg.R.inc(150);jelszoText.setLayoutY(130);
        __CLR4_3_13k3kk2rvcgrg.R.inc(151);jelszoText.setPrefWidth(250);

        __CLR4_3_13k3kk2rvcgrg.R.inc(152);regisztracio.setLayoutX(80);
        __CLR4_3_13k3kk2rvcgrg.R.inc(153);regisztracio.setLayoutY(300);
        __CLR4_3_13k3kk2rvcgrg.R.inc(154);regisztracio.setPrefWidth(150);

        __CLR4_3_13k3kk2rvcgrg.R.inc(155);bejelentkezes.setLayoutX(350);
        __CLR4_3_13k3kk2rvcgrg.R.inc(156);bejelentkezes.setLayoutY(300);
        __CLR4_3_13k3kk2rvcgrg.R.inc(157);bejelentkezes.setPrefWidth(100);

        __CLR4_3_13k3kk2rvcgrg.R.inc(158);layout.getChildren().add(regisztracio);
        __CLR4_3_13k3kk2rvcgrg.R.inc(159);layout.getChildren().add(bejelentkezes);

        __CLR4_3_13k3kk2rvcgrg.R.inc(160);layout.getChildren().add(info);
        __CLR4_3_13k3kk2rvcgrg.R.inc(161);layout.getChildren().add(info2);
        __CLR4_3_13k3kk2rvcgrg.R.inc(162);layout.getChildren().add(felhasznalonev);
        __CLR4_3_13k3kk2rvcgrg.R.inc(163);layout.getChildren().add(jelszo);

        __CLR4_3_13k3kk2rvcgrg.R.inc(164);layout.getChildren().add(felhasznalonevText);
        __CLR4_3_13k3kk2rvcgrg.R.inc(165);layout.getChildren().add(jelszoText);

        __CLR4_3_13k3kk2rvcgrg.R.inc(166);regisztracio.setOnAction(login::handle);
        __CLR4_3_13k3kk2rvcgrg.R.inc(167);bejelentkezes.setOnAction(login::handle);

    }finally{__CLR4_3_13k3kk2rvcgrg.R.flushNeeded();}}

    public static void handle(ActionEvent actionEvent)
    {try{__CLR4_3_13k3kk2rvcgrg.R.inc(168);
        __CLR4_3_13k3kk2rvcgrg.R.inc(169);if((((actionEvent.getSource() == regisztracio)&&(__CLR4_3_13k3kk2rvcgrg.R.iget(170)!=0|true))||(__CLR4_3_13k3kk2rvcgrg.R.iget(171)==0&false)))
        {{
            __CLR4_3_13k3kk2rvcgrg.R.inc(172);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_13k3kk2rvcgrg.R.inc(173);loginController.registrationShow();
        }

    }}finally{__CLR4_3_13k3kk2rvcgrg.R.flushNeeded();}}
}
