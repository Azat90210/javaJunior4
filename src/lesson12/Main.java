package lesson12;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet <Coins> coins = new HashSet<>();
        Coins a = new Coins(1, 2 , "med");
        Coins b = new Coins(2, 2 , "serebro");
        Coins c = new Coins(3, 2 , "zoloto");
        coins.add(a);
        coins.add(b);
        coins.add(c);
        System.out.println(coins);

    }
}
