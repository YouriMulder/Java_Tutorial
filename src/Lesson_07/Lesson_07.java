package Lesson_07;

public class Lesson_07 {

    public static void main(String[] args) {

        Monster Frank = new Monster();
        Frank.name = "Frank";
        System.out.println(Frank.name + " has am attack of " + Frank.getAttack() + " and a health of " + Frank.getHealth());

    }

}