package Lesson_07;

public class Monster {

    public final String TOMBSTONE = "Here lies a dead monster.";

    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int posx  = 0;
    private int posy  = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    public int getAttack() {return attack;}
    public int getMovement() {return movement;}
    public int getHealth() {return health;}
    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public Monster(int newHealth, int newAttack, int newMovement) {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
    }


    // Default constructor
    public Monster() {

    }

}
