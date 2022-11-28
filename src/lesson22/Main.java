package lesson22;

public class Main {
    public static void main(String[] args) {
        Mypotok mp = new Mypotok();
        mp.setDaemon(true);
        mp.start();

        int number = 5;

        Thread myPotok = new Thread(new Mypotok2());
        myPotok.setDaemon(true);
        myPotok.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
