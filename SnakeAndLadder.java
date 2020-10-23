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

    //Function to give option No Play, Ladder & Snake
    public static int Play_Option() {
        final int min = 1;
        final int max = 3;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String args[]) {
        int playerOne = 0 ;
        int diceFaceNumber = Roll_Dice();
        int playOption = Play_Option();
        System.out.println("You have got "+diceFaceNumber);

        //Check for Option using Switch Case
        switch(playOption) {
            case 1:
                System.out.println("Sorry!! No Play.");
                break;
            case 2:
                System.out.println("Put a smile on your face!! You got a Ladder.");
                playerOne += diceFaceNumber;
                break;
            case 3:
                System.out.println("So Sad!! You were eaten by a Snake.");
                if (playerOne > 0) {
                    playerOne -= diceFaceNumber;
                } else {
                    ;;
                }
                break;
            default:
                System.out.println("Something went wrong");
        }
        System.out.println("Your Position is at "+playerOne);
    }
}
