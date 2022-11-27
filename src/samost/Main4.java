package samost;

public class Main4 {
    public static void main(String[] args) {
        double l = 15;
        double kirCount1 = 6;
        double kirCount2 = 6;
        double lKirCount1 = 0;
        double lKirCount2 = 0;

        double[] arr1 = new double[]{2, 2, 2, 3, 2, 2};
        double[] arr2 = new double[]{3, 3, 5, 2, 4, 3,};
        for (int i = 0; i < arr1.length; i++) {
            lKirCount1 = arr1[i] + lKirCount1; // общая длина всех кирпичей
        }
        double lKirCount1Sred = lKirCount1 / arr1.length; // средняя длина 1 го кирпича
        int kirCount1Rise = (int) ((l / 2) / lKirCount1Sred); // количество кирпичей со средней длиной, которые влезают в половину стены
        int kir1Rise = arr1.length / kirCount1Rise; // количество рядов 1 бригады
        System.out.println("Из кирпичей 1-й бригады можно выложить стену в " + kir1Rise + " ряда");


        for (int i = 0; i < arr2.length; i++) {
            lKirCount2 = arr2[i] + lKirCount2; // общая длина всех кирпичей
        }
        double lKirCount2Sred = lKirCount2 / arr1.length; // средняя длина 1 го кирпича
        int kirCount2Rise = (int) ((l / 2) / lKirCount2Sred); // количество кирпичей со средней длиной, которые влезают в половину стены
        int kir2Rise = arr1.length / kirCount2Rise; // количество рядов 2 бригады
        System.out.println("Из кирпичей 1-й бригады можно выложить стену в " + kir2Rise + " ряда");

        if (kir1Rise > kir2Rise) {
            System.out.println("Максимальная высота " + kir1Rise + " ряда");
        } else System.out.println("Максимальная высота " + kir2Rise + " ряда");

    }
}
