package codingTestPractice.datastructure.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection_pr {

    public static void main(String[] args) {
        //List : LinkedList, Stack, Vector, ArrayList (순서가 있는 데이터의 집합, 중복 허용)

        List<Integer> list = List.of(2, 1, 4, 1);
        System.out.println(list);//[2, 1, 4, 1]

        //LinkedList
        List<Integer> linkedList = new LinkedList<>(){{
            add(2);
            add(1);
            add(4);
            add(1);
        }};

        System.out.println(linkedList);//[2, 1, 4, 1]
        linkedList.remove(2);//[2, 1, 1]

        System.out.println(linkedList);
        System.out.println(linkedList.get(0));//2

        //ArrayList
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 1, 4, 1));

        arrayList.add(5);
        System.out.println(arrayList);//[2, 1, 4, 1, 5]
        arrayList.remove(1);
        System.out.println(arrayList);//[2, 4, 1, 5]

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(1);
        stack.add(4);
        System.out.println(stack);//[2, 1, 4]
        System.out.println(stack.pop());//4
        System.out.println(stack.peek());//1
        System.out.println(stack.indexOf(2));//0

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(1);
        queue.add(4);
        System.out.println(queue);//[2, 1, 4]
        System.out.println(queue.poll());//2
        System.out.println(queue);
        System.out.println(queue.peek());//1
        queue.remove(1);
        System.out.println(queue);//[4]


        //Set : HashSet, TreeSet, LinkedHashSet (순서가 없는 데이터의 집합, 중복 허용 X)
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        System.out.println(hashSet);//[1, 2, 4]

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(2);
        System.out.println(treeSet);//[1, 2, 5] -> 오름차순으로 정렬

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);//[1, 5, 2] -> 추가된 순서대로 저장됨.


        //Map : HashMap, Hashtable, TreeMap, LinkedHashMap (키와 값의 쌍으로 이루어져 있고, 키를 기준으로 중복 허용하지 않음)

        //HashMap
        Map<Integer, String> hashMap = new HashMap<>(){{
            put(2,"a");
            put(4,"c");
            put(3,"d");
        }};

        System.out.println(hashMap);
        for(Map.Entry<Integer, String> entry:hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        for(Integer key : hashMap.keySet()){
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        //Hashtable
        //TreeMap
        Map<Integer, String> treeMap=new TreeMap<>(){{
            put(2,"a");
            put(4,"c");
            put(3,"d");
        }};

        System.out.println(treeMap);//{2=a, 3=d, 4=c} 오름차순으로 정렬

        //LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(){{
            put(2,"a");
            put(4,"c");
            put(3,"d");
        }};

        System.out.println(linkedHashMap);//{2=a, 4=c, 3=d} 데이터를 추가한 순서대로 저장



    }
}
