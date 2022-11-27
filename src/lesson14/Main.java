package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap <Student, Integer> map = new HashMap<>();
        Student student = new Student("Petya", 23);
        Student student1 = new Student("Vasya", 32);
        Student student2 = new Student("Kuzya", 24);
        Student student3 = new Student("Vasya", 25);


        map.put(student,4);
        map.put(student1,5);
        map.put(student2,1);
        map.put(student3,2);

        for(Map.Entry<Student, Integer> m : map.entrySet()){
            System.out.println("Key = " + m.getKey() +", Value = " + m.getValue());
        }

        System.out.println(map);
    }
}
