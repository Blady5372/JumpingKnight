package model;

/**
 * This class define how Knight works
 * @author Kamil Cioch
 * @version 0.1
 */

public class Knight {
    private String possiblePositionsList;

    public Knight(String position) {
        this.possiblePositionsList = calculatePossibleMoves(position);
    }

    private String calculatePossibleMoves(String position) {
        //calculating possible moves and output
        return "";
    }

    public String getPossiblePositionsList() {
        return possiblePositionsList;
    }

    public boolean validateStartingPosition(String startingPosition) {
        // Logika walidacji pozycji startowej
        // Możesz sprawdzić, czy pozycja jest poprawna zgodnie z zasadami szachów
        return true; // Zwróć true, jeśli pozycja jest poprawna, w przeciwnym razie false
    }
}
