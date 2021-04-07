import java.util.Random;
import java.util.Scanner;

public class ScanGuesser {
    public static void main(String[] args) {
        guessingGame();
    }
    public static void guessingGame() {
        Scanner input = new Scanner(System.in);
        int number = new Random().nextInt(10) + 1;
        System.out.println("Please guess a number from 1-10");
        int guess = input.nextInt();
        if (number == guess) {
            System.out.println("You got the right answer!");
        } else {
            System.out.println("Incorrect! The answer was " + number);
        }
    }


}
