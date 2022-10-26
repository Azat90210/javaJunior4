package lesson22;

public class Mypotok extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 100; i < 110; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
