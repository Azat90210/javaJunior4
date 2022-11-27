package lesson22;

public class Pevec2 extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count<9) {
            synchronized (iMonitoring.MICROPHONE) {
                try {
                    iMonitoring.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("Lala - Lala - Lala");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
            }
            synchronized (iMonitoring.MICROPHONE) {
                iMonitoring.MICROPHONE.notify();
            }

        }
    }
}
