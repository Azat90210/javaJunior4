package samost;

public class Main2 {
    public static void main(String[] args) {


    int n = 6; //сектора
    int k = 2; //двери

    int[] arr = new int[]{2, 5, 4, 2, 6, 2}; // работники в секторах
    int[] arr1 = new int[]{5, 4, 2};
    int[] arr2 = new int[]{6, 2, 2};
        int res = 0;
    int res1 = 0;
    int res2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            res = arr1[i]*i;
            res1 = res1 + res;

        }

        for (int i = 0; i < arr2.length; i++) {
            res = arr2[i]*i;
            res2 = res2 + res;

        }
        res = res1+ res2;
        System.out.println(res);
    }
}
