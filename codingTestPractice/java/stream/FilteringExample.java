package codingTestPractice.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    필터링
 */
public class FilteringExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("apple");

        //중복 요소 제거
        stringList.stream()
            .distinct()
            .forEach(s -> System.out.print(s+","));

        System.out.println();

        //a로 시작하는 요소만 필터링
        stringList.stream()
            .filter(n -> n.startsWith("a"))
            .forEach(s -> System.out.print(s + ","));

        //둘 다
        stringList.stream()
            .distinct()
            .filter(n->n.startsWith("a"))
            .forEach(s-> System.out.print(s+", "));

    }
}
