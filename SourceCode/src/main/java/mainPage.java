import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainPage extends Application implements EventHandler<ActionEvent> {

    Stage mainPageStage = new Stage();

    Button bejelentkezes = new Button("Bejelentkezés");
    Button vasarlashoz = new Button("Vásárláshoz...");
    Button kereses = new Button("Keresés!");
    Button elozo = new Button("Elöző");
    Button kovetkezo = new Button("Következő");
    Button kosar = new Button("Kosár");
    Button kosarba = new Button("Kosárba");
    Button ertekel = new Button("ertekel");

    Label kosarTartalma = new Label("Kosár Tartalma:");
    Label bejelentkezettNeve = new Label("Bejelentkezve:");
    Label talalatokSzama = new Label("Találatok száma:");
    Label termekadat1 = new Label("TBD:");
    Label termekadat2 = new Label("TBD:");
    Label termekadat3 = new Label("TBD:");
    Label termekadat4 = new Label("TBD:");

    RadioButton nevSzerint = new RadioButton("Név szerinti keresés");
    RadioButton arSzerint = new RadioButton("Név szerinti keresés");
    RadioButton ertekelo1 = new RadioButton("1");
    RadioButton ertekelo2 = new RadioButton("2");
    RadioButton ertekelo3 = new RadioButton("3");
    RadioButton ertekelo4 = new RadioButton("4");
    RadioButton ertekelo5 = new RadioButton("5");

    ComboBox rendezes = new ComboBox();
    ComboBox keresesEredmenye = new ComboBox();

    TextField keresoSzoveg = new TextField();
    TextField aruInfo = new TextField();


    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("The Snail Sale");
        primaryStage.setResizable(false);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 900, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {

    }
}
