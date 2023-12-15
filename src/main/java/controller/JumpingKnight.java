/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Knight;
import view.View;

/**
 * version: 0.1
 * @author Kamil Cioch
 */
// ta klasa niżej była oryginalnie w projekcie, wszystko opisane to wiadomo co jest 5
public class JumpingKnight {
    public static void main(String[] args){
        View view = new View();
        //creating new view model 
        String startingPosition;
        //creating variable that stoer startingPosition of the Knight
        if (args.length > 0 ) startingPosition = args[0];
        //check, if there is any argument
        else startingPosition = view.askUserForPosition();
        //else - just ask user to insert and argument
        Knight knight = new Knight(startingPosition);
        //creating new knight variable
        view.printMessage ("Possible positions are: " + knight.getPossiblePositionsList());
        //printing message about possible postitions of the knight, using previously calculated list
        view.printMessage ("Czy chcesz nadal testować? ");
        //printing question to user
    }
}

//to co jest poniżej napisałem nowe. Generalnie wprowadzamy z klawiatury 
//najpierw litere, a program sprawdza czy jest mała/duża, ew wywala błąd

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

//to samo jest tutaj  - tylko dla drugiej pozycji - w tym przypadku tylko
//musi sprawdzić litere i ewentualnie zwraca błąd
        
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
    
//jakiś kod tworzący z moich 2 liczb parę obiektów
    
Pair<int,int> parsePositionToNumbers(String position) throws jakiswyjatek {
  if (position.length != 2) throw new JakisWyjatek("bledna pozycja");
  //parsujesz oba znaki sprytnie
  return new Pair<int,int(position.toLower().charAt(0) - 97, position.charAt(1) - 48);
}


//testowy tekst
