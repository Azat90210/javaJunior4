package lesson13;

public class MainDZ {
    public static void main(String[] args) {
        String number1 = "12";
        String number2 = "2";
        String text = "раз два раз три четыре раз";
        String word = "раз";
        MyStringUtils myStringUtils = new MyStringUtils();


        double div = 0;
        try {
            div = myStringUtils.div(number1, number2);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(div);

        System.out.println("____________________________");

int[] aaa = new int[text.length()];
        try {
            aaa= myStringUtils.findWord(text, word);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(aaa);
        System.out.println("Программа подошла к концу");

    }
}
