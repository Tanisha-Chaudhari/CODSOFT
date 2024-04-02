package internshiptask1;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Random number is" + randomNumber);


        int attemptCount = 0;
        while (true) {

                 System.out.println("Enter your guess (1 to 100) :");

            int UserGuess = scanner.nextInt();
            attemptCount++;

            if (UserGuess == randomNumber) {
                System.out.println("correct...!!");
                System.out.println("you took " + attemptCount +" Attempts to guess the number..");
                break;

            }
            else if (randomNumber > UserGuess) {
                System.out.println("too High guess again");
            }
            else {
                System.out.println("too low guess again");
            }
        }
    }
}
