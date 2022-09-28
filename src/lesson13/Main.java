package lesson13;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setName("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            p.setAge(124);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Выполняется обязательно");
        }

    }
}
