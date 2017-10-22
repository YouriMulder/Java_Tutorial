package Lesson_02;

import java.util.Scanner;

public class Lesson_02 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Youri favorite number: ");

        if (userInput.hasNextInt()){

            int numberEntered = userInput.nextInt();
            System.out.println("You entered: " + numberEntered);

            int numEnteredTimes2 = numberEntered * 2;
            System.out.println("The number times two is: " + numEnteredTimes2);

            int numEnteredMinus2 = numberEntered - 2;
            System.out.println("The number minus two is: " + numEnteredMinus2);

            int numberABS = Math.abs(numberEntered);
            int whichIsBigger = Math.max(5,10);
            System.out.println(numberABS + ' ' + whichIsBigger);


        } else {

            System.out.println("Enter an integer next time");
        }
    }
}
