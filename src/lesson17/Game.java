package lesson17;

import java.util.ArrayList;
import java.util.Random;

public class Game<T> {
    Random random = new Random();
    int winRed = random.nextInt(5);
    int winBlue = random.nextInt(5);


    public <T> void printWinner(T t1, T t2) {
        if (winRed > winBlue) {
            System.out.println(t1);
        } else {
            System.out.println(t2);
        }

    }
}
