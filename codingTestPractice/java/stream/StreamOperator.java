package codingTestPractice.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperator {
    public static void main(String[] args) {
        //ArrayList
        List<String> fruitList = new ArrayList<>();
        fruitList.add("바나나 ");
        fruitList.add("사과 ");
        fruitList.add("오렌지 ");

        //배열
        String[] fruitArray = {"바나나 ", "사과 ", "오렌지 "};

        //각각 스트림 생성
        Stream<String> ListStream = fruitList.stream();
        Stream<String> ArrayStream = Arrays.stream(fruitArray);

        ListStream
            .filter(str -> str.contains("나"))
            .forEach(System.out::println);//바나나

        ArrayStream
            .filter(str -> str.contains("사"))
            .forEach(System.out::println);//사과
    }
}
