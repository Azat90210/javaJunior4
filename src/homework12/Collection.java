package homework12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Collection implements CollectionUtils {

    @Override
    public java.util.Collection<Integer> union(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(a);
        res.addAll(b);
        return res;
    }

    @Override
    public java.util.Collection<Integer> intersection(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        Integer[] aa = a.toArray(new Integer[0]);
        Integer[] bb = b.toArray(new Integer[0]);

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (aa[i] == bb[j]) {
                    res.add(aa[i]);
                    res.add(bb[j]);
                }
            }
        }


        return res;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> res = new HashSet<>();
        res.addAll(a);
        res.addAll(b);
        return res;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> res = new HashSet<>();
        a.retainAll(b);
        res.addAll(a);
        return res;
    }

    @Override
    public java.util.Collection<Integer> difference(java.util.Collection<Integer> a, java.util.Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
       res.addAll(a);
       res.removeAll(b);
        return res;
    }


}
