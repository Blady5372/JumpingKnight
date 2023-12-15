package view;

/**
 * @author Kamil Cioch
 * @version 0.1
 */

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void printPossiblePositions(String possiblePositions) {
        System.out.println("Possible positions are: " + possiblePositions);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public String askUserForPosition() {
        System.out.println("Wprowadź pozycję skoczka:");
        return scanner.nextLine();
    }

    public String getAnswerFromUser(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
} 