package Lesson_08;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class Lesson_08 {

    public static void main(String[] args) {
        Monster.buildBattleBoard();

        char[][] tempBattleBoard = new char[10][10];

        Monster[] Monsters = new Monster[4];
        Monsters[0] = new Monster(1000, 20, 1, "Youri");
        Monsters[1] = new Monster(500, 40, 2, "Drac");
        Monsters[2] = new Monster(1000, 20, 1, "Frank");
        Monsters[3] = new Monster(1000, 20, 1, "Paul");

        Monster.redrawBoard();
    }

}
