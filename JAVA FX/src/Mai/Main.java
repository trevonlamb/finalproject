package Mai;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        //This is a method inside the application class( calls method first
        // then goes into application and set this up as a javafx)
        // Then application calls start which is basically the main method for javafx
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window"); //sets the title as title of the window
        button = new Button ();
        button.setText("Click me");
        button.setOnAction(e -> {
            System.out.println("Thanks for clicking on my button");
            System.out.println("Let's see how many times you can click on my button");
            System.out.println("Have a nice day");
        }); //whenever an event occurs on this button look in this class to handle the code

        StackPane layout = new StackPane(); // positions button in the middle
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show(); // displays to the user
    }

    /*@Override
    public void handle(ActionEvent event) { //handle gets called when event occurs
        if(event.getSource()==button){  //if source of the event is the button
            System.out.println("Thanks for clicking on my button!");
        }
    }*/
}
