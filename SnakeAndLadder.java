/*
Problem Statement:- Snake & Ladder Simulator

Program Overview:-
This Program simulates a Snake and Ladder Game.
The Players starts from 0 rolls the dice to get a number between 1 to 6,
finds a safe place, ladder or a snake keeps doing till the winning spot 100 is achieved.

@author Pratik Valvi
*/

public class SnakeAndLadder {
    //Function to mimic the Real Dice
    public static int Roll_Dice() {
    	final int min = 1;
    	final int max = 6;
        return (int) (Math.random() * (max - min + 1) + min);
    }
    
    public static void main(String args[]) {
        int diceFaceNumber = Roll_Dice();
        System.out.println(diceFaceNumber);
    }
}
