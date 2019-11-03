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

    Label termekneve = new Label("A termék neve");
    Label termekneve1 = new Label("A termék neve");
    Label termekneve2 = new Label("A termék neve");

    Button eltavolitas = new Button("Eltávolítás");


    public void cartOverViewShow(){

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

        termekneve.setLayoutX(140);
        termekneve.setLayoutY(100);

        termekneve1.setLayoutX(140);
        termekneve1.setLayoutY(220);

        termekneve2.setLayoutX(140);
        termekneve2.setLayoutY(340);

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

        layout.getChildren().add(veglegesites);
        layout.getChildren().add(ellenorzes);
        layout.getChildren().add(termekhelye);
        layout.getChildren().add(termekhelye1);
        layout.getChildren().add(termekhelye2);
        layout.getChildren().add(termekneve);
        layout.getChildren().add(termekneve1);
        layout.getChildren().add(termekneve2);

        vasarlas.setOnAction(cartOverview::handle);
        vissza.setOnAction(cartOverview::handle);

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
        }
}