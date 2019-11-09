/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * A kosar tartalmat felsorakoztato GUI, a vasarlas elotti utolso alkalom ahol adhat hozza, de mar csak
 * mennyisegbeli valtoztatast enged, vagy teljes tetelek kivetelet a kosarbol.
 * A **perconailInfo** ablakra visz at.
 */
public class cartOverview
{public static class __CLR4_3_11414k2rvcgp5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    Label veglegesites = new Label("A kos\u00e1r v\u00e9gleges\u00edt\u00e9se");
    Label ellenorzes = new Label("K\u00e9rj\u00fck ellen\u0151rizze a kos\u00e1r tartalm\u00e1t!");

    static Button vasarlas = new Button("V\u00e1s\u00e1rl\u00e1s");
    static Button vissza = new Button("Vissza");

    Rectangle termekhelye = new Rectangle(40,100,80,80);
    Rectangle termekhelye1 = new Rectangle(40,220,80,80);
    Rectangle termekhelye2= new Rectangle(40, 340, 80, 80);

    Label termekneve = new Label("A term\u00e9k neve");
    Label termekneve1 = new Label("A term\u00e9k neve");
    Label termekneve2 = new Label("A term\u00e9k neve");

    Button eltavolitas = new Button("Elt\u00e1vol\u00edt\u00e1s");


