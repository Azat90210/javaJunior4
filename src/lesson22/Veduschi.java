package lesson22;

public class Veduschi {
    public static void main(String[] args) {
        System.out.println("Начало концерта");
        Pevec pevec = new Pevec();
        pevec.start();
        Shutnik shutnik = new Shutnik();
        shutnik.setDaemon(true);
        shutnik.start();
        while (pevec.isAlive()) {
        }
        System.out.println("Концерт закончился! Расходитесь");
    }
}
