/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * This class define how Knight works
 * @author Kamil Cioch
 * @version 0.1
 */

public class Knight {
    private String possiblePositionsList;
    /**
     * creating list of positions that are possible for moves
     * @param position 
     */
    public Knight (String position){
    //oblicz możliwe ruchy i zapisz do zmiennej;
        possiblePositionsList = "a2 b3 j5";
    //for now i have n o algorithm yet
    }
    
    public String getPossiblePositionsList(){
        return possiblePositionsList;
    }
    
    public String validateStartingPosition(String startingPosition){
        //checking if starting position is valid - if not, print error message
        return "";
    }
    
}
