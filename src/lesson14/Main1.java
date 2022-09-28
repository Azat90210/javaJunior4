package lesson14;

import java.util.HashMap;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        TreeMap<Integer, Student> map = new TreeMap<>();
        Student student = new Student("Petya", 23);
        Student student1 = new Student("Vasya", 32);
        Student student2 = new Student("Kuzya", 24);
        Student student3 = new Student("Vasya", 25);

        map.put(4, student);
        map.put(5, student1);
        map.put(89, student2);
        map.put(1, student3);

        System.out.println(map);
    }
}
