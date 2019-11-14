package FinalMilestone2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

/****************************************************************************
 * Final Project: Weight On Different Planets (WODP)
 ****************************************************************************
 * WODP accepts double inputs for the user's weight and then prompts the user
 * which planet the user wants to find their weight and it returns their weight
 * on that planet.
 *______________________________________________________________________________
 * Firaol, Trevon, Miguel, Rohit
 * October 31st, 2019
 * CMSC_255 - 002
 ****************************************************************************/

public class WeightOnPlanetsFinder extends Application {
    private Stage window;
    private Scene scene1, scene2;
    private Button button1, button2,  Mercury, Venus, Mars, Jupiter, Saturn, Uranus, Neptune;

    TextArea output = new TextArea();

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws FileNotFoundException {
        window = primaryStage;
        TextField weight = new TextField();
        Label label1 = new Label ("Weight : ");
        weight.setPromptText("Input your body weight in pounds: ");
        output.setPromptText("Your weight is: " + weight);
        button1 = new Button("Confirm weight"); // confirming the weight input

        Image [] image = new Image [7];
        image [0] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Mercury.png"));
        image [1] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Venus.png"));
        image [2] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Mars.png"));
        image [3] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Jupiter.png"));
        image [4] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Saturn.png"));
        image [5] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Uranus.png"));
        image [6] = new Image(WeightOnPlanetsFinder.class.getResourceAsStream("Neptune.png"));

        button2 = new Button("Change scene");
        //button action makes us go to another scene with different physical contents of JavaFx application
        button1.setOnAction(e -> window.setScene(scene2));

        Image age = image [0];
        Image age1 = image [1];
        Image age2 = image [2];
        Image age3 = image [3];
        Image age4 = image [4];
        Image age5 = image [5];
        Image age6 = image [6];

        //Setting the image view
        ImageView imageView = new ImageView(age);
        ImageView imageView1 = new ImageView(age1);
        ImageView imageView2 = new ImageView(age2);
        ImageView imageView3 = new ImageView(age3);
        ImageView imageView4 = new ImageView(age4);
        ImageView imageView5 = new ImageView(age5);
        ImageView imageView6 = new ImageView(age6);


        //Setting the position of the image
        imageView.setX(25); //positions Mercury
        imageView.setY(25);
        imageView1.setX(100);//positions Venus
        imageView1.setY(25);
        imageView2.setX(175);// positions Mars
        imageView2.setY(25);
        imageView3.setX(250);// positions Jupiter
        imageView3.setY(25);
        imageView4.setX(325);// positions Saturn
        imageView4.setY(25);
        imageView5.setX(400);// positions Uranus
        imageView5.setY(25);
        imageView6.setX(475);// positions Neptune
        imageView6.setY(25);

        //setting the fit height and width of the image view
        imageView.setFitHeight(75); // height and width of Mercury
        imageView.setFitWidth(75);
        imageView1.setFitHeight(75); // height and width of Venus
        imageView1.setFitWidth(75);
        imageView2.setFitHeight(75); // height and width of Mars
        imageView2.setFitWidth(75);
        imageView3.setFitHeight(75); // height and width of Jupiter
        imageView3.setFitWidth(75);
        imageView4.setFitHeight(75); // height and width of Saturn
        imageView4.setFitWidth(75);
        imageView5.setFitHeight(75); // height and width of Uranus
        imageView5.setFitWidth(75);
        imageView6.setFitHeight(75); // height and width of Neptune
        imageView6.setFitWidth(75);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
        imageView1.setPreserveRatio(true);
        imageView2.setPreserveRatio(true);
        imageView3.setPreserveRatio(true);
        imageView4.setPreserveRatio(true);
        imageView5.setPreserveRatio(true);
        imageView6.setPreserveRatio(true);

        Group root = new Group(imageView,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6);
        Scene scene2 = new Scene(root, 600, 500);

        TextField planet = new TextField();
        planet.setPromptText("Pick the planet that you want to compare your weight with: ");
        // Label label2 = new Label("Input the planet that you want to compare your weight with: ");
        Mercury = new Button ("Mercury");
        Venus = new Button ("Venus");
        Mars = new Button ("Mars");
        Jupiter = new Button ("Jupiter");
        Saturn = new Button ("Saturn");
        Uranus = new Button ("Uranus");
        Neptune = new Button ("Neptune");


        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1, weight, button1, button2, planet, Mercury, Venus, Mars, Jupiter,
                Saturn, Uranus, Neptune);

        scene1 = new Scene(layout, 800,800);

        // Add the scene to the stage
        window.setScene(scene1); // we didn't incorporate the  action of changing scenes, so if you want to observe
        // the pictures of the planets change to scene2

        // Set the title of the Stage
        window.setTitle("Weight On Different Planets");

        // Display the Stage
        window.show();
    }

}
