package lesson15;

import java.util.TreeSet;
import org.apache.log4j.Logger;

public class Main {
    public static final Logger LOGGER = Logger.getLogger(lesson16.Main.class);
    public static void main(String[] args) {

        Tovar tovar1 = new Tovar("phone", 10000);
        Tovar tovar2 = new Tovar("computer", 30000);
        Tovar tovar3 = new Tovar("microvafe", 5000);
        Tovar tovar4 = new Tovar("tv", 8000);
        Tovar tovar5 = new Tovar("samokat", 6000);
        LOGGER.warn("Добавлен товар");

        Otziv otziv1 = new Otziv(5, "Good");
        Otziv otziv2 = new Otziv(4, "Very nice");
        Otziv otziv3 = new Otziv(4, "So so");
        Otziv otziv4 = new Otziv(2, "Can be better");
        Otziv otziv5 = new Otziv(1, "Awefull");
        Otziv otziv6 = new Otziv(3, "Bla bla bla");
        Otziv otziv7 = new Otziv(5, "Ya ya zer good");
        Otziv otziv8 = new Otziv(1, "Bad");

        Obzor obzor1 = new Obzor("I used it 1 month and it broken", "qwe");
        Obzor obzor2 = new Obzor("Very nice thing", "qaz");

        tovar1.addOtziv(otziv1);
        tovar2.addOtziv(otziv2);
        tovar3.addOtziv(otziv3);
        tovar4.addOtziv(otziv4);
        tovar5.addOtziv(otziv5);
        tovar1.addObzor(obzor1);
        tovar4.addObzor(obzor2);
        tovar5.addOtziv(otziv6);
        tovar4.addOtziv(otziv7);
        tovar5.addOtziv(otziv8);

        TreeSet <Tovar> tovars= new TreeSet<>();

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        System.out.println(tovars);
        System.out.println("____________________________");

        TreeSet <Tovar> sortByName = Tovar.sortByNameFromTo(tovars);
        System.out.println(sortByName);
        System.out.println("____________________________");

        TreeSet <Tovar> sortByRateFromTo = Tovar.sortByRateFromTo(tovars);
        System.out.println(sortByRateFromTo);
        System.out.println("____________________________");

        TreeSet <Tovar> sortByOtzivFromTo = Tovar.sortByOtzivFromTo(tovars);
        System.out.println(sortByOtzivFromTo);
        System.out.println("____________________________");

        TreeSet <Tovar> sortByObzorFromTo = Tovar.sortByObzorFromTo(tovars);
        System.out.println(sortByObzorFromTo);
        System.out.println("____________________________");
        // по рейтигу, по отзывам и по обзорам
    }
}
