import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Guess GuessInstance = new Guess();
        GuessInstance.GuessGame();
    }
}
public class Guess {
    
    Random Rand = new Random();
    int UpperBound = 100;
    int IntRandom = Rand.nextInt(UpperBound);

    public void GuessGame() {
    
        System.out.println("Hello Sogeti and 84.51!");
        System.out.println("To prepare for 84.51, I spent the beginning of this week learning Java");
        System.out.println("I learned the concepts, and can now edit/write/manage Java.");
        System.out.println("To solidify/demonstrate my knowledge, I built a game to guess a random number");
        System.out.println("");


        System.out.println("Enter Guess 0-100:");
        Scanner UserGuess = new Scanner(System.in);
        Integer GuessInt = null;
        GuessInt = UserGuess.nextInt();
        int GuessCounter = 1;

        while (GuessInt != IntRandom ) {
            
            GuessCounter = GuessCounter + 1;

            if (GuessInt < IntRandom) {
                System.out.println("Guess Higher");
            }

            else {
                System.out.println("Guess Lower");
            }

            GuessInt = UserGuess.nextInt();   
        }
    System.out.println("Correct. Number of guesses "  + GuessCounter); 
    }
}