package lesson17;

public class Main {
    public static void main(String[] args) {
        TestParam<String> s = new TestParam<>("QWE");
        TestParam<Integer> i = new TestParam<>(132);
        System.out.println(s.returnParam());
        System.out.println(i.returnParam());
        System.out.println();
        TestParamMetod t = new TestParamMetod();
        t.printType("QWE");
        t.printType(123);
    }
}
