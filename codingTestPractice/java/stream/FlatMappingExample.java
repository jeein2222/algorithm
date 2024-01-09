package codingTestPractice.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("this is Java");
        list1.add("i am a best developer");
        list1.stream()
            .flatMap(data -> Arrays.stream(data.split(" ")))
            .forEach(word -> System.out.print(word+", "));

        System.out.println();

        List<String> list2 = Arrays.asList("10, 20, 30, 40");
        list2.stream()
            .flatMapToInt(data -> {
                String[] strArr = data.split(", ");
                int[] intArr = new int[strArr.length];
                for (int i = 0; i < intArr.length; i++) {
                    intArr[i] = Integer.parseInt(strArr[i]);
                }
                return Arrays.stream(intArr);
            })
            .forEach(num -> System.out.print(num+" "));

    }
}
