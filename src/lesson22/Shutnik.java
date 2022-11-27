package lesson22;

public class Shutnik  extends Thread{
    @Override
    public void run() {

        while (true) {
            synchronized (iMonitoring.MICROPHONE) {
                try {
                    iMonitoring.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("ha - ha - ha");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (iMonitoring.MICROPHONE) {
                iMonitoring.MICROPHONE.notify();
            }

        }
    }
}
