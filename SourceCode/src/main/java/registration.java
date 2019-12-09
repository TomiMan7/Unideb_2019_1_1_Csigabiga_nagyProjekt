import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * A regisztraciohoz szukseges adatokat keri be a felhasznalotol.
 * Sikeres regisztracio eseten visszaviszi a felhasznalot a **login** ablakra.
 */
public class registration
{
    public static Button regisztracio = new Button("Regisztráció");
    public static Button megse = new Button("Mégse");

    Label info = new Label("Kérjük regisztráljon be először a vásárlás elkezdéséhez");
    Label felhasznalonev = new Label("Felhasználónév:");
    Label email = new Label("E-mail:");
    Label jelszo = new Label("Jelszó:");
    Label jelszo2 = new Label("Jelszó mégegyszer:");

    public static TextField felhasznalonevText = new TextField();
    public static TextField emailText = new TextField();
    public static PasswordField jelszoText = new PasswordField();
    public static PasswordField jelszo2Text = new PasswordField();


    public void registrationShow()
    {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("The Snail Sale - Regisztráció");
        primaryStage.setResizable(false);

        Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 550, 400);

        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.setOnCloseRequest( event ->
        {
            primaryStage.close();
            registrationController.mainPageShow();
        });

        info.setLayoutX(100);
        info.setLayoutY(20);
        felhasznalonev.setLayoutX(80);
        felhasznalonev.setLayoutY(90);
        email.setLayoutX(80);
        email.setLayoutY(130);
        jelszo.setLayoutX(80);
        jelszo.setLayoutY(170);
        jelszo2.setLayoutX(80);
        jelszo2.setLayoutY(210);

        felhasznalonevText.setLayoutX(200);
        felhasznalonevText.setLayoutY(90);
        felhasznalonevText.setPrefWidth(250);
        emailText.setLayoutX(200);
        emailText.setLayoutY(130);
        emailText.setPrefWidth(250);
        jelszoText.setLayoutX(200);
        jelszoText.setLayoutY(170);
        jelszoText.setPrefWidth(250);
        jelszo2Text.setLayoutX(200);
        jelszo2Text.setLayoutY(210);
        jelszo2Text.setPrefWidth(250);

        regisztracio.setLayoutX(80);
        regisztracio.setLayoutY(300);
        regisztracio.setPrefWidth(150);

        megse.setLayoutX(350);
        megse.setLayoutY(300);
        megse.setPrefWidth(100);

        layout.getChildren().add(regisztracio);
        layout.getChildren().add(megse);

        layout.getChildren().add(info);
        layout.getChildren().add(felhasznalonev);
        layout.getChildren().add(email);
        layout.getChildren().add(jelszo);
        layout.getChildren().add(jelszo2);

        layout.getChildren().add(felhasznalonevText);
        layout.getChildren().add(emailText);
        layout.getChildren().add(jelszoText);
        layout.getChildren().add(jelszo2Text);

        regisztracio.setOnAction(registration::handle); //done
        megse.setOnAction(registration::handle); //done

    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == megse)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            registrationController.loginShow();
        }

        if(actionEvent.getSource() == regisztracio)
        {
            if(registrationController.registrationChechk())
            {
                if(database.registration())
                    registrationController.loginShow();
            }
            else
                database.alert("Hianyzo adatok vagy nem egyezo jelszo!");
        }

    }
}
