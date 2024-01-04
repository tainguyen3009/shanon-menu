/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

import model.ShannonsTheorem;
import view.ShannonsView;
/**
 *
 * @author Tai Nguyen
 *  041086103
 * The `ShannonsPresenter` class is responsible for handling user input, calculating results using Shannon's Theorem,
 * and updating the associated view with the calculated values or error messages.
 * It acts as a mediator between the model (`ShannonsTheorem`) and the view (`ShannonsView`).
 */
public class ShannonsPresenter {
    private ShannonsView view;
    private ShannonsTheorem theorem;
    /**
     * Constructs a new instance of `ShannonsPresenter`.
     * @param theorem The model component representing Shannon's Theorem.
     * @param view The view component associated with the presenter
     */
    public ShannonsPresenter(ShannonsTheorem theorem, ShannonsView view){
        this.view = view;
        this.theorem = theorem;
        view.getCalculateButton().setOnAction(e -> handle());
    }
    
    
  
    
   
/**
 * Handles the user input, calculates the result using shannon's theorem, and updates the view accordingly
 */
    private void handle() {
        String resultField = "";
        String bandWidthInput = view.getBandWidthField().getText();
        String signalPowerInput = view.getSignalPowerField().getText();
        String noisePowerInput = view.getNoisePowerField().getText();
        
        try{ 
            theorem.setBandWidth(Double.parseDouble(bandWidthInput));
            theorem.setNoisePower(Double.parseDouble(noisePowerInput));
            theorem.setSignalPower(Double.parseDouble(signalPowerInput));
            
            resultField = String.valueOf(theorem.calculateResultField());
            view.getResultField().setText(resultField);
        } catch (NumberFormatException e){
            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input Error");
            alert.setHeaderText("Please enter a valid number: ");
            alert.setContentText(bandWidthInput + "\n" + signalPowerInput + "\n" + noisePowerInput);
            alert.showAndWait();
            
            view.getBandWidthField().setText("");
            view.getSignalPowerField().setText("");
            view.getNoisePowerField().setText("");
            view.getResultField().setText("");
            return;
        }
    }
    }

