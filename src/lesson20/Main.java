package lesson20;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        CopyIO cIO = new CopyIO();
        cIO.copy("C:\\Users\\user\\Desktop\\ДБО\\ФОТО 1 смена 2020\\Солнечный\\_jlGPwO1eEQ.jpg", "qwe.jpg");
        long end = System.currentTimeMillis();
        System.out.println("Время работы старого IO = " + (end - start));

    }
}
