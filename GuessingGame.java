import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int max=100,min=50;
        int number=min + (int)(Math.random() * ((max - min) + 1));
        // System.out.println(number);

        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int numberOfAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < number) {
                System.out.println("Too low! Try again.");
            } else if (guess > number) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
    }
}
