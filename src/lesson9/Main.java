package lesson9;

public class Main {
    public static void main(String[] args) {
        Plants plants = new Plants();
        Vodorosli vodorosli = new Vodorosli("Красные", "Делением", "Подходит для суши", false);
        Moh moh = new Moh("Оранжевые", "Почкованием", "Под полом", true);
        Kornevie kornevie = new Kornevie();
        Ppaportnik ppaportnik = new Ppaportnik("Зеленые", "Корнями", "В горшке", false, true, true);
        Tree tree = new Tree();

        Plants[] arr  = new Plants[]{moh, ppaportnik, vodorosli};

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
