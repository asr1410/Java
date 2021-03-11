import java.util.Random;
import java.util.Scanner;

/**
 * GuessTheNumber 1. constructor to generate random number 2. taske user input
 * 3. is correctNumbr to detect whether the number guess is true 4.getter and
 * setter for no of guesses
 */
class Guess {
    private int computerNo;
    private int userNo;
    private static int noOfGuess;

    Guess() {
        Random random = new Random();
        computerNo = random.nextInt(100);
    }

    public void guessNumber(int x) {
        userNo = x;
        noOfGuess++;
    }

    public int greaterOrSmaller() {
        if (userNo > computerNo) {
            return 1;
        } else if (userNo < computerNo) {
            return -1;
        } else {
            return 0;
        }
    }

    public int totalGuesses() {
        return noOfGuess;
    }
}

public class GuessTheNumber {

    public static void main(String[] args) {
        Guess user = new Guess();
        Scanner sc = new Scanner(System.in);
        int userGuess;
        while (true) {
            System.out.print("Guess the number --> ");
            userGuess = sc.nextInt();
            user.guessNumber(userGuess);
            int temp = user.greaterOrSmaller();
            if (temp == 1) {
                System.out.println("user guess is greater than computer guess");
            } else if (temp == -1) {
                System.out.println("user guess is smaller than computer guess");
            } else {
                System.out.println("You guessed the correct number");
                System.out.println("Total attempt taken to guess the number are " + user.totalGuesses());
                break;
            }
        }
        sc.close();
    }
}