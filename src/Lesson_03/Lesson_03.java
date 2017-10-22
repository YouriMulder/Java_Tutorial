package Lesson_03;

public class Lesson_03 {

    public static void main(String[] args){

        int randomNumber = (int) (Math.random() * 50);
        System.out.println(randomNumber);

        if (randomNumber < 25){
            System.out.println(randomNumber + " is less than 25.");
        }
        else if (randomNumber > 30){
            System.out.println(randomNumber + " is bigger than 30.");
        }
        else {
            System.out.println("This number is not in any of the if statements");
        }

        if (!(false)) {
            System.out.println("I turned false into true");
        }

        if (true
                ){
            System.out.println("Both true");
        }
    }

}
