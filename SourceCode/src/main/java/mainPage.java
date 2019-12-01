import javafx.application.Application;
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
{

    public static Stage mainPageStage = new Stage();

    Button bejelentkezes = new Button("Bejelentkezés");
    Button vasarlashoz = new Button("Tovább a vásárlához!");
    Button kereses = new Button("Keresés!");
    Button elozo = new Button("Előző");
    Button kovetkezo = new Button("Következő");
    Button kosar = new Button("Kosár");
    Button kosarba = new Button("Kosárba teszem");
    Button ertekel = new Button("Értékelem!");

    Label kosarTartalma = new Label("Kosár Tartalma:");
    public static Label bejelentkezettNeve = new Label("Nincs bejelentkezve!");
    public static Label talalatokSzama = new Label("Találatok száma:");
    public static Label talalatokSzamaszam = new Label();
    public static Label termekadatCikkszam = new Label("Cikkszám:");
    public static Label CikkszamLabel = new Label("");
    public static Label NevLabel = new Label("");
    public static Label ArLabel = new Label("");
    public static Label RatingLabel = new Label("");
    Label termekadatNev = new Label("Név:");
    Label termekadatAr = new Label("Ár:");
    Label termekadatRating = new Label("Értékelés:");
    Label ertekeloLabel = new Label("Értékelje a terméket!");

    public static RadioButton nevSzerint = new RadioButton("Név szerinti keresés");
    public static RadioButton arSzerint = new RadioButton("Ár szerinti keresés");
    public static RadioButton ertekelesSzerint = new RadioButton("Értekelés szerinti keresés");
    public static RadioButton ertekelo1 = new RadioButton("1");
    public static RadioButton ertekelo2 = new RadioButton("2");
    public static RadioButton ertekelo3 = new RadioButton("3");
    public static RadioButton ertekelo4 = new RadioButton("4");
    public static RadioButton ertekelo5 = new RadioButton("5");

    public static ComboBox rendezes = new ComboBox();
    public static ComboBox keresesEredmenye = new ComboBox();

    public static TextField keresoSzoveg = new TextField();
    public static TextField aruInfo = new TextField();

    Rectangle rectangle = new Rectangle(240,70,500,400);
    Rectangle rectangle1 = new Rectangle(240,70,250,200);

    ToggleGroup keresoGroup = new ToggleGroup();
    ToggleGroup ertekeloGroup = new ToggleGroup();
    /*
    * A kepek megjelenitesehez meg kell vmi-
    * */

    public void mainPageShow()
    {
        start(mainPageStage);
    }

    @Override
    public void start(Stage primaryStage)
    {
        database.Connect();

        primaryStage.setTitle("The Snail Sale");
        primaryStage.setResizable(false);
        Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 950, 650);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setOnCloseRequest( event ->
        {
            database.CloseConnection();
            System.out.println("connection closed");
            primaryStage.close();
        });

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
        nevSzerint.setSelected(true);
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
        rendezes.getItems().clear();
        rendezes.getItems().addAll("Név szerint növekvő",
                "Név szerint csökkenő",
                "Ár szerint növekvő",
                "Ár szerint csökkenő");

        kosarTartalma.setLayoutX(600);
        kosarTartalma.setLayoutY(10);

        kosar.setLayoutX(600);
        kosar.setLayoutY(30);

        termekadatCikkszam.setLayoutX(500);
        termekadatCikkszam.setLayoutY(90);
        CikkszamLabel.setLayoutX(560);
        CikkszamLabel.setLayoutY(90);

        termekadatNev.setLayoutX(500);
        termekadatNev.setLayoutY(120);
        NevLabel.setLayoutX(530);
        NevLabel.setLayoutY(120);

        termekadatAr.setLayoutX(500);
        termekadatAr.setLayoutY(150);
        ArLabel.setLayoutX(520);
        ArLabel.setLayoutY(150);

        termekadatRating.setLayoutX(500);
        termekadatRating.setLayoutY(180);
        RatingLabel.setLayoutX(560);
        RatingLabel.setLayoutY(180);

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

        talalatokSzamaszam.setLayoutX(530);
        talalatokSzamaszam.setLayoutY(280);

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
        ertekelo1.setId("1");

        ertekelo2.setLayoutX(790);
        ertekelo2.setLayoutY(170);
        ertekelo2.setToggleGroup(ertekeloGroup);
        ertekelo2.setId("2");

        ertekelo3.setLayoutX(830);
        ertekelo3.setLayoutY(170);
        ertekelo3.setToggleGroup(ertekeloGroup);
        ertekelo3.setId("3");

        ertekelo4.setLayoutX(870);
        ertekelo4.setLayoutY(170);
        ertekelo4.setToggleGroup(ertekeloGroup);
        ertekelo4.setId("4");

        ertekelo5.setLayoutX(910);
        ertekelo5.setLayoutY(170);
        ertekelo5.setToggleGroup(ertekeloGroup);
        ertekelo5.setSelected(true);
        ertekelo5.setId("5");

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
        layout.getChildren().add(talalatokSzamaszam);
        layout.getChildren().add(termekadatCikkszam);
        layout.getChildren().add(CikkszamLabel);
        layout.getChildren().add(termekadatNev);
        layout.getChildren().add(NevLabel);
        layout.getChildren().add(termekadatAr);
        layout.getChildren().add(ArLabel);
        layout.getChildren().add(termekadatRating);
        layout.getChildren().add(RatingLabel);
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
        bejelentkezes.setOnAction(this); //done
        vasarlashoz.setOnAction(this); //done
        kereses.setOnAction(this); //done
        elozo.setOnAction(this); //done
        kovetkezo.setOnAction(this); //done
        kosar.setOnAction(this); //done
        kosarba.setOnAction(this); //done
        ertekel.setOnAction(this); //done

        rendezes.setOnAction(this); //done
        keresesEredmenye.setOnAction(this);
    }

    @Override
    public void handle(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == bejelentkezes)
        {
            if(!database.CheckLoggedInStatus())
            {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                mainPageController.loginShow();
            }
            else
                database.alert("Mar be van jelentkezve!");
        }
        if(actionEvent.getSource() == vasarlashoz)
        {
            if(database.CheckLoggedInStatus() && mainPageController.kosar.size() != 0)
            {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                mainPageController.cartOverwiewShow();
                database.KosarVeglegesiteseFeltoltese(mainPageController.kosar);
            }
            else
                database.alert("A vasarlashoz elobb jelentkezzen be, vagy tegyen be valamit a kosarba!");
        }
        if(actionEvent.getSource() == kosar)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            mainPageController.cartShow();
            database.KosarFeltoltese(mainPageController.kosar);

        }
        if(actionEvent.getSource() == kereses)
        {
            database.Kereses();
        }
        if(actionEvent.getSource() == kosarba)
        {
            if(database.CheckLoggedInStatus())
            mainPageController.kosarbaTeszem();

            else
                database.alert("Termek kosarba valo helyezese elott jelentkezzen be!");
        }
        if(actionEvent.getSource() == ertekel)
        {
            if(database.CheckLoggedInStatus())
            {
                if(ertekelo1.isSelected())
                    database.setScore(Integer.parseInt(ertekelo1.getId()));
                if(ertekelo2.isSelected())
                    database.setScore(Integer.parseInt(ertekelo2.getId()));
                if(ertekelo3.isSelected())
                    database.setScore(Integer.parseInt(ertekelo3.getId()));
                if(ertekelo4.isSelected())
                    database.setScore(Integer.parseInt(ertekelo4.getId()));
                if(ertekelo5.isSelected())
                    database.setScore(Integer.parseInt(ertekelo5.getId()));

            }
            else
                database.alert("Az ertekeleshez elobb jelentkezzen be!");
        }
        if(actionEvent.getSource() == rendezes)
            database.Kereses();
        if(actionEvent.getSource() == elozo)
        {
            System.out.println(keresesEredmenye.getSelectionModel().getSelectedIndex());
            keresesEredmenye.getSelectionModel().selectPrevious();
            RatingLabel.setText(String.valueOf(database.getRating(database.KosarbaTesz(keresesEredmenye.getValue().toString())) ));
        }
        if(actionEvent.getSource() == kovetkezo)
        {
            System.out.println(keresesEredmenye.getSelectionModel().getSelectedIndex());
            keresesEredmenye.getSelectionModel().selectNext();
            RatingLabel.setText(String.valueOf(database.getRating(database.KosarbaTesz(keresesEredmenye.getValue().toString())) ));
        }
        if(actionEvent.getSource() == keresesEredmenye)
            try
            {
                RatingLabel.setText(String.valueOf(database.getRating(database.KosarbaTesz(keresesEredmenye.getValue().toString())) ));
            }
        catch (Exception e)
        {

        }

    }
}
