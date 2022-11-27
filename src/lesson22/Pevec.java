package lesson22;

public class Pevec extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count<9) {
            for (int i = 0; i < 3; i++) {
                System.out.println("La - la - la");
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
            synchronized (iMonitoring.MICROPHONE) {
                try {
                    iMonitoring.MICROPHONE.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
