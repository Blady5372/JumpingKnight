package controller;

import model.Knight;
import view.View;

/**
 * version: 0.1
 * @author Kamil Cioch
 */
public class JumpingKnight {
    public static void main(String[] args){
        View view = new View();
        String startingPosition;
        if (args.length > 0 ) startingPosition = args[0];
        else startingPosition = view.askUserForPosition();
        Knight knight = new Knight(startingPosition);
        view.printMessage ("Possible positions are: " + knight.getPossiblePositionsList());
        view.printMessage ("Czy chcesz nadal testować? ");
    }
}

//todo - javadoc
public class Position {
    public static void gimmeFirstPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą współrzędną konia: ");
        char firstPosition = scanner.next().charAt(0);
        if (firstPosition >= 'A' && firstPosition <='H'){
            firstPosition = 'A' + 1;
        }
        else if (firstPosition >= 'a' && firstPosition <= 'h'){
            firstPosition = 'a' + 1;
        }
        else {
            throw WrongPositionProvidedException;
        }
        scanner.close();

    //todo - javadoc
    public static void gimmeSecondPosition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj drugą współrzędną konia: ");
        char secondPosition = scanner.next().charAt(0);
        if (secondPosition >= '1' && secondPosition <='8'){
            continue; 
        }
        else {
            throw WrongPositionProvidedException;
            //Paweł stwierdził, że tu takie cuś powinno (tzn linia powyżej),
            //ale nwm jak to zaimplementować
            //Wcześniej tutaj i w linii 49 był tylko 'println' 
        }
        scanner.close();
}
    
//todo - javadoc
Pair<int,int> parsePositionToNumbers(String position) throws jakiswyjatek {
  if (position.length != 2) throw new JakisWyjatek("bledna pozycja");
  //parsujesz oba znaki sprytnie
  return new Pair<int,int(position.toLower().charAt(0) - 97, position.charAt(1) - 48);
}