    public void cartOverViewShow(){try{__CLR4_3_11414k2rvcgp5.R.inc(40);

        __CLR4_3_11414k2rvcgp5.R.inc(41);Stage primaryStage = new Stage();
        __CLR4_3_11414k2rvcgp5.R.inc(42);primaryStage.setTitle("The Snail Sale - A kos\u00e1r v\u00e9gleges\u00edt\u00e9se");
        __CLR4_3_11414k2rvcgp5.R.inc(43);primaryStage.setResizable(false);

        __CLR4_3_11414k2rvcgp5.R.inc(44);Image icon = new Image("./icon.jpg");
        __CLR4_3_11414k2rvcgp5.R.inc(45);primaryStage.getIcons().add(icon);

        __CLR4_3_11414k2rvcgp5.R.inc(46);Pane layout = new Pane();

        __CLR4_3_11414k2rvcgp5.R.inc(47);Scene scene = new Scene(layout, 550, 500);

        __CLR4_3_11414k2rvcgp5.R.inc(48);primaryStage.setScene(scene);
        __CLR4_3_11414k2rvcgp5.R.inc(49);primaryStage.show();

        __CLR4_3_11414k2rvcgp5.R.inc(50);veglegesites.setLayoutX(200);
        __CLR4_3_11414k2rvcgp5.R.inc(51);veglegesites.setLayoutY(20);
        __CLR4_3_11414k2rvcgp5.R.inc(52);ellenorzes.setLayoutX(160);
        __CLR4_3_11414k2rvcgp5.R.inc(53);ellenorzes.setLayoutY(40);
        __CLR4_3_11414k2rvcgp5.R.inc(54);vissza.setLayoutX(30);
        __CLR4_3_11414k2rvcgp5.R.inc(55);vissza.setLayoutY(30);
        __CLR4_3_11414k2rvcgp5.R.inc(56);vissza.setPrefWidth(100);
        __CLR4_3_11414k2rvcgp5.R.inc(57);vasarlas.setLayoutX(400);
        __CLR4_3_11414k2rvcgp5.R.inc(58);vasarlas.setLayoutY(30);
        __CLR4_3_11414k2rvcgp5.R.inc(59);vasarlas.setPrefWidth(100);

        __CLR4_3_11414k2rvcgp5.R.inc(60);eltavolitas.setLayoutX(410);
        __CLR4_3_11414k2rvcgp5.R.inc(61);eltavolitas.setLayoutY(100);
        __CLR4_3_11414k2rvcgp5.R.inc(62);eltavolitas.setPrefWidth(80);

        __CLR4_3_11414k2rvcgp5.R.inc(63);termekneve.setLayoutX(140);
        __CLR4_3_11414k2rvcgp5.R.inc(64);termekneve.setLayoutY(100);

        __CLR4_3_11414k2rvcgp5.R.inc(65);termekneve1.setLayoutX(140);
        __CLR4_3_11414k2rvcgp5.R.inc(66);termekneve1.setLayoutY(220);

        __CLR4_3_11414k2rvcgp5.R.inc(67);termekneve2.setLayoutX(140);
        __CLR4_3_11414k2rvcgp5.R.inc(68);termekneve2.setLayoutY(340);

        __CLR4_3_11414k2rvcgp5.R.inc(69);termekhelye.setFill(null);
        __CLR4_3_11414k2rvcgp5.R.inc(70);termekhelye.setStroke(Color.GRAY);
        __CLR4_3_11414k2rvcgp5.R.inc(71);termekhelye.setStrokeWidth(3);

        __CLR4_3_11414k2rvcgp5.R.inc(72);termekhelye1.setFill(null);
        __CLR4_3_11414k2rvcgp5.R.inc(73);termekhelye1.setStroke(Color.GRAY);
        __CLR4_3_11414k2rvcgp5.R.inc(74);termekhelye1.setStrokeWidth(3);

        __CLR4_3_11414k2rvcgp5.R.inc(75);termekhelye2.setFill(null);
        __CLR4_3_11414k2rvcgp5.R.inc(76);termekhelye2.setStroke(Color.GRAY);
        __CLR4_3_11414k2rvcgp5.R.inc(77);termekhelye2.setStrokeWidth(3);

        __CLR4_3_11414k2rvcgp5.R.inc(78);layout.getChildren().add(vasarlas);
        __CLR4_3_11414k2rvcgp5.R.inc(79);layout.getChildren().add(vissza);
        __CLR4_3_11414k2rvcgp5.R.inc(80);layout.getChildren().add(eltavolitas);

        __CLR4_3_11414k2rvcgp5.R.inc(81);layout.getChildren().add(veglegesites);
        __CLR4_3_11414k2rvcgp5.R.inc(82);layout.getChildren().add(ellenorzes);
        __CLR4_3_11414k2rvcgp5.R.inc(83);layout.getChildren().add(termekhelye);
        __CLR4_3_11414k2rvcgp5.R.inc(84);layout.getChildren().add(termekhelye1);
        __CLR4_3_11414k2rvcgp5.R.inc(85);layout.getChildren().add(termekhelye2);
        __CLR4_3_11414k2rvcgp5.R.inc(86);layout.getChildren().add(termekneve);
        __CLR4_3_11414k2rvcgp5.R.inc(87);layout.getChildren().add(termekneve1);
        __CLR4_3_11414k2rvcgp5.R.inc(88);layout.getChildren().add(termekneve2);

        __CLR4_3_11414k2rvcgp5.R.inc(89);vasarlas.setOnAction(cartOverview::handle);
        __CLR4_3_11414k2rvcgp5.R.inc(90);vissza.setOnAction(cartOverview::handle);

    }finally{__CLR4_3_11414k2rvcgp5.R.flushNeeded();}}
        public static void handle(ActionEvent actionEvent)
        {try{__CLR4_3_11414k2rvcgp5.R.inc(91);
            __CLR4_3_11414k2rvcgp5.R.inc(92);if((((actionEvent.getSource() == vasarlas)&&(__CLR4_3_11414k2rvcgp5.R.iget(93)!=0|true))||(__CLR4_3_11414k2rvcgp5.R.iget(94)==0&false)))
            {{
                __CLR4_3_11414k2rvcgp5.R.inc(95);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
                __CLR4_3_11414k2rvcgp5.R.inc(96);cartOverviewController.personalInfoShow();
            }

            }__CLR4_3_11414k2rvcgp5.R.inc(97);if((((actionEvent.getSource() == vissza )&&(__CLR4_3_11414k2rvcgp5.R.iget(98)!=0|true))||(__CLR4_3_11414k2rvcgp5.R.iget(99)==0&false)))
            {{
                __CLR4_3_11414k2rvcgp5.R.inc(100);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
                __CLR4_3_11414k2rvcgp5.R.inc(101);cartOverviewController.mainPageShow();
            }
        }}finally{__CLR4_3_11414k2rvcgp5.R.flushNeeded();}}
}