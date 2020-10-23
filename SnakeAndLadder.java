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

    //Function to give option like 1) No Play, 2) Ladder & 3) Snake
    public static int Play_Option() {
        final int min = 1;
        final int max = 3;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        int playerOne = 0;          //Player1 Position
        int playerTwo = 0;          //Player2 Posotion
        int dicePlayed_p1 = 0;      //Count of Player1 Dice played
        int dicePlayed_p2 = 0;      //Count of Player2 Dice played
        int diceFaceNumber = 0;     //Dice Face Number from 1 to 6
        int playOption = 0;         //Play Option from 1 to 3

        while (true) {
            System.out.println();
            System.out.println("Player 1's Turn.");
            //Computing Dice Face Number & Play Option for Player1
            diceFaceNumber = Roll_Dice();
            dicePlayed_p1++;
            playOption = Play_Option();
            System.out.println("You have got " + diceFaceNumber);

            //Check for Player1 Option using Switch Case
            switch (playOption) {
                case 1:
                    System.out.println("Sorry!! No Play.");
                    break;
                case 2:
                    System.out.println("Put a smile on your face!! You got a Ladder.");
                    playerOne += diceFaceNumber;
                    //Check if Players Position is going beyond 100 if yes prevent it from happening.
                    if (playerOne > 100) {
                        System.out.println("Oops!! You went too far.");
                        playerOne -= diceFaceNumber;
                    }
                    break;
                case 3:
                    System.out.println("So Sad!! You were eaten by a Snake.");
                    //Check if Players Position is going below 0 if yes prevent it from happening.
                    int num = playerOne - diceFaceNumber;
                    if (num < 0) {
                        ;;
                    } else {
                        playerOne -= diceFaceNumber;
                    }
                    break;
                default:
                    System.out.println("Something went wrong");
            }
            System.out.println("Player 1's position is at " + playerOne);
            System.out.println();

            System.out.println("Player 2's Turn.");
            //Computing Dice Face Number & Play Option for Player2
            diceFaceNumber = Roll_Dice();
            dicePlayed_p2++;
            playOption = Play_Option();
            System.out.println("You have got " + diceFaceNumber);

            //Check for Player2 Option using Switch Case
            switch (playOption) {
                case 1:
                    System.out.println("Sorry!! No Play.");
                    break;
                case 2:
                    System.out.println("Put a smile on your face!! You got a Ladder.");
                    playerTwo += diceFaceNumber;
                    //Check if Players Position is going beyond 100 if yes prevent it from happening.
                    if (playerTwo > 100) {
                        System.out.println("Oops!! You went too far.");
                        playerTwo -= diceFaceNumber;
                    }
                    break;
                case 3:
                    System.out.println("So Sad!! You were eaten by a Snake.");
                    //Check if Players Position is going below 0 if yes prevent it from happening.
                    int num = playerTwo - diceFaceNumber;
                    if (num < 0) {
                        ;;
                    } else {
                        playerTwo -= diceFaceNumber;
                    }
                    break;
                default:
                    System.out.println("Something went wrong");
            }
            System.out.println("Player 2's position is at " + playerTwo);

            if (playerOne == 100 || playerTwo == 100){
                if (playerOne == 100) {
                    System.out.println();
                    System.out.println("Congratulations!! Player1 has won this round");
                    System.out.println("Player1 played Dice for "+dicePlayed_p1+" times.");
                } else {
                    System.out.println();
                    System.out.println("Congratulations!! Player2 has won this round");
                    System.out.println("Player2 played Dice for "+dicePlayed_p2+" times.");
                }
                break;
            }
        }
    }
}