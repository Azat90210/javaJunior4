package lesson22;

public class Veduschi {
    public static void main(String[] args) {
        System.out.println("Начало концерта");
        Pevec pevec = new Pevec();
        pevec.start();
//        Shutnik shutnik = new Shutnik();
//        shutnik.setDaemon(true);
//        shutnik.start();
        Pevec2 pevec2 = new Pevec2();
        pevec2.setDaemon(true);
        pevec2.start();

        Pevec3 pevec3 = new Pevec3();
        pevec3.setDaemon(true);
        pevec3.start();
        while (pevec.isAlive()) {
        }
        System.out.println("Концерт закончился! Расходитесь");
    }
}
