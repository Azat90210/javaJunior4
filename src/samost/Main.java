package samost;

public class Main {
    public static void main(String[] args) {
        //Пример 1
        int W = 10, H = 6;// начальная ширина и высота
        int w = 4, h = 8;// конечная ширина и высота
        int sgibW = 0;
        int sgibH = 0;
        int sgib = 0;

        System.out.println("Начальная ширина листа: "+ W + ". Начальная высота листа: " + H);
        System.out.println("Конечная ширина листа: "+ w + ". Конечная высота листа: " + h);

        if ((W >= w && H >= h) || ( W >= h && H >= w)) {
            while (W > w) {
                W = W / 2;
                sgibW++;
            }

            while (H > h) {
                H = H / 2;
                sgibH++;
            }
            sgib = sgibH + sgibW;
            System.out.println("Минимальное количество сгибов " + sgib);
        } else {
            System.out.println(-1);
        }
    }
}
