/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * A kosar, es annak tartalmat mutato GUI-ablak.
 */
public class cart
{public static class __CLR4_3_100k2rvcgnf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,34,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static Button penztarhoz = new Button("P\u00e9nzt\u00e1rhoz");
    static Button vissza = new Button("Vissza");

    Label info = new Label("A kos\u00e1r tartalma: ");


    public void cartShow()
    {try{__CLR4_3_100k2rvcgnf.R.inc(0);
        __CLR4_3_100k2rvcgnf.R.inc(1);Stage primaryStage = new Stage();
        __CLR4_3_100k2rvcgnf.R.inc(2);primaryStage.setTitle("The Snail Sale - Kos\u00e1r");
        __CLR4_3_100k2rvcgnf.R.inc(3);primaryStage.setResizable(false);

        __CLR4_3_100k2rvcgnf.R.inc(4);javafx.scene.image.Image icon = new Image("./icon.jpg");
        __CLR4_3_100k2rvcgnf.R.inc(5);primaryStage.getIcons().add(icon);

        __CLR4_3_100k2rvcgnf.R.inc(6);Pane layout = new Pane();

        __CLR4_3_100k2rvcgnf.R.inc(7);Scene scene = new Scene(layout, 550, 400);

        __CLR4_3_100k2rvcgnf.R.inc(8);primaryStage.setScene(scene);

        __CLR4_3_100k2rvcgnf.R.inc(9);primaryStage.show();

        __CLR4_3_100k2rvcgnf.R.inc(10);info.setLayoutX(200);
        __CLR4_3_100k2rvcgnf.R.inc(11);info.setLayoutY(20);
        __CLR4_3_100k2rvcgnf.R.inc(12);penztarhoz.setLayoutX(80);
        __CLR4_3_100k2rvcgnf.R.inc(13);penztarhoz.setLayoutY(80);
        __CLR4_3_100k2rvcgnf.R.inc(14);penztarhoz.setPrefWidth(80);
        __CLR4_3_100k2rvcgnf.R.inc(15);vissza.setLayoutX(400);
        __CLR4_3_100k2rvcgnf.R.inc(16);vissza.setLayoutY(80);
        __CLR4_3_100k2rvcgnf.R.inc(17);vissza.setPrefWidth(70);

        __CLR4_3_100k2rvcgnf.R.inc(18);layout.getChildren().add(penztarhoz);
        __CLR4_3_100k2rvcgnf.R.inc(19);layout.getChildren().add(vissza);

        __CLR4_3_100k2rvcgnf.R.inc(20);layout.getChildren().add(info);

        __CLR4_3_100k2rvcgnf.R.inc(21);penztarhoz.setOnAction(cart::handle);
        __CLR4_3_100k2rvcgnf.R.inc(22);vissza.setOnAction(cart::handle);
    }finally{__CLR4_3_100k2rvcgnf.R.flushNeeded();}}

    public static void handle(ActionEvent actionEvent)
    {try{__CLR4_3_100k2rvcgnf.R.inc(23);
        __CLR4_3_100k2rvcgnf.R.inc(24);if((((actionEvent.getSource() == penztarhoz)&&(__CLR4_3_100k2rvcgnf.R.iget(25)!=0|true))||(__CLR4_3_100k2rvcgnf.R.iget(26)==0&false)))
        {{
            __CLR4_3_100k2rvcgnf.R.inc(27);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_100k2rvcgnf.R.inc(28);cartController.personalInfoShow();
        }

        }__CLR4_3_100k2rvcgnf.R.inc(29);if((((actionEvent.getSource() == vissza)&&(__CLR4_3_100k2rvcgnf.R.iget(30)!=0|true))||(__CLR4_3_100k2rvcgnf.R.iget(31)==0&false)))
        {{
            __CLR4_3_100k2rvcgnf.R.inc(32);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_100k2rvcgnf.R.inc(33);cartController.mainPageShow();
        }
    }}finally{__CLR4_3_100k2rvcgnf.R.flushNeeded();}}
}
