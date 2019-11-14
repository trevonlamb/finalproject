package Mai;

import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class main2 extends Application {

    private Stage window;
    private Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        //Button 1
        //Created a label and a button object
        Label label1 = new Label("Welcome to the weight converter for different planets!");
        Button button1 = new Button("Mercury");
        //button action makes us go to another scene with different physical contents of JavaFx application
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        layout1.setAlignment(Pos.CENTER); // positions the label and the button at the center
        scene1 = new Scene(layout1, 300, 300);


        //Button 2
        //created a button object
        Button button2 = new Button("This sucks, go back to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        //Display scene 1 at first
        window.setScene(scene1);
        window.setTitle("Pick a Planet");
        window.show();
    }

}