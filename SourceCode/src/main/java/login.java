import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class login extends Application implements EventHandler<ActionEvent>
{
    Stage login = new Stage();
    Button bejelentkezes = new Button("Bejelentkezés");
    Button regisztracio = new Button("Regisztráció");

    Label info = new Label("Kérem jelentkezzen be!");
    Label felhasznalonev = new Label("Felhasználónév:");
    Label jelszo = new Label("Jelszó:");

    TextField felhasznalonevText = new TextField();
    TextField jelszoText = new TextField();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("The Snail Sale - Bejelentkezés");
        primaryStage.setResizable(false);

        Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 550, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

        info.setLayoutX(200);
        info.setLayoutY(20);
        felhasznalonev.setLayoutX(80);
        felhasznalonev.setLayoutY(90);
        jelszo.setLayoutX(80);
        jelszo.setLayoutY(130);

        felhasznalonevText.setLayoutX(200);
        felhasznalonevText.setLayoutY(90);
        felhasznalonevText.setPrefWidth(250);
        jelszoText.setLayoutX(200);
        jelszoText.setLayoutY(130);
        jelszoText.setPrefWidth(250);

        bejelentkezes.setLayoutX(80);
        bejelentkezes.setLayoutY(300);
        bejelentkezes.setPrefWidth(150);

        regisztracio.setLayoutX(350);
        regisztracio.setLayoutY(300);
        regisztracio.setPrefWidth(100);

        layout.getChildren().add(regisztracio);
        layout.getChildren().add(bejelentkezes);

        layout.getChildren().add(info);
        layout.getChildren().add(felhasznalonev);
        layout.getChildren().add(jelszo);

        layout.getChildren().add(felhasznalonevText);
        layout.getChildren().add(jelszoText);

        regisztracio.setOnAction(this);
        bejelentkezes.setOnAction(this);

    }
    @Override
    public void handle(ActionEvent actionEvent)
    {

    }
}