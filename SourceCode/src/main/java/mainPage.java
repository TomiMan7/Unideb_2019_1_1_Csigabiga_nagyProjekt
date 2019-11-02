import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class mainPage extends Application implements EventHandler<ActionEvent>
{

    Stage mainPageStage = new Stage();

    Button bejelentkezes = new Button("Bejelentkezés");
    Button vasarlashoz = new Button("Tovább a vásárlához!");
    Button kereses = new Button("Keresés!");
    Button elozo = new Button("Előző");
    Button kovetkezo = new Button("Következő");
    Button kosar = new Button("Kosár");
    Button kosarba = new Button("Kosárba teszem");
    Button ertekel = new Button("Értékelem!");

    Label kosarTartalma = new Label("Kosár Tartalma:");
    Label bejelentkezettNeve = new Label("Nincs bejelentkezve!");
    Label talalatokSzama = new Label("Találatok száma:");
    Label termekadat1 = new Label("Termekadat:");
    Label termekadat2 = new Label("Termekadat:");
    Label termekadat3 = new Label("Termekadat:");
    Label termekadat4 = new Label("Termekadat:");
    Label ertekeloLabel = new Label("Értékelje a terméket!");

    RadioButton nevSzerint = new RadioButton("Név szerinti keresés");
    RadioButton arSzerint = new RadioButton("Ár szerinti keresés");
    RadioButton ertekelesSzerint = new RadioButton("Értekelés szerinti keresés");
    RadioButton ertekelo1 = new RadioButton("1");
    RadioButton ertekelo2 = new RadioButton("2");
    RadioButton ertekelo3 = new RadioButton("3");
    RadioButton ertekelo4 = new RadioButton("4");
    RadioButton ertekelo5 = new RadioButton("5");

    ComboBox rendezes = new ComboBox();
    ComboBox keresesEredmenye = new ComboBox();

    TextField keresoSzoveg = new TextField();
    TextField aruInfo = new TextField();

    Rectangle rectangle = new Rectangle(240,70,500,400);
    Rectangle rectangle1 = new Rectangle(240,70,250,200);

    ToggleGroup keresoGroup = new ToggleGroup();
    ToggleGroup ertekeloGroup = new ToggleGroup();
    /*
    * A kepek megjelenitesehez meg kell vmi-
    * */

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("The Snail Sale");
        primaryStage.setResizable(false);
        Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 950, 650);
        primaryStage.setScene(scene);
        primaryStage.show();

        rectangle.setFill(null);
        rectangle.setStroke(Color.GRAY);
        rectangle.setStrokeWidth(3);

        rectangle1.setFill(null);
        rectangle1.setStroke(Color.GRAY);
        rectangle1.setStrokeWidth(3);

        keresoSzoveg.setLayoutX(10);
        keresoSzoveg.setLayoutY(10);
        keresoSzoveg.setPrefWidth(200);
        keresoSzoveg.setPromptText("Irja be a keresni kívánt kifejezést");

        nevSzerint.setLayoutX(10);
        nevSzerint.setLayoutY(60);
        nevSzerint.setToggleGroup(keresoGroup);

        arSzerint.setLayoutX(10);
        arSzerint.setLayoutY(110);
        arSzerint.setToggleGroup(keresoGroup);

        ertekelesSzerint.setLayoutX(10);
        ertekelesSzerint.setLayoutY(160);
        ertekelesSzerint.setToggleGroup(keresoGroup);

        kereses.setLayoutX(10);
        kereses.setLayoutY(210);

        keresesEredmenye.setLayoutX(10);
        keresesEredmenye.setLayoutY(260);
        keresesEredmenye.setPrefWidth(200);
        keresesEredmenye.setPromptText("Keresés eredménye:");

        rendezes.setLayoutX(240);
        rendezes.setLayoutY(10);
        rendezes.setPromptText("Eredmény rendezése..");
        rendezes.getItems().addAll("Név szerint növekvő",
                "Név szerint csökkenő",
                "Ár szerint növekvő",
                "Ár szerint csökkenő");

        kosarTartalma.setLayoutX(600);
        kosarTartalma.setLayoutY(10);

        kosar.setLayoutX(600);
        kosar.setLayoutY(30);

        termekadat1.setLayoutX(500);
        termekadat1.setLayoutY(90);

        termekadat2.setLayoutX(500);
        termekadat2.setLayoutY(120);

        termekadat3.setLayoutX(500);
        termekadat3.setLayoutY(150);

        termekadat4.setLayoutX(500);
        termekadat4.setLayoutY(180);

        kosarba.setLayoutX(620);
        kosarba.setLayoutY(280);

        elozo.setLayoutX(245);
        elozo.setLayoutY(280);
        elozo.setPrefWidth(70);

        kovetkezo.setLayoutX(320);
        kovetkezo.setLayoutY(280);
        kovetkezo.setPrefWidth(100);

        talalatokSzama.setLayoutX(430);
        talalatokSzama.setLayoutY(280);

        aruInfo.setLayoutX(245);
        aruInfo.setLayoutY(320);
        aruInfo.setPrefWidth(490);
        aruInfo.setPrefHeight(125);
        aruInfo.setEditable(false);

        bejelentkezes.setLayoutX(800);
        bejelentkezes.setLayoutY(10);
        bejelentkezes.setPrefWidth(120);

        bejelentkezettNeve.setLayoutX(800);
        bejelentkezettNeve.setLayoutY(50);

        ertekeloLabel.setLayoutX(790);
        ertekeloLabel.setLayoutY(140);

        ertekelo1.setLayoutX(750);
        ertekelo1.setLayoutY(170);
        ertekelo1.setToggleGroup(ertekeloGroup);

        ertekelo2.setLayoutX(790);
        ertekelo2.setLayoutY(170);
        ertekelo2.setToggleGroup(ertekeloGroup);

        ertekelo3.setLayoutX(830);
        ertekelo3.setLayoutY(170);
        ertekelo3.setToggleGroup(ertekeloGroup);

        ertekelo4.setLayoutX(870);
        ertekelo4.setLayoutY(170);
        ertekelo4.setToggleGroup(ertekeloGroup);

        ertekelo5.setLayoutX(910);
        ertekelo5.setLayoutY(170);
        ertekelo5.setToggleGroup(ertekeloGroup);

        ertekel.setLayoutX(750);
        ertekel.setLayoutY(200);
        ertekel.setPrefWidth(190);

        vasarlashoz.setLayoutX(750);
        vasarlashoz.setLayoutY(320);
        vasarlashoz.setPrefWidth(190);
        vasarlashoz.setPrefHeight(100);



        layout.getChildren().add(rectangle);
        layout.getChildren().add(rectangle1);

        /*Buttons*/
        layout.getChildren().add(bejelentkezes);
        layout.getChildren().add(vasarlashoz);
        layout.getChildren().add(kereses);
        layout.getChildren().add(elozo);
        layout.getChildren().add(kovetkezo);
        layout.getChildren().add(kosar);
        layout.getChildren().add(kosarba);
        layout.getChildren().add(ertekel);

        /*Labels*/
        layout.getChildren().add(kosarTartalma);
        layout.getChildren().add(bejelentkezettNeve);
        layout.getChildren().add(talalatokSzama);
        layout.getChildren().add(termekadat1);
        layout.getChildren().add(termekadat2);
        layout.getChildren().add(termekadat3);
        layout.getChildren().add(termekadat4);
        layout.getChildren().add(ertekeloLabel);

        /*RadioButtons*/
        layout.getChildren().add(nevSzerint);
        layout.getChildren().add(arSzerint);
        layout.getChildren().add(ertekelesSzerint);
        layout.getChildren().add(ertekelo1);
        layout.getChildren().add(ertekelo2);
        layout.getChildren().add(ertekelo3);
        layout.getChildren().add(ertekelo4);
        layout.getChildren().add(ertekelo5);

        /*ComboBoxes*/
        layout.getChildren().add(rendezes);
        layout.getChildren().add(keresesEredmenye);

        /*TextFields*/
        layout.getChildren().add(keresoSzoveg);
        layout.getChildren().add(aruInfo);

        /*InputHandling*/
        bejelentkezes.setOnAction(this);
        vasarlashoz.setOnAction(this);
        kereses.setOnAction(this);
        elozo.setOnAction(this);
        kovetkezo.setOnAction(this);
        kosar.setOnAction(this);
        kosarba.setOnAction(this);
        ertekel.setOnAction(this);

        nevSzerint.setOnAction(this);
        arSzerint.setOnAction(this);
        ertekelesSzerint.setOnAction(this);
        ertekelo1.setOnAction(this);
        ertekelo2.setOnAction(this);
        ertekelo3.setOnAction(this);
        ertekelo4.setOnAction(this);
        ertekelo5.setOnAction(this);

        rendezes.setOnAction(this);
        keresesEredmenye.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent actionEvent)
    {

    }
}