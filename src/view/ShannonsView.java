/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Tai Nguyen
 * 041086103
 * The `ShannonsView` class represents the graphical user interface for the Shannons Theorem application.
 * It extends `GridPane` and contains labels, text fields, and a button for user input and interaction.
 * The class provides methods to access and retrieve user inputs and results.
 */
public class ShannonsView extends GridPane{

private Label bandWidthLabel;
private Label signalPowerLabel;
private Label noisePowerLabel;
private TextField bandWidthField;
private TextField signalPowerField;
private TextField noisePowerField;
private Label resultFieldLabel;
private TextField resultField;
    
    
private Button calculateButton;
   
 
    
    /**
     * Constructs a new instance of `ShannonsView` and initializes the graphical components.
     */
    public ShannonsView(){
        // Label input
        bandWidthLabel = new Label("Bandwidth");
        signalPowerLabel = new Label("Signal Power");
        noisePowerLabel = new Label("Noise Power");
        bandWidthField = new TextField();
        signalPowerField = new TextField();
        noisePowerField = new TextField();
        
        // output
        resultFieldLabel = new Label("Result: ");
        resultField = new TextField();
        resultField.setEditable(false);
        
        //button
        calculateButton = new Button("Calculate");
        
        layoutForm();
    }
/**
 * Sets up the layout of the graphical components within the 'GridPane'.
 */
    private void layoutForm(){
        this.setHgap(6);
        this.setVgap(6);
        
        //Label
        this.add(bandWidthLabel,1,2);
        this.add(signalPowerLabel,1,3);
        this.add(noisePowerLabel, 1, 4);
        this.add(resultFieldLabel, 1, 5);
        
        //Fields
        this.add(bandWidthField, 2, 2);
        this.add(signalPowerField, 2, 3);
        this.add(noisePowerField, 2, 4);
        this.add(resultField,2,5);
        
        //Button
        VBox button = new VBox(calculateButton);
        calculateButton.setMaxWidth(Double.MAX_VALUE);
        this.add(calculateButton,3,2,1,5);
    }


   /**
    * Gets the bandwidth text field.
    * @return The `TextField` for bandwidth input.
    */
    public TextField getBandWidthField() {
        return bandWidthField;
    }
/**
 * Gets the signal power text field.
 * @return The `TextField` for signal power input.
 */
     public TextField getSignalPowerField() {
        return signalPowerField;
    }

     /**
      * Gets the noise power text field.
      * @return The `TextField` for noise power input.
      */
    public TextField getNoisePowerField() {
        return noisePowerField;
    }

/**
 * Gets the result text field.
 * @return The `TextField` for displaying the calculation result.
 */
    public TextField getResultField() {
        return resultField;
        }

    
/**
 * Gets the calculate button.
 * @return The `Button` for triggering the calculation.
 */
    public Button getCalculateButton() {
        return calculateButton;
    }
    
}
