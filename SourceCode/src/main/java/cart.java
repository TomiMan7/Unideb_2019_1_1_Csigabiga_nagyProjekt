import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * A kosar, es annak tartalmat mutato GUI-ablak.
 */
public class cart
{
    static Button penztarhoz = new Button("Pénztárhoz");
    static Button vissza = new Button("Vissza");

    Label info = new Label("A kosár tartalma: ");


    public void cartShow()
    {
        Stage primaryStage = new Stage();
        primaryStage.setTitle("The Snail Sale - Kosár");
        primaryStage.setResizable(false);

        javafx.scene.image.Image icon = new Image("./icon.jpg");
        primaryStage.getIcons().add(icon);

        Pane layout = new Pane();

        Scene scene = new Scene(layout, 550, 400);

        primaryStage.setScene(scene);

        primaryStage.show();

        info.setLayoutX(200);
        info.setLayoutY(20);
        penztarhoz.setLayoutX(80);
        penztarhoz.setLayoutY(80);
        penztarhoz.setPrefWidth(80);
        vissza.setLayoutX(400);
        vissza.setLayoutY(80);
        vissza.setPrefWidth(70);

        layout.getChildren().add(penztarhoz);
        layout.getChildren().add(vissza);

        layout.getChildren().add(info);

        penztarhoz.setOnAction(cart::handle);
        vissza.setOnAction(cart::handle);
    }

    public static void handle(ActionEvent actionEvent)
    {
        if(actionEvent.getSource() == penztarhoz)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            cartController.personalInfoShow();
        }

        if(actionEvent.getSource() == vissza)
        {
            ((Node)(actionEvent.getSource())).getScene().getWindow().hide();
            cartController.mainPageShow();
        }
    }
}
