package lesson22;

public class Mypotok2 implements Runnable {
    @Override
    public void run() {
        for (int i = 200; i < 210; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
