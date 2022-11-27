package lesson13;

import java.util.ArrayList;

public class MyStringUtils implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        String string = "\\d+";
        double v1 = Double.parseDouble(number1);
        double v2 = Double.parseDouble(number2);
        double res = v1 / v2;
        if (number1.equals(null) || number2.equals(null)) {
            throw new NullPointerException();
        } else if (!number1.matches(string) && !number2.matches(string)) {
            throw new NumberFormatException("В number есть символ");
        } else if (v2 == 0) {
            throw new ArithmeticException();
        }

        return res;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        int[] words = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (i != -1) {
                words[i] = text.indexOf(word, i);
            }
        }

        return words;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
