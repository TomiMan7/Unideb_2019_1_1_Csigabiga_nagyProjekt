import javafx.event.ActionEvent;
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
 * A belepeshez szukseges informaciokat keri be a felhasznalotol.
 * Legyen lehetosege a felhasznalonak ebbol az ablakbol megnyitni a **registration** ablakot
 * hogy regisztralhasson.
 * Sikeres belepes utan a **mainPage** megfeleloen megvaltoztatott ablakat hozza fel.
 */
public class login
{
    static Button bejelentkezes = new Button("Bejelentkezés");
    static Button regisztracio = new Button("Regisztráció");

    Label info = new Label("Kérem jelentkezzen be!");
    Label info2 = new Label("Ha még nincs fiókja, kérem regisztráljon be itt!");

    Label felhasznalonev = new Label("Felhasználónév:");
    Label jelszo = new Label("Jelszó:");

    static TextField felhasznalonevText = new TextField();
    static PasswordField jelszoText = new PasswordField();

    public void loginShow()
    {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("The Snail Sale - Bejelentkezés");
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
            loginController.mainPageShow();
        });

        info.setLayoutX(200);
        info.setLayoutY(20);
        info2.setLayoutX(80);
        info2.setLayoutY(280);
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

        regisztracio.setLayoutX(80);
        regisztracio.setLayoutY(300);
        regisztracio.setPrefWidth(150);

        bejelentkezes.setLayoutX(350);
        bejelentkezes.setLayoutY(300);
        bejelentkezes.setPrefWidth(100);

        layout.getChildren().add(regisztracio);
        layout.getChildren().add(bejelentkezes);

        layout.getChildren().add(info);
        layout.getChildren().add(info2);
        layout.getChildren().add(felhasznalonev);
        layout.getChildren().add(jelszo);

        layout.getChildren().add(felhasznalonevText);
        layout.getChildren().add(jelszoText);

        regisztracio.setOnAction(login::handle); //done
        bejelentkezes.setOnAction(login::handle);

    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == regisztracio)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            loginController.registrationShow();
        }
        if(actionEvent.getSource() == bejelentkezes)
        {
            if(loginController.LoginCheck())
            {
                if(database.Login())
                {
                    ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                    loginController.mainPageShow();
                    loginController.setLogin();
                }
                else
                    database.alert("Hibas felhasznalonev vagy jelszo!");
            }
        }
    }
}
