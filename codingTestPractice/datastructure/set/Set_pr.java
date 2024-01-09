package codingTestPractice.datastructure.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_pr {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);

        System.out.println(set);//[1, 2, 3]

        set.remove(3);

        System.out.println(set);//[1, 2]

        System.out.println(set.contains(2));//true
        System.out.println(set.isEmpty());//false
        System.out.println(set.size());//2

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        set.clear();

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println(treeSet);//[1, 2, 3]

        System.out.println(treeSet.first());//1
        System.out.println(treeSet.last());//3

        treeSet.remove(1);

        System.out.println(treeSet);//[2, 3]
        System.out.println(treeSet.size());//2

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);

        System.out.println(linkedHashSet);//[1, 3, 2]

        System.out.println(linkedHashSet.size());//3
        System.out.println(linkedHashSet.isEmpty());//false

        linkedHashSet.remove(2);
        System.out.println(linkedHashSet);//[1, 3]
    }
}
