package lesson17;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        TeamBlue starsie = new TeamBlue("Старшие");
        People peopleStarsie1 = new People("Василий", 14);
        People peopleStarsie2 = new People("Ольга", 13);
        People peopleStarsie3 = new People("Владимир", 12);

        starsie.addPeople(peopleStarsie1);
        starsie.addPeople(peopleStarsie2);
        starsie.addPeople(peopleStarsie3);

        TeamBlue starsie1 = new TeamBlue("Старшаки");
        People peopleStarsie4 = new People("Елена", 17);
        People peopleStarsie5 = new People("Петр", 16);
        People peopleStarsie6 = new People("Ульяна", 15);

        starsie1.addPeople(peopleStarsie4);
        starsie1.addPeople(peopleStarsie5);
        starsie1.addPeople(peopleStarsie6);

        TeamRed mladsie = new TeamRed("Начальные классы");
        People peopleMladsie1 = new People("Аркадий", 7);
        People peopleMladsie2 = new People("Анна", 8);
        People peopleMladsie3 = new People("Владимир", 9);

        mladsie.addPeople(peopleMladsie1);
        mladsie.addPeople(peopleMladsie2);
        mladsie.addPeople(peopleMladsie3);

        TeamRed mladsie1 = new TeamRed("Дошкольники");
        People peopleMladsie4 = new People("Оксана", 6);
        People peopleMladsie5 = new People("Анатолий", 6);
        People peopleMladsie6 = new People("Елена", 6);

        mladsie1.addPeople(peopleMladsie4);
        mladsie1.addPeople(peopleMladsie5);
        mladsie1.addPeople(peopleMladsie6);


        Game<TeamRed> qwe = new Game<>();
        System.out.println("Победитель среди младших классов: ");
        qwe.printWinner(mladsie, mladsie1);

        Game<TeamBlue> ewq = new Game<>();
        System.out.println("Победитель среди старших классов: ");
        ewq.printWinner(starsie, starsie1);


    }
}
