package Lesson_04;

import java.util.Scanner;


public class Lesson_04 {

    static Scanner ui = new Scanner(System.in);



    public static void main(String[] args){

        // intro to while loops
        int i = 1;

        while (i <= 20) {
            if (i == 3) {
                i+=2;
                continue;
            }
            System.out.println(i);

            if ((i%2) == 0){
                System.out.println("odd");
                i++;
            }
            else{
                i++;
            }

        }

        // calculate pi

        double myPi = 4.0;
        double j = 3.0;

        while (j < 99999) {

            myPi = myPi - (4/j) + (4/(j+2));
            j += 4;
            System.out.println(myPi);
        }



        String name = "y";
        int h = 1;

        while (name.equalsIgnoreCase("Y")){
            System.out.println(h);
            System.out.println("continue");
            name = ui.nextLine();
            h++;
        }


    }
}
