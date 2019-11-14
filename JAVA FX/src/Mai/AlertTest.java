package Mai;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

    public class AlertTest extends Application {

        Stage window;
        Button button;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            window = primaryStage;
            window.setTitle("Planet Conversion"); //sets the title as title of the window

            button = new Button ("Click Me");
            button.setOnAction(e -> AlertBox.display("Mercury", "Your weight is: 180lbs")); //whenever an event occurs on this button look in this class to handle the code

            StackPane layout = new StackPane(); // positions button in the middle
            layout.getChildren().add(button);
            Scene scene = new Scene(layout, 300, 250);
            window.setScene(scene);
            window.show(); // displays to the user
        }
    }
