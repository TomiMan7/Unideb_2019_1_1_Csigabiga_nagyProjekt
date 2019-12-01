import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * A kosar, es annak tartalmat mutato GUI-ablak.
 */
public class cart
{
    static Button penztarhoz = new Button("Pénztárhoz");
    static Button vissza = new Button("Vissza");

    Label info = new Label("A kosár tartalma: ");

    Rectangle termekhelye = new Rectangle(40,100,80,80);
    Rectangle termekhelye1 = new Rectangle(40,220,80,80);
    Rectangle termekhelye2= new Rectangle(40, 340, 80, 80);

    Label termekneve = new Label("A termék neve");
    Label termekneve1 = new Label("A termék neve");
    Label termekneve2 = new Label("A termék neve");

    public static Label termekneve1Text = new Label("");
    public static Label termekneve2Text = new Label("");
    public static Label termekneve3Text = new Label("");


    static Button eltavolitas = new Button("Eltávolítás");
    static Button eltavolitas1 = new Button("Eltávolítás");
    static Button eltavolitas2 = new Button("Eltávolítás");


    public void cartShow()
    {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("The Snail Sale - Kosár");
        primaryStage.setResizable(false);

        javafx.scene.image.Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 550, 500);

        primaryStage.setScene(scene);

        primaryStage.show();

        primaryStage.setOnCloseRequest( event ->
        {
            primaryStage.close();
            cartController.mainPageShow();
        });
        info.setLayoutX(200);
        info.setLayoutY(20);

        penztarhoz.setLayoutX(80);
        penztarhoz.setLayoutY(55);
        penztarhoz.setPrefWidth(80);

        vissza.setLayoutX(400);
        vissza.setLayoutY(55);
        vissza.setPrefWidth(70);

        eltavolitas.setLayoutX(410);
        eltavolitas.setLayoutY(100);
        eltavolitas.setPrefWidth(80);
        eltavolitas.setId("0");

        eltavolitas1.setLayoutX(410);
        eltavolitas1.setLayoutY(220);
        eltavolitas1.setPrefWidth(80);
        eltavolitas1.setId("1");

        eltavolitas2.setLayoutX(410);
        eltavolitas2.setLayoutY(340);
        eltavolitas2.setPrefWidth(80);
        eltavolitas2.setId("2");

        termekneve.setLayoutX(140);
        termekneve.setLayoutY(100);
        termekneve1Text.setLayoutX(140);
        termekneve1Text.setLayoutY(120);
        termekneve1Text.setText("");

        termekneve1.setLayoutX(140);
        termekneve1.setLayoutY(220);
        termekneve2Text.setLayoutX(140);
        termekneve2Text.setLayoutY(240);
        termekneve2Text.setText("");

        termekneve2.setLayoutX(140);
        termekneve2.setLayoutY(340);
        termekneve3Text.setLayoutX(140);
        termekneve3Text.setLayoutY(360);
        termekneve3Text.setText("");

        termekhelye.setFill(null);
        termekhelye.setStroke(Color.GRAY);
        termekhelye.setStrokeWidth(3);

        termekhelye1.setFill(null);
        termekhelye1.setStroke(Color.GRAY);
        termekhelye1.setStrokeWidth(3);

        termekhelye2.setFill(null);
        termekhelye2.setStroke(Color.GRAY);
        termekhelye2.setStrokeWidth(3);

        layout.getChildren().add(penztarhoz);

        layout.getChildren().add(vissza);

        layout.getChildren().add(info);

        layout.getChildren().add(eltavolitas);
        layout.getChildren().add(eltavolitas1);
        layout.getChildren().add(eltavolitas2);

        layout.getChildren().add(termekhelye);
        layout.getChildren().add(termekhelye1);
        layout.getChildren().add(termekhelye2);
        layout.getChildren().add(termekneve);
        layout.getChildren().add(termekneve1);
        layout.getChildren().add(termekneve2);
        layout.getChildren().add(termekneve1Text);
        layout.getChildren().add(termekneve2Text);
        layout.getChildren().add(termekneve3Text);

        penztarhoz.setOnAction(cart::handle); //done
        vissza.setOnAction(cart::handle); //done
        eltavolitas.setOnAction(cart::handle); //done
        eltavolitas1.setOnAction(cart::handle); //done
        eltavolitas2.setOnAction(cart::handle); //done

    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == penztarhoz)
        {
            if(mainPageController.kosar.size() != 0)
            {
                ((Node) (actionEvent.getSource())).getScene().getWindow().hide();
                cartController.personalInfoShow();
            }
            else
                database.alert("A vasarlashoz elobb rakjon valamit a kosaraba!");
        }

        if(actionEvent.getSource() == vissza)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            cartController.mainPageShow();
        }

        if(actionEvent.getSource() == eltavolitas)
        {
                termekneve1Text.setText("");
                cartController.removeGoodFromCart(eltavolitas.getId());
        }

        if(actionEvent.getSource() == eltavolitas1)
        {
            termekneve2Text.setText("");
            cartController.removeGoodFromCart(eltavolitas1.getId());
        }

        if(actionEvent.getSource() == eltavolitas2)
        {
            termekneve3Text.setText("");
            cartController.removeGoodFromCart(eltavolitas2.getId());
        }
    }
}
