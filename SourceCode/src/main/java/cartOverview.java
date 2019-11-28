import javafx.event.ActionEvent;
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
{
    Label veglegesites = new Label("A kosár véglegesítése");
    Label ellenorzes = new Label("Kérjük ellenőrizze a kosár tartalmát!");

    static Button vasarlas = new Button("Vásárlás");
    static Button vissza = new Button("Vissza");

    Rectangle termekhelye = new Rectangle(40,100,80,80);
    Rectangle termekhelye1 = new Rectangle(40,220,80,80);
    Rectangle termekhelye2= new Rectangle(40, 340, 80, 80);

    Label termekneve = new Label("A termék neve:");
    Label termekneve1 = new Label("A termék neve:");
    Label termekneve2 = new Label("A termék neve:");

    public static Label termekneveText = new Label("ASDASD");
    public static Label termekneve1Text = new Label("");
    public static Label termekneve2Text = new Label("");

    Label osszeg = new Label("Ár(Ft): ");
    Label osszeg2 = new Label("Ár(Ft): ");
    Label osszeg3 = new Label("Ár(Ft): ");

    public static Label ar = new Label("");
    public static Label ar2 = new Label("");
    public static Label ar3 = new Label("");

    Label fizetendo = new Label("Végösszeg(Ft): ");

    public static Label vegosszeg = new Label("");


    static Button eltavolitas = new Button("Eltávolítás");
    static Button eltavolitas2 = new Button("Eltávolítás");
    static Button eltavolitas3 = new Button("Eltávolítás");

    public void cartOverViewShow()
    {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("The Snail Sale - A kosár véglegesítése");
        primaryStage.setResizable(false);

        Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 550, 500);

        primaryStage.setScene(scene);
        primaryStage.show();

        veglegesites.setLayoutX(200);
        veglegesites.setLayoutY(20);
        ellenorzes.setLayoutX(160);
        ellenorzes.setLayoutY(40);
        vissza.setLayoutX(30);
        vissza.setLayoutY(30);
        vissza.setPrefWidth(100);
        vasarlas.setLayoutX(400);
        vasarlas.setLayoutY(30);
        vasarlas.setPrefWidth(100);

        eltavolitas.setLayoutX(410);
        eltavolitas.setLayoutY(100);
        eltavolitas.setPrefWidth(80);
        eltavolitas.setId("0");

        eltavolitas2.setLayoutX(410);
        eltavolitas2.setLayoutY(220);
        eltavolitas2.setPrefWidth(80);
        eltavolitas2.setId("1");

        eltavolitas3.setLayoutX(410);
        eltavolitas3.setLayoutY(340);
        eltavolitas3.setPrefWidth(80);
        eltavolitas3.setId("2");

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

        fizetendo.setLayoutX(300);
        fizetendo.setLayoutY(450);
        vegosszeg.setLayoutX(400);
        vegosszeg.setLayoutY(450);

        osszeg.setLayoutX(140);
        osszeg.setLayoutY(120);
        ar.setLayoutX(180);
        ar.setLayoutY(120);
        ar.setText("");

        osszeg2.setLayoutX(140);
        osszeg2.setLayoutY(240);
        ar2.setLayoutX(180);
        ar2.setLayoutY(240);
        ar2.setText("");

        osszeg3.setLayoutX(140);
        osszeg3.setLayoutY(360);
        ar3.setLayoutX(180);
        ar3.setLayoutY(360);
        ar3.setText("");

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
        layout.getChildren().add(eltavolitas);
        layout.getChildren().add(eltavolitas2);
        layout.getChildren().add(eltavolitas3);

        layout.getChildren().add(veglegesites);
        layout.getChildren().add(ellenorzes);
        layout.getChildren().add(termekhelye);
        layout.getChildren().add(termekhelye1);
        layout.getChildren().add(termekhelye2);
        layout.getChildren().add(termekneve);
        layout.getChildren().add(termekneveText);
        layout.getChildren().add(termekneve1Text);
        layout.getChildren().add(termekneve2Text);
        layout.getChildren().add(termekneve1);
        layout.getChildren().add(termekneve2);
        layout.getChildren().add(fizetendo);
        layout.getChildren().add(vegosszeg);

        layout.getChildren().add(osszeg);
        layout.getChildren().add(osszeg2);
        layout.getChildren().add(osszeg3);
        layout.getChildren().add(ar);
        layout.getChildren().add(ar2);
        layout.getChildren().add(ar3);

        vasarlas.setOnAction(cartOverview::handle); //done
        vissza.setOnAction(cartOverview::handle); //done
        eltavolitas.setOnAction(cartOverview::handle);
        eltavolitas2.setOnAction(cartOverview::handle);
        eltavolitas3.setOnAction(cartOverview::handle);
    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == vasarlas)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            cartOverviewController.personalInfoShow();
        }

        if(actionEvent.getSource() == vissza )
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            cartOverviewController.mainPageShow();
        }

        if(actionEvent.getSource() == eltavolitas)
        {
            termekneveText.setText("");
            ar.setText("");
            cartOverviewController.removeGoodFromCart(eltavolitas.getId());
        }

        if(actionEvent.getSource() == eltavolitas2)
        {
            termekneve1Text.setText("");
            ar2.setText("");
            cartOverviewController.removeGoodFromCart(eltavolitas2.getId());
        }

        if(actionEvent.getSource() == eltavolitas3)
        {
            termekneve2Text.setText("");
            ar3.setText("");
            cartOverviewController.removeGoodFromCart(eltavolitas3.getId());
        }
    }
}