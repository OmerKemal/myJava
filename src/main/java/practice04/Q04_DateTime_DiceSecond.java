package practice04;

import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Scanner;

public class Q04_DateTime_DiceSecond {

    /*
     Write a method that rolls dice twice and compares the result with the score of the computer by multiplying the result by 2 or 5 according to the second it was rolled.
     If the second of the dice is a multiple of 5, the number of dice will be multiplied by 5 and added to the score.
     If the second of the dice is a multiple of 2, the number of dice will be multiplied by 2 and added to the score.
     If the second of the dice is odd number, the number of dice will be added to the score.
    */

    static int playerDice;
    static int computerDice;
    static int playerSecond;
    static int computerSecond;
    static int playerScore;
    static int computerScore;
    static int counter;

    public static void main(String[] args) {
        rollDice();

    }

    public static void rollDice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter R to roll the dice");
        if (scanner.next().equalsIgnoreCase("r")){
            playerDice=(int)(Math.random()*6) +1;
            System.out.println("Player Dice = " + playerDice);
            playerSecond = LocalTime.now().getSecond();
            System.out.println("Player Second is " + playerSecond);

            if (playerSecond%5==0) {
                playerScore += playerDice*5;
            }else if (playerSecond%2== 0) {
                playerScore+=playerDice*2;
            }else {
                playerScore+= playerDice;
            }
            System.out.println("PlayerScore:" + playerScore);

        }else{
            rollDice();
        }

            computerDice=(int)(Math.random()*6) +1;
            System.out.println("Computer Dice = " + computerDice);
            computerSecond = playerSecond+1;
            System.out.println("Computer Second is " + computerSecond);

            if (computerSecond%5==0) {
                computerScore += computerDice*5;
            }else if (computerSecond%2== 0) {
                computerScore+=computerDice*2;
            }else {
                computerScore+= computerDice;
            }
            System.out.println("ComputerScore:" + computerScore);


        counter++;
        if (counter == 2) {
            if (playerScore>computerScore){
                System.out.println("You won, Your score is: " + playerScore + " -- Computer's score is: " + computerScore);
            }else if (computerScore>playerScore){
                System.out.println("Computer won Your score is: " + playerScore + " -- Computer's score is: " + computerScore);
            }else{
                System.out.println("it is a draw");
            }

        }else {
            rollDice();
        }
    }
}
