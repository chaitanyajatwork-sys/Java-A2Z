import java.util.Random;
import java.util.Scanner;

class Game {

    private int number;
    private int userInput;
    private int noOfGuesses = 0;

    // Constructor
    Game() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1; // 1 to 100
    }

    // Take user input
    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        userInput = sc.nextInt();
    }

    // Check guess
    boolean isCorrectNumber() {
        noOfGuesses++;

        if (userInput == number) {
            System.out.println("Correct! You guessed the number.");
            return true;
        } else if (userInput < number) {
            System.out.println("Too low!");
        } else {
            System.out.println("Too high!");
        }

        return false;
    }

    // Getter
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
}

public class noguessergamx {
    public static void main(String[] args) {

        Game g = new Game();
        boolean guessed = false;

        while (!guessed) {
            g.takeUserInput();
            guessed = g.isCorrectNumber();
        }

        System.out.println("Number of guesses: " + g.getNoOfGuesses());
    }
}