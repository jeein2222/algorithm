package codingTestPractice.java.stream;

import java.util.Arrays;
import java.util.List;

/*
    매핑 : 스트림 내 요소들에서 원하는 필드만 추출하거나, 특정 현태로 변환할 때
 */
public class MappingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana", "banana", "candy");
        names.stream()
            .map(e -> e.toUpperCase())
            .forEach(System.out::println);

        int[] intArr = new int[] {1, 2, 3};
        int sum = Arrays.stream(intArr)
            .map(e -> e * 3)
            .sum();
        System.out.println(sum); //18

        //중첩 구조를 제거하고, 단일 컬렉션으로 만들어주는 역할
        String[][] namesArray = new String[][] {{"apple", "banana"}, {"candy", "orange"}};

        Arrays.stream(namesArray)
            .flatMap(Arrays::stream)
            .filter(e -> e.contains("e"))
            .map(e -> e + " ")
            .forEach(System.out::print);//apple orange


    }
}
