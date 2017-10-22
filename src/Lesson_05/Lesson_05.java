package Lesson_05;

import java.util.Scanner;


public class Lesson_05 {

    static int randomNumber; // Class Variable
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(getRandomNum());

        int guessResult = 0;
        int randomGuess = 0;

        while (guessResult != -1) {
            System.out.println("Guess a number between 0 and 50: ");
            randomGuess = userInput. nextInt();
            guessResult = checkGuess(randomGuess);

        }

        System.out.println("You guessed it.");


    }

    public static int addThem(int a, int b) {

        int result = a + b;
        return result;

    }

    public static void tryToChange(int d) {

        d = d + 1;
        System.out.println("TryToChange " + d);

    }

    public static int getRandomNum() {
        randomNumber = (int) (Math.random() * 51);
        return randomNumber;
    }

    public static int checkGuess(int guess) {
        if (guess == randomNumber) {
            return -1;
        } else {
            return guess;
        }
    }



}
