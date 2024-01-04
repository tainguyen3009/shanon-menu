/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package launch;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ShannonsTheorem;
import view.ShannonsPresenter;
import view.ShannonsView;

/**
 *
 * @author Tai Nguyen
 * 041086103
 * The `ShannonsLaunch` class serves as the entry point for the Shannons Theorem application.
 * It extends the `Application` class from JavaFX and provides the main method to launch the application.
 * The class sets up the graphical user interface and initializes the necessary components.
 */
public class ShannonsLaunch extends Application {
    /**
     * The main method for launching class
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Initializes and starts the Shannons Theorem application.
     * 
     * @param primaryStage The primary stage for the JavaFX application.
     * @throws Exception If an exception occurs during the application startup.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        // create new view, theorem and presenter components
        ShannonsView view = new ShannonsView();
        ShannonsTheorem theorem = new ShannonsTheorem();
        ShannonsPresenter presenter = new ShannonsPresenter(  theorem, view);
        // create new scene
        Scene scene = new Scene(view);
        // set scene for primary stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shannons's THeorem");
        primaryStage.show();
    }

}
