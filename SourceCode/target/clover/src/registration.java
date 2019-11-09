/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * A regisztraciohoz szukseges adatokat keri be a felhasznalotol.
 * Sikeres regisztracio eseten visszaviszi a felhasznalot a **login** ablakra.
 */
public class registration
{public static class __CLR4_3_1ememk2rvch0n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,583,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Button regisztracio = new Button("Regisztr\u00e1ci\u00f3");
    static Button megse = new Button("M\u00e9gse");

    Label info = new Label("K\u00e9rj\u00fck regisztr\u00e1ljon be el\u0151sz\u00f6r a v\u00e1s\u00e1rl\u00e1s elkezd\u00e9s\u00e9hez");
    Label felhasznalonev = new Label("Felhaszn\u00e1l\u00f3n\u00e9v:");
    Label email = new Label("E-mail:");
    Label jelszo = new Label("Jelsz\u00f3:");
    Label jelszo2 = new Label("Jelsz\u00f3 m\u00e9gegyszer:");

    TextField felhasznalonevText = new TextField();
    TextField emailText = new TextField();
    TextField jelszoText = new TextField();
    TextField jelszo2Text = new TextField();


    public void registrationShow()
    {try{__CLR4_3_1ememk2rvch0n.R.inc(526);
        __CLR4_3_1ememk2rvch0n.R.inc(527);Stage primaryStage = new Stage();
        __CLR4_3_1ememk2rvch0n.R.inc(528);primaryStage.setTitle("The Snail Sale - Regisztr\u00e1ci\u00f3");
        __CLR4_3_1ememk2rvch0n.R.inc(529);primaryStage.setResizable(false);

        __CLR4_3_1ememk2rvch0n.R.inc(530);Image icon = new Image("./icon.jpg");
        __CLR4_3_1ememk2rvch0n.R.inc(531);primaryStage.getIcons().add(icon);

        __CLR4_3_1ememk2rvch0n.R.inc(532);Pane layout = new Pane();

        __CLR4_3_1ememk2rvch0n.R.inc(533);Scene scene = new Scene(layout, 550, 400);

        __CLR4_3_1ememk2rvch0n.R.inc(534);primaryStage.setScene(scene);
        __CLR4_3_1ememk2rvch0n.R.inc(535);primaryStage.show();

        __CLR4_3_1ememk2rvch0n.R.inc(536);info.setLayoutX(100);
        __CLR4_3_1ememk2rvch0n.R.inc(537);info.setLayoutY(20);
        __CLR4_3_1ememk2rvch0n.R.inc(538);felhasznalonev.setLayoutX(80);
        __CLR4_3_1ememk2rvch0n.R.inc(539);felhasznalonev.setLayoutY(90);
        __CLR4_3_1ememk2rvch0n.R.inc(540);email.setLayoutX(80);
        __CLR4_3_1ememk2rvch0n.R.inc(541);email.setLayoutY(130);
        __CLR4_3_1ememk2rvch0n.R.inc(542);jelszo.setLayoutX(80);
        __CLR4_3_1ememk2rvch0n.R.inc(543);jelszo.setLayoutY(170);
        __CLR4_3_1ememk2rvch0n.R.inc(544);jelszo2.setLayoutX(80);
        __CLR4_3_1ememk2rvch0n.R.inc(545);jelszo2.setLayoutY(210);

        __CLR4_3_1ememk2rvch0n.R.inc(546);felhasznalonevText.setLayoutX(200);
        __CLR4_3_1ememk2rvch0n.R.inc(547);felhasznalonevText.setLayoutY(90);
        __CLR4_3_1ememk2rvch0n.R.inc(548);felhasznalonevText.setPrefWidth(250);
        __CLR4_3_1ememk2rvch0n.R.inc(549);emailText.setLayoutX(200);
        __CLR4_3_1ememk2rvch0n.R.inc(550);emailText.setLayoutY(130);
        __CLR4_3_1ememk2rvch0n.R.inc(551);emailText.setPrefWidth(250);
        __CLR4_3_1ememk2rvch0n.R.inc(552);jelszoText.setLayoutX(200);
        __CLR4_3_1ememk2rvch0n.R.inc(553);jelszoText.setLayoutY(170);
        __CLR4_3_1ememk2rvch0n.R.inc(554);jelszoText.setPrefWidth(250);
        __CLR4_3_1ememk2rvch0n.R.inc(555);jelszo2Text.setLayoutX(200);
        __CLR4_3_1ememk2rvch0n.R.inc(556);jelszo2Text.setLayoutY(210);
        __CLR4_3_1ememk2rvch0n.R.inc(557);jelszo2Text.setPrefWidth(250);

        __CLR4_3_1ememk2rvch0n.R.inc(558);regisztracio.setLayoutX(80);
        __CLR4_3_1ememk2rvch0n.R.inc(559);regisztracio.setLayoutY(300);
        __CLR4_3_1ememk2rvch0n.R.inc(560);regisztracio.setPrefWidth(150);

        __CLR4_3_1ememk2rvch0n.R.inc(561);megse.setLayoutX(350);
        __CLR4_3_1ememk2rvch0n.R.inc(562);megse.setLayoutY(300);
        __CLR4_3_1ememk2rvch0n.R.inc(563);megse.setPrefWidth(100);

        __CLR4_3_1ememk2rvch0n.R.inc(564);layout.getChildren().add(regisztracio);
        __CLR4_3_1ememk2rvch0n.R.inc(565);layout.getChildren().add(megse);

        __CLR4_3_1ememk2rvch0n.R.inc(566);layout.getChildren().add(info);
        __CLR4_3_1ememk2rvch0n.R.inc(567);layout.getChildren().add(felhasznalonev);
        __CLR4_3_1ememk2rvch0n.R.inc(568);layout.getChildren().add(email);
        __CLR4_3_1ememk2rvch0n.R.inc(569);layout.getChildren().add(jelszo);
        __CLR4_3_1ememk2rvch0n.R.inc(570);layout.getChildren().add(jelszo2);

        __CLR4_3_1ememk2rvch0n.R.inc(571);layout.getChildren().add(felhasznalonevText);
        __CLR4_3_1ememk2rvch0n.R.inc(572);layout.getChildren().add(emailText);
        __CLR4_3_1ememk2rvch0n.R.inc(573);layout.getChildren().add(jelszoText);
        __CLR4_3_1ememk2rvch0n.R.inc(574);layout.getChildren().add(jelszo2Text);

        __CLR4_3_1ememk2rvch0n.R.inc(575);regisztracio.setOnAction(registration::handle);
        __CLR4_3_1ememk2rvch0n.R.inc(576);megse.setOnAction(registration::handle);

    }finally{__CLR4_3_1ememk2rvch0n.R.flushNeeded();}}

    public static void handle(ActionEvent actionEvent)
    {try{__CLR4_3_1ememk2rvch0n.R.inc(577);
        __CLR4_3_1ememk2rvch0n.R.inc(578);if((((actionEvent.getSource() == megse)&&(__CLR4_3_1ememk2rvch0n.R.iget(579)!=0|true))||(__CLR4_3_1ememk2rvch0n.R.iget(580)==0&false)))
        {{
            __CLR4_3_1ememk2rvch0n.R.inc(581);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_1ememk2rvch0n.R.inc(582);registrationController.loginShow();
        }

    }}finally{__CLR4_3_1ememk2rvch0n.R.flushNeeded();}}
}
