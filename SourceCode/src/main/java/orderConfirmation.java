import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.concurrent.TimeUnit;

/**
 * A vasarlas vegso lezarasa, adjon kepet hogy mit, mennyit, mennyiert vasarol az illeto, hova, kinek
 * viszik ki, hogyan stb.
 * Sikeres vasarlas eseten vigyen vissza a **mainPage**-re.
 */

public class orderConfirmation
{
    Label vasarlas = new Label("A vásárlás véglegesítése");

    static Button fizet = new Button("Fizetés");
    static Button vissza = new Button("Vissza");

    Rectangle termekhelye = new Rectangle(40,100,80,80);
    Rectangle termekhelye1 = new Rectangle(40,220,80,80);
    Rectangle termekhelye2= new Rectangle(40, 340, 80, 80);

    Label termekneve = new Label("A termék neve");
    Label termekneve1 = new Label("A termék neve");
    Label termekneve2 = new Label("A termék neve");
    public static Label termekneveText = new Label("");
    public static Label termekneve1Text = new Label("");
    public static Label termekneve2Text = new Label("");

    Label termekek = new Label("A termékek: ");

    Label szemelyes = new Label("Személyes adatok: ");
    public static Label sz = new Label("");

    Label nev = new Label("Név:");
    public static Label name = new Label("");

    Label telefonszam = new Label("Telefonszám");
    public static Label tsz = new Label("");

    Label szallitasiCim = new Label("Szállítási cím:");
    public static Label szc = new Label("");

    Label email = new Label("E-mail:");
    public static Label ecim = new Label("");

    Label szallitasiModszer = new Label("Szállítási módszer:");
    public static Label szm = new Label("");

    Label fizetesiModszer = new Label("Fizetési módszer:");
    public static Label fm = new Label("");

    Label osszeg = new Label("Fizetendő(Ft): ");
    public static Label fizetendo = new Label("");


    public void orderConfirmationShow()
    {
        Stage primaryStage = new Stage();

        primaryStage.setTitle("The Snail Sale - A vásárlás véglegesítése");
        primaryStage.setResizable(false);

        javafx.scene.image.Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 550, 600);

        primaryStage.setScene(scene);

        primaryStage.show();


        vasarlas.setLayoutX(200);
        vasarlas.setLayoutY(20);
        vissza.setLayoutX(30);
        vissza.setLayoutY(20);
        vissza.setPrefWidth(100);
        fizet.setLayoutX(400);
        fizet.setLayoutY(500);
        fizet.setPrefWidth(100);

        osszeg.setLayoutX(280);
        osszeg.setLayoutY(505);

        termekek.setLayoutX(40);
        termekek.setLayoutY(80);

        szemelyes.setLayoutX(310);
        szemelyes.setLayoutY(80);
        sz.setLayoutX(410);
        sz.setLayoutY(80);

        nev.setLayoutX(310);
        nev.setLayoutY(100);
        name.setLayoutX(410);
        name.setLayoutY(100);

        telefonszam.setLayoutX(310);
        telefonszam.setLayoutY(150);
        tsz.setLayoutX(410);
        tsz.setLayoutY(150);

        szallitasiCim.setLayoutX(310);
        szallitasiCim.setLayoutY(200);
        szc.setLayoutX(410);
        szc.setLayoutY(200);

        email.setLayoutX(310);
        email.setLayoutY(250);
        ecim.setLayoutX(410);
        ecim.setLayoutY(250);

        szallitasiModszer.setLayoutX(310);
        szallitasiModszer.setLayoutY(300);
        szm.setLayoutX(410);
        szm.setLayoutY(300);

        fizetesiModszer.setLayoutX(310);
        fizetesiModszer.setLayoutY(350);
        fm.setLayoutX(410);
        fm.setLayoutY(350);

        termekneve.setLayoutX(140);
        termekneve.setLayoutY(100);
        termekneveText.setLayoutX(220);
        termekneveText.setLayoutY(100);
        termekneveText.setText("");

        termekneve1.setLayoutX(140);
        termekneve1.setLayoutY(220);
        termekneve1Text.setLayoutX(220);
        termekneve1Text.setLayoutY(220);
        termekneve1Text.setText("");

        termekneve2.setLayoutX(140);
        termekneve2.setLayoutY(340);
        termekneve2Text.setLayoutX(220);
        termekneve2Text.setLayoutY(340);
        termekneve2Text.setText("");

        termekhelye.setFill(null);
        termekhelye.setStroke(Color.GRAY);
        termekhelye.setStrokeWidth(3);

        termekhelye1.setFill(null);
        termekhelye1.setStroke(Color.GRAY);
        termekhelye1.setStrokeWidth(3);

        termekhelye2.setFill(null);
        termekhelye2.setStroke(Color.GRAY);
        termekhelye2.setStrokeWidth(3);

        layout.getChildren().add(vasarlas);
        layout.getChildren().add(vissza);

        layout.getChildren().add(termekek);
        layout.getChildren().add(szemelyes);
        layout.getChildren().add(sz);
        layout.getChildren().add(osszeg);

        layout.getChildren().add(fizet);
        layout.getChildren().add(termekhelye);
        layout.getChildren().add(termekhelye1);
        layout.getChildren().add(termekhelye2);
        layout.getChildren().add(termekneve);
        layout.getChildren().add(termekneve1);
        layout.getChildren().add(termekneve2);
        layout.getChildren().add(termekneveText);
        layout.getChildren().add(termekneve1Text);
        layout.getChildren().add(termekneve2Text);

        layout.getChildren().add(nev);
        layout.getChildren().add(telefonszam);
        layout.getChildren().add(szallitasiCim);
        layout.getChildren().add(email);
        layout.getChildren().add(szallitasiModszer);
        layout.getChildren().add(fizetesiModszer);
        layout.getChildren().add(name);
        layout.getChildren().add(tsz);
        layout.getChildren().add(szc);
        layout.getChildren().add(ecim);
        layout.getChildren().add(szm);
        layout.getChildren().add(fm);

        fizet.setOnAction(orderConfirmation::handle);
        vissza.setOnAction(orderConfirmation::handle);
    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == fizet)
        {
            orderConfirmationController.thanks();
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            orderConfirmationController.mainPageSHow();
        }

        if(actionEvent.getSource() == vissza)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            orderConfirmationController.personailInfoShow();
        }
    }
}