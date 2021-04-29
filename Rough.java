import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        // 0 for ROCK
        // 1 for PAPER
        // 2 for SCISSOR
        Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.println(
                "WELCOME TO THE GAME\nChoose one option\nEnter 0 for choosing rock\nEnter 1 for choosing paper\nEnter 2 for choosing scissor");
        System.out.print("Enter the option --> ");
        userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        System.out.println("Computer choice is " + computerInput);
        if (userInput == computerInput) {
            System.out.println("DRAW");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("YOU WIN");
        } else {
            System.out.println("COMPUTER WIN");
        }
        sc.close();
    }
}
