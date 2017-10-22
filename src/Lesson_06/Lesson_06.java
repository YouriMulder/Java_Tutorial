package Lesson_06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson_06 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How old are you?");
        int age = checkValidAge();

        if (age != 0) {
            System.out.println("You're " + age + " years old.");
        }

    }

    public static int checkValidAge(){
        try{
            return userInput.nextInt();
        } catch (InputMismatchException e) {
            userInput.next();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            return 0;
        }
    }



    public static void divideByZero(int a) {

        try {
            System.out.println(a/0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }

}
