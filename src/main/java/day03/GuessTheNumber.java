package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(101);

        System.out.println("Guess the Number between 1 - 100!");
        System.out.println("You can try 6 times");
        boolean guessed = false;
        for (int i = 0; i < 6; i++) {
            System.out.println("Tip: ");
            int numberToCheck = scanner.nextInt();
            if (numberToCheck == numberToGuess) {
                System.out.println("Guessed Right!!");
                guessed = true;
                break;
            }
            System.out.println(numberToCheck < numberToGuess ? "Your tip is smaller." : "Your tip is higher.");
        }
        System.out.println(guessed ? "Congratulation!! It was: " + numberToGuess :  "Unfortunety you didn`t guessed the number, it was : " + numberToGuess );


    }

}
