package codingTestPractice.datastructure.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_pr {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashTable = new Hashtable<>(){{
            put("a",1);
            put("b",2);
            put("c",3);
            put("d",4);
        }};

        System.out.println(hashTable.get("a"));//1
        System.out.println(hashTable.remove("d"));//4

        System.out.println(hashTable);//{b=2, a=1, c=3}

        for(Map.Entry<String, Integer> e:hashTable.entrySet()){
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        Set<String> keys = hashTable.keySet();

        for(String key:keys){
            System.out.println("Value: "+hashTable.get(key));
        }

        Enumeration<String> keys2 = hashTable.keys();
        while(keys2.hasMoreElements()){
            String key = keys2.nextElement();
            Integer value = hashTable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        HashMap<String, Integer> hashMap = new HashMap<>(){{
            put(null, null);
            put("a",1);
            put("b",2);
            put("c",3);
            put("d",4);
        }};

        hashMap.remove("c");

        for(Map.Entry<String, Integer> e: hashMap.entrySet()){
            System.out.println("Key: "+e.getKey() + " Value: "+e.getValue());
        }

        TreeMap<String, Integer> treeMap = new TreeMap<>(){{
            put("c",1);
            put("a",2);
            put("b",3);
            put("d",4);
        }};
        System.out.println(treeMap);//{a=2, b=3, c=1, d=4}

        treeMap.remove("d");

        System.out.println(treeMap);

    }
}
