package codingTestPractice.java.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Iterator<Integer> iterator1 = arrayList.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        Iterator<Integer> iterator2 = hashSet.iterator();

        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
