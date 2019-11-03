import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * A vasarlashoz szukseges szemelyes informaciokat keri be a vasarlotol.
 * A megfelelo adatok beirasa utan az **orderConfirmation** ablakra visz at.
 */
public class personalInfo
{
    static Button nextPage = new Button("Tovább a vásárlás véglegesítéséhez");
    static Button vissza = new Button("Vissza a kosárhoz");

    Label info = new Label("Kérjük írja be az alábbi információkat a vásárlás folytatásához!");
    Label nev = new Label("Név:");
    Label telefonszam = new Label("Telefonszám");
    Label szallitasiCim = new Label("Szállítási cím:");
    Label email = new Label("E-mail:");
    Label szallitasiModszer = new Label("Szállítási módszer:");
    Label fizetesiModszer = new Label("Fizetési módszer:");

    TextField nevText = new TextField();
    TextField telefonszamText = new TextField();
    TextField szallitasiCimText = new TextField();
    TextField emailText = new TextField();

    ComboBox szallitasiModszerBox = new ComboBox();
    ComboBox fizetesiModszerBox = new ComboBox();

    public void personalInfoShow()
    {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("The Snail Sale - Személyes információk bekérése");
        primaryStage.setResizable(false);

        Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();


        Scene scene = new Scene(layout, 550, 450);


        primaryStage.setScene(scene);
        primaryStage.show();


        info.setLayoutX(100);
        info.setLayoutY(20);
        nev.setLayoutX(80);
        nev.setLayoutY(90);
        telefonszam.setLayoutX(80);
        telefonszam.setLayoutY(130);
        szallitasiCim.setLayoutX(80);
        szallitasiCim.setLayoutY(170);
        email.setLayoutX(80);
        email.setLayoutY(210);
        szallitasiModszer.setLayoutX(80);
        szallitasiModszer.setLayoutY(250);
        fizetesiModszer.setLayoutX(80);
        fizetesiModszer.setLayoutY(290);

        nevText.setLayoutX(200);
        nevText.setLayoutY(90);
        nevText.setPrefWidth(250);
        telefonszamText.setLayoutX(200);
        telefonszamText.setLayoutY(130);
        telefonszamText.setPrefWidth(250);
        szallitasiCimText.setLayoutX(200);
        szallitasiCimText.setLayoutY(170);
        szallitasiCimText.setPrefWidth(250);
        emailText.setLayoutX(200);
        emailText.setLayoutY(210);
        emailText.setPrefWidth(250);

        szallitasiModszerBox.setLayoutX(200);
        szallitasiModszerBox.setLayoutY(250);
        szallitasiModszerBox.setPromptText("Kérem válasszon szállítási módszert!");
        szallitasiModszerBox.setPrefWidth(250);
        szallitasiModszerBox.getItems().addAll(
                "Személyes átvétel boltunkban",
                "Futárszolgálattal való küldés",
                "Postai úton való kézbesítés");
        fizetesiModszerBox.setLayoutX(200);
        fizetesiModszerBox.setLayoutY(290);
        fizetesiModszerBox.setPromptText("Kérem válasszon fizetési módszert!");
        fizetesiModszerBox.setPrefWidth(250);
        fizetesiModszerBox.getItems().addAll(
                "Bankkártyás vásárlás",
                "Utánvétes vásárlás");


        nextPage.setLayoutX(80);
        nextPage.setLayoutY(350);
        nextPage.setPrefWidth(370);

        vissza.setLayoutX(190);
        vissza.setLayoutY(400);
        vissza.setPrefWidth(150);

        layout.getChildren().add(nextPage);
        layout.getChildren().add(vissza);

        layout.getChildren().add(info);
        layout.getChildren().add(nev);
        layout.getChildren().add(telefonszam);
        layout.getChildren().add(szallitasiCim);
        layout.getChildren().add(email);
        layout.getChildren().add(szallitasiModszer);
        layout.getChildren().add(fizetesiModszer);

        layout.getChildren().add(nevText);
        layout.getChildren().add(telefonszamText);
        layout.getChildren().add(szallitasiCimText);
        layout.getChildren().add(emailText);

        layout.getChildren().add(szallitasiModszerBox);
        layout.getChildren().add(fizetesiModszerBox);

        nextPage.setOnAction(personalInfo::handle);
        vissza.setOnAction(personalInfo::handle);
    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == nextPage)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            personalInfoController.orderConfirmationShow();
        }

        if(actionEvent.getSource() == vissza)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            personalInfoController.cartOverViewShow();
        }
    }
}
