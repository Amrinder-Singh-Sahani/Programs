import java.util.Scanner;
import java.util.Random;

// Create a class Game which allows a user to play "Guess the Number" game once.
// Game should have the following methods:
// 1. Constructor to generate the random number
// 2. takeuserinput() to take a user input of number
// 3. iscorrectnumber() to detect whether the number entered by the user is true
// 4. getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done.

class game {

    public int number;
    public int inputnumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    game() {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void takeuserinput() {
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    void compare() {

        if (inputnumber < number) {
            System.out.println("The number is less than the generated number.\nTry again!");

        } else if (inputnumber > number) {
            System.out.println("The number is greater than the generated number.\nTry again!");

        }
        // return false;

    }

    void iscorrectnumber() {
        while (inputnumber != number) {
            takeuserinput();
            compare();
            noOfGuesses++;
        }
        System.out.printf("You guessed the number in %d", noOfGuesses);
    }

}

public class tut13prac {
    public static void main(String[] args) {

        game g = new game();
        g.iscorrectnumber();

    }
}