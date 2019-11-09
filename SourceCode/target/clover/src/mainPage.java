/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class mainPage extends Application implements EventHandler<ActionEvent>
{public static class __CLR4_3_14x4xk2rvcguo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    Stage mainPageStage = new Stage();

    Button bejelentkezes = new Button("Bejelentkez\u00e9s");
    Button vasarlashoz = new Button("Tov\u00e1bb a v\u00e1s\u00e1rl\u00e1hoz!");
    Button kereses = new Button("Keres\u00e9s!");
    Button elozo = new Button("El\u0151z\u0151");
    Button kovetkezo = new Button("K\u00f6vetkez\u0151");
    Button kosar = new Button("Kos\u00e1r");
    Button kosarba = new Button("Kos\u00e1rba teszem");
    Button ertekel = new Button("\u00c9rt\u00e9kelem!");

    Label kosarTartalma = new Label("Kos\u00e1r Tartalma:");
    Label bejelentkezettNeve = new Label("Nincs bejelentkezve!");
    Label talalatokSzama = new Label("Tal\u00e1latok sz\u00e1ma:");
    Label termekadat1 = new Label("Termekadat:");
    Label termekadat2 = new Label("Termekadat:");
    Label termekadat3 = new Label("Termekadat:");
    Label termekadat4 = new Label("Termekadat:");
    Label ertekeloLabel = new Label("\u00c9rt\u00e9kelje a term\u00e9ket!");

    RadioButton nevSzerint = new RadioButton("N\u00e9v szerinti keres\u00e9s");
    RadioButton arSzerint = new RadioButton("\u00c1r szerinti keres\u00e9s");
    RadioButton ertekelesSzerint = new RadioButton("\u00c9rtekel\u00e9s szerinti keres\u00e9s");
    RadioButton ertekelo1 = new RadioButton("1");
    RadioButton ertekelo2 = new RadioButton("2");
    RadioButton ertekelo3 = new RadioButton("3");
    RadioButton ertekelo4 = new RadioButton("4");
    RadioButton ertekelo5 = new RadioButton("5");

    ComboBox rendezes = new ComboBox();
    ComboBox keresesEredmenye = new ComboBox();

    TextField keresoSzoveg = new TextField();
    public static TextField aruInfo = new TextField();

    Rectangle rectangle = new Rectangle(240,70,500,400);
    Rectangle rectangle1 = new Rectangle(240,70,250,200);

    ToggleGroup keresoGroup = new ToggleGroup();
    ToggleGroup ertekeloGroup = new ToggleGroup();
    /*
    * A kepek megjelenitesehez meg kell vmi-
    * */

    public void mainPageShow()
    {try{__CLR4_3_14x4xk2rvcguo.R.inc(177);
        __CLR4_3_14x4xk2rvcguo.R.inc(178);start(mainPageStage);
    }finally{__CLR4_3_14x4xk2rvcguo.R.flushNeeded();}}

    @Override
    public void start(Stage primaryStage)
    {try{__CLR4_3_14x4xk2rvcguo.R.inc(179);
        __CLR4_3_14x4xk2rvcguo.R.inc(180);database.Connect();
        __CLR4_3_14x4xk2rvcguo.R.inc(181);primaryStage.setTitle("The Snail Sale");
        __CLR4_3_14x4xk2rvcguo.R.inc(182);primaryStage.setResizable(false);
        __CLR4_3_14x4xk2rvcguo.R.inc(183);Image icon = new Image("./icon.jpg");
        __CLR4_3_14x4xk2rvcguo.R.inc(184);primaryStage.getIcons().add(icon);

        __CLR4_3_14x4xk2rvcguo.R.inc(185);Pane layout = new Pane();

        __CLR4_3_14x4xk2rvcguo.R.inc(186);Scene scene = new Scene(layout, 950, 650);
        __CLR4_3_14x4xk2rvcguo.R.inc(187);primaryStage.setScene(scene);
        __CLR4_3_14x4xk2rvcguo.R.inc(188);primaryStage.show();

        __CLR4_3_14x4xk2rvcguo.R.inc(189);rectangle.setFill(null);
        __CLR4_3_14x4xk2rvcguo.R.inc(190);rectangle.setStroke(Color.GRAY);
        __CLR4_3_14x4xk2rvcguo.R.inc(191);rectangle.setStrokeWidth(3);

        __CLR4_3_14x4xk2rvcguo.R.inc(192);rectangle1.setFill(null);
        __CLR4_3_14x4xk2rvcguo.R.inc(193);rectangle1.setStroke(Color.GRAY);
        __CLR4_3_14x4xk2rvcguo.R.inc(194);rectangle1.setStrokeWidth(3);

        __CLR4_3_14x4xk2rvcguo.R.inc(195);keresoSzoveg.setLayoutX(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(196);keresoSzoveg.setLayoutY(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(197);keresoSzoveg.setPrefWidth(200);
        __CLR4_3_14x4xk2rvcguo.R.inc(198);keresoSzoveg.setPromptText("Irja be a keresni k\u00edv\u00e1nt kifejez\u00e9st");

        __CLR4_3_14x4xk2rvcguo.R.inc(199);nevSzerint.setLayoutX(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(200);nevSzerint.setLayoutY(60);
        __CLR4_3_14x4xk2rvcguo.R.inc(201);nevSzerint.setToggleGroup(keresoGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(202);arSzerint.setLayoutX(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(203);arSzerint.setLayoutY(110);
        __CLR4_3_14x4xk2rvcguo.R.inc(204);arSzerint.setToggleGroup(keresoGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(205);ertekelesSzerint.setLayoutX(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(206);ertekelesSzerint.setLayoutY(160);
        __CLR4_3_14x4xk2rvcguo.R.inc(207);ertekelesSzerint.setToggleGroup(keresoGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(208);kereses.setLayoutX(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(209);kereses.setLayoutY(210);

        __CLR4_3_14x4xk2rvcguo.R.inc(210);keresesEredmenye.setLayoutX(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(211);keresesEredmenye.setLayoutY(260);
        __CLR4_3_14x4xk2rvcguo.R.inc(212);keresesEredmenye.setPrefWidth(200);
        __CLR4_3_14x4xk2rvcguo.R.inc(213);keresesEredmenye.setPromptText("Keres\u00e9s eredm\u00e9nye:");

        __CLR4_3_14x4xk2rvcguo.R.inc(214);rendezes.setLayoutX(240);
        __CLR4_3_14x4xk2rvcguo.R.inc(215);rendezes.setLayoutY(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(216);rendezes.setPromptText("Eredm\u00e9ny rendez\u00e9se..");
        __CLR4_3_14x4xk2rvcguo.R.inc(217);rendezes.getItems().addAll("N\u00e9v szerint n\u00f6vekv\u0151",
                "N\u00e9v szerint cs\u00f6kken\u0151",
                "\u00c1r szerint n\u00f6vekv\u0151",
                "\u00c1r szerint cs\u00f6kken\u0151");

        __CLR4_3_14x4xk2rvcguo.R.inc(218);kosarTartalma.setLayoutX(600);
        __CLR4_3_14x4xk2rvcguo.R.inc(219);kosarTartalma.setLayoutY(10);

        __CLR4_3_14x4xk2rvcguo.R.inc(220);kosar.setLayoutX(600);
        __CLR4_3_14x4xk2rvcguo.R.inc(221);kosar.setLayoutY(30);

        __CLR4_3_14x4xk2rvcguo.R.inc(222);termekadat1.setLayoutX(500);
        __CLR4_3_14x4xk2rvcguo.R.inc(223);termekadat1.setLayoutY(90);

        __CLR4_3_14x4xk2rvcguo.R.inc(224);termekadat2.setLayoutX(500);
        __CLR4_3_14x4xk2rvcguo.R.inc(225);termekadat2.setLayoutY(120);

        __CLR4_3_14x4xk2rvcguo.R.inc(226);termekadat3.setLayoutX(500);
        __CLR4_3_14x4xk2rvcguo.R.inc(227);termekadat3.setLayoutY(150);

        __CLR4_3_14x4xk2rvcguo.R.inc(228);termekadat4.setLayoutX(500);
        __CLR4_3_14x4xk2rvcguo.R.inc(229);termekadat4.setLayoutY(180);

        __CLR4_3_14x4xk2rvcguo.R.inc(230);kosarba.setLayoutX(620);
        __CLR4_3_14x4xk2rvcguo.R.inc(231);kosarba.setLayoutY(280);

        __CLR4_3_14x4xk2rvcguo.R.inc(232);elozo.setLayoutX(245);
        __CLR4_3_14x4xk2rvcguo.R.inc(233);elozo.setLayoutY(280);
        __CLR4_3_14x4xk2rvcguo.R.inc(234);elozo.setPrefWidth(70);

        __CLR4_3_14x4xk2rvcguo.R.inc(235);kovetkezo.setLayoutX(320);
        __CLR4_3_14x4xk2rvcguo.R.inc(236);kovetkezo.setLayoutY(280);
        __CLR4_3_14x4xk2rvcguo.R.inc(237);kovetkezo.setPrefWidth(100);

        __CLR4_3_14x4xk2rvcguo.R.inc(238);talalatokSzama.setLayoutX(430);
        __CLR4_3_14x4xk2rvcguo.R.inc(239);talalatokSzama.setLayoutY(280);

        __CLR4_3_14x4xk2rvcguo.R.inc(240);aruInfo.setLayoutX(245);
        __CLR4_3_14x4xk2rvcguo.R.inc(241);aruInfo.setLayoutY(320);
        __CLR4_3_14x4xk2rvcguo.R.inc(242);aruInfo.setPrefWidth(490);
        __CLR4_3_14x4xk2rvcguo.R.inc(243);aruInfo.setPrefHeight(125);
        __CLR4_3_14x4xk2rvcguo.R.inc(244);aruInfo.setEditable(false);

        __CLR4_3_14x4xk2rvcguo.R.inc(245);bejelentkezes.setLayoutX(800);
        __CLR4_3_14x4xk2rvcguo.R.inc(246);bejelentkezes.setLayoutY(10);
        __CLR4_3_14x4xk2rvcguo.R.inc(247);bejelentkezes.setPrefWidth(120);

        __CLR4_3_14x4xk2rvcguo.R.inc(248);bejelentkezettNeve.setLayoutX(800);
        __CLR4_3_14x4xk2rvcguo.R.inc(249);bejelentkezettNeve.setLayoutY(50);

        __CLR4_3_14x4xk2rvcguo.R.inc(250);ertekeloLabel.setLayoutX(790);
        __CLR4_3_14x4xk2rvcguo.R.inc(251);ertekeloLabel.setLayoutY(140);

        __CLR4_3_14x4xk2rvcguo.R.inc(252);ertekelo1.setLayoutX(750);
        __CLR4_3_14x4xk2rvcguo.R.inc(253);ertekelo1.setLayoutY(170);
        __CLR4_3_14x4xk2rvcguo.R.inc(254);ertekelo1.setToggleGroup(ertekeloGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(255);ertekelo2.setLayoutX(790);
        __CLR4_3_14x4xk2rvcguo.R.inc(256);ertekelo2.setLayoutY(170);
        __CLR4_3_14x4xk2rvcguo.R.inc(257);ertekelo2.setToggleGroup(ertekeloGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(258);ertekelo3.setLayoutX(830);
        __CLR4_3_14x4xk2rvcguo.R.inc(259);ertekelo3.setLayoutY(170);
        __CLR4_3_14x4xk2rvcguo.R.inc(260);ertekelo3.setToggleGroup(ertekeloGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(261);ertekelo4.setLayoutX(870);
        __CLR4_3_14x4xk2rvcguo.R.inc(262);ertekelo4.setLayoutY(170);
        __CLR4_3_14x4xk2rvcguo.R.inc(263);ertekelo4.setToggleGroup(ertekeloGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(264);ertekelo5.setLayoutX(910);
        __CLR4_3_14x4xk2rvcguo.R.inc(265);ertekelo5.setLayoutY(170);
        __CLR4_3_14x4xk2rvcguo.R.inc(266);ertekelo5.setToggleGroup(ertekeloGroup);

        __CLR4_3_14x4xk2rvcguo.R.inc(267);ertekel.setLayoutX(750);
        __CLR4_3_14x4xk2rvcguo.R.inc(268);ertekel.setLayoutY(200);
        __CLR4_3_14x4xk2rvcguo.R.inc(269);ertekel.setPrefWidth(190);

        __CLR4_3_14x4xk2rvcguo.R.inc(270);vasarlashoz.setLayoutX(750);
        __CLR4_3_14x4xk2rvcguo.R.inc(271);vasarlashoz.setLayoutY(320);
        __CLR4_3_14x4xk2rvcguo.R.inc(272);vasarlashoz.setPrefWidth(190);
        __CLR4_3_14x4xk2rvcguo.R.inc(273);vasarlashoz.setPrefHeight(100);



        __CLR4_3_14x4xk2rvcguo.R.inc(274);layout.getChildren().add(rectangle);
        __CLR4_3_14x4xk2rvcguo.R.inc(275);layout.getChildren().add(rectangle1);

        /*Buttons*/
        __CLR4_3_14x4xk2rvcguo.R.inc(276);layout.getChildren().add(bejelentkezes);
        __CLR4_3_14x4xk2rvcguo.R.inc(277);layout.getChildren().add(vasarlashoz);
        __CLR4_3_14x4xk2rvcguo.R.inc(278);layout.getChildren().add(kereses);
        __CLR4_3_14x4xk2rvcguo.R.inc(279);layout.getChildren().add(elozo);
        __CLR4_3_14x4xk2rvcguo.R.inc(280);layout.getChildren().add(kovetkezo);
        __CLR4_3_14x4xk2rvcguo.R.inc(281);layout.getChildren().add(kosar);
        __CLR4_3_14x4xk2rvcguo.R.inc(282);layout.getChildren().add(kosarba);
        __CLR4_3_14x4xk2rvcguo.R.inc(283);layout.getChildren().add(ertekel);

        /*Labels*/
        __CLR4_3_14x4xk2rvcguo.R.inc(284);layout.getChildren().add(kosarTartalma);
        __CLR4_3_14x4xk2rvcguo.R.inc(285);layout.getChildren().add(bejelentkezettNeve);
        __CLR4_3_14x4xk2rvcguo.R.inc(286);layout.getChildren().add(talalatokSzama);
        __CLR4_3_14x4xk2rvcguo.R.inc(287);layout.getChildren().add(termekadat1);
        __CLR4_3_14x4xk2rvcguo.R.inc(288);layout.getChildren().add(termekadat2);
        __CLR4_3_14x4xk2rvcguo.R.inc(289);layout.getChildren().add(termekadat3);
        __CLR4_3_14x4xk2rvcguo.R.inc(290);layout.getChildren().add(termekadat4);
        __CLR4_3_14x4xk2rvcguo.R.inc(291);layout.getChildren().add(ertekeloLabel);

        /*RadioButtons*/
        __CLR4_3_14x4xk2rvcguo.R.inc(292);layout.getChildren().add(nevSzerint);
        __CLR4_3_14x4xk2rvcguo.R.inc(293);layout.getChildren().add(arSzerint);
        __CLR4_3_14x4xk2rvcguo.R.inc(294);layout.getChildren().add(ertekelesSzerint);
        __CLR4_3_14x4xk2rvcguo.R.inc(295);layout.getChildren().add(ertekelo1);
        __CLR4_3_14x4xk2rvcguo.R.inc(296);layout.getChildren().add(ertekelo2);
        __CLR4_3_14x4xk2rvcguo.R.inc(297);layout.getChildren().add(ertekelo3);
        __CLR4_3_14x4xk2rvcguo.R.inc(298);layout.getChildren().add(ertekelo4);
        __CLR4_3_14x4xk2rvcguo.R.inc(299);layout.getChildren().add(ertekelo5);

        /*ComboBoxes*/
        __CLR4_3_14x4xk2rvcguo.R.inc(300);layout.getChildren().add(rendezes);
        __CLR4_3_14x4xk2rvcguo.R.inc(301);layout.getChildren().add(keresesEredmenye);

        /*TextFields*/
        __CLR4_3_14x4xk2rvcguo.R.inc(302);layout.getChildren().add(keresoSzoveg);
        __CLR4_3_14x4xk2rvcguo.R.inc(303);layout.getChildren().add(aruInfo);

        /*InputHandling*/
        __CLR4_3_14x4xk2rvcguo.R.inc(304);bejelentkezes.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(305);vasarlashoz.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(306);kereses.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(307);elozo.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(308);kovetkezo.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(309);kosar.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(310);kosarba.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(311);ertekel.setOnAction(this);

        __CLR4_3_14x4xk2rvcguo.R.inc(312);nevSzerint.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(313);arSzerint.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(314);ertekelesSzerint.setOnAction(this);

        __CLR4_3_14x4xk2rvcguo.R.inc(315);rendezes.setOnAction(this);
        __CLR4_3_14x4xk2rvcguo.R.inc(316);keresesEredmenye.setOnAction(this);
    }finally{__CLR4_3_14x4xk2rvcguo.R.flushNeeded();}}

    @Override
    public void handle(ActionEvent actionEvent)
    {try{__CLR4_3_14x4xk2rvcguo.R.inc(317);
        __CLR4_3_14x4xk2rvcguo.R.inc(318);if ((((actionEvent.getSource() == bejelentkezes)&&(__CLR4_3_14x4xk2rvcguo.R.iget(319)!=0|true))||(__CLR4_3_14x4xk2rvcguo.R.iget(320)==0&false)))
        {{
            __CLR4_3_14x4xk2rvcguo.R.inc(321);mainPageController.loginShow();
        }
        }__CLR4_3_14x4xk2rvcguo.R.inc(322);if((((actionEvent.getSource() == vasarlashoz)&&(__CLR4_3_14x4xk2rvcguo.R.iget(323)!=0|true))||(__CLR4_3_14x4xk2rvcguo.R.iget(324)==0&false)))
        {{
            __CLR4_3_14x4xk2rvcguo.R.inc(325);((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            __CLR4_3_14x4xk2rvcguo.R.inc(326);mainPageController.cartOverwiewShow();
        }
        }__CLR4_3_14x4xk2rvcguo.R.inc(327);if((((actionEvent.getSource() == kosar)&&(__CLR4_3_14x4xk2rvcguo.R.iget(328)!=0|true))||(__CLR4_3_14x4xk2rvcguo.R.iget(329)==0&false)))
        {{
            __CLR4_3_14x4xk2rvcguo.R.inc(330);mainPageController.cartShow();
        }
        }__CLR4_3_14x4xk2rvcguo.R.inc(331);if((((actionEvent.getSource() == kereses)&&(__CLR4_3_14x4xk2rvcguo.R.iget(332)!=0|true))||(__CLR4_3_14x4xk2rvcguo.R.iget(333)==0&false)))
        {{
            __CLR4_3_14x4xk2rvcguo.R.inc(334);database.Query();
        }
    }}finally{__CLR4_3_14x4xk2rvcguo.R.flushNeeded();}}
}
