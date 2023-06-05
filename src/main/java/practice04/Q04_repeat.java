package practice04;

import java.time.LocalTime;
import java.util.Scanner;

public class Q04_repeat {

    public static int playersDice;
    public static int playerSecond;
    public static int playerScore;
    public static int CPsDice;
    public static int CPsSecond;
    public static int CPsScore;
    public static int counter;

    /*
     Write a method that rolls dice twice and compares the result with the score of the computer by multiplying the result by 2 or 5 according to the second it was rolled.
     If the second of the dice is a multiple of 5, the number of dice will be multiplied by 5 and added to the score.
     If the second of the dice is a multiple of 2, the number of dice will be multiplied by 2 and added to the score.
     If the second of the dice is odd number, the number of dice will be added to the score.
    */
    public static void main(String[] args) {
        rollDicex();
    }
    public static void rollDicex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 'R' to roll the dice");
        if(scanner.next().equalsIgnoreCase("r")){
            playersDice= (int)(Math.random()*6)+1;
            playerSecond= LocalTime.now().getSecond();
            System.out.println("P dice: " +playersDice);
            System.out.println("P second: " +playerSecond);
            if(playerSecond%5==0) {
                playerScore += playersDice*5;
            }else if(playerSecond%2==0) {
                playerScore +=playersDice*2;
            }else{
                playerScore +=playersDice;
            }
            System.out.println("playerScore = " + playerScore);

        }else{
            rollDicex();
        }
            CPsDice= (int)(Math.random()*6)+1;
            CPsSecond= playerSecond+1;
        System.out.println("CP Dice: " +CPsDice);
        System.out.println("CP second: "+CPsSecond);
            if(CPsSecond%5==0) {
                CPsScore += CPsDice*5;
            }else if(CPsSecond%2==0) {
                CPsScore +=CPsDice*2;
            }else{
                CPsScore +=CPsDice;
            }
            System.out.println("CPsScore = " + CPsScore);

        counter++;
        if (counter == 2) {
            if(playerScore>CPsScore){
                System.out.println("You won!!! Congratulations " + "Your Score: " + playerScore + "Computer's Score: "+ CPsScore);
            }else if(CPsScore>playerScore) {
                System.out.println("Computer won!!!" + "Your Score: " + playerScore + "Computer's Score: "+ CPsScore);
            }else {
                System.out.println("It is a draw!!!" + "Your Score: " + playerScore + "Computer's Score: "+ CPsScore);
            }

        }else{
            rollDicex();
        }

    }




}
