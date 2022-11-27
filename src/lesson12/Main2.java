package lesson12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();

        HashSet<String> string = new HashSet<>();
        string.add("qq");
        string.add("qq");
        string.add("ww");
        string.add("ee");
        string.add("rr");

        System.out.println(string);
    }
}
