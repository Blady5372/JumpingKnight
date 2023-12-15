//Controller

package controller;

import model.Knight;
import view.View;

/**
 * version: 0.1
 * @author Kamil Cioch
 */
public class JumpingKnight {
    private model.Knight model; 
    private view.View view;    

    public JumpingKnight(model.Knight model, view.View view) {  
        this.model = model;
        this.view = view;
    }

    public void startTesting() {
        String startingPosition = view.askUserForPosition();
        model = new model.Knight(startingPosition); 
        view.printPossiblePositions(model.getPossiblePositionsList());

        boolean continueTesting = view.getAnswerFromUser("Czy chcesz nadal testować? (tak/nie)").equalsIgnoreCase("tak");

        while (continueTesting) {
            String newPosition = view.askUserForPosition();
            model = new model.Knight(newPosition); 
            view.printPossiblePositions(model.getPossiblePositionsList());
            continueTesting = view.getAnswerFromUser("Czy chcesz nadal testować? (tak/nie)").equalsIgnoreCase("tak");
        }
    }

    public static void main(String[] args) {
        // Stworzenie obiektów modelu, widoku i kontrolera
        model.Knight model = new model.Knight("");
        view.View view = new view.View();
        JumpingKnight controller = new JumpingKnight(model, view);

        // Rozpoczęcie testowania
        controller.startTesting();
    }
}