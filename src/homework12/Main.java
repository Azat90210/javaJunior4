package homework12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(6);
        arrayList2.add(4);
        arrayList2.add(3);
        arrayList2.add(5);


        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);

        Collection collection = new Collection();
        ArrayList<Integer> union = (ArrayList<Integer>) collection.union(arrayList1, arrayList2);
        ArrayList<Integer> intersection = (ArrayList<Integer>) collection.intersection(arrayList1, arrayList2);
        HashSet<Integer> unionWithoutDuplicate = (HashSet<Integer>) collection.unionWithoutDuplicate (hashSet1, hashSet2);
        HashSet<Integer> intersectionWithoutDuplicate = (HashSet<Integer>) collection.intersectionWithoutDuplicate (hashSet1, hashSet2);
        ArrayList<Integer> difference = (ArrayList<Integer>) collection.difference(arrayList1, arrayList2);


        System.out.println(union);
        System.out.println(intersection);
        System.out.println(unionWithoutDuplicate);
        System.out.println(intersectionWithoutDuplicate);
        System.out.println(difference);

    }
}
