package Lesson_03;

public class Lesson_03_1 {

    public static void main(String[] args){
        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;

        System.out.println(biggestValue);

        // Switch statements

        char theGrade = 'B';

        switch (theGrade){
            case 'A':
                System.out.println("Great job!");
                break;
            case 'B':
                System.out.println("Good job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("You fucked up!");
                break;

        }


    }

}
