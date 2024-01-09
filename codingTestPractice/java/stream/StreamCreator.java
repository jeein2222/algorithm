package codingTestPractice.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamCreator {
    public static void main(String[] args) {

        /*
            배열 스트림 생성
            배열을 데이터 소스로 하는 스트림 생성은
            Arrays 클래스의 stream() 메서드 또는 Stream 클래스의 of() 메서드를 사용할 수 있다.
         */
        //문자열 배열 선언 및 할당
        String[] arr = new String[] {"김코딩", "이자바", "박해커"};

        //문자열 스트림 생성
        Stream<String> stream1= Arrays.stream(arr);
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of(arr);
        stream2.forEach(System.out::println);

        //int형 배열로 스트림 생성
        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);

        //숫자와 관련된 경우 intStream을 사용하는 것을 권장
        System.out.println("sum=" + intStream.sum());//sum=15

        /*
            컬렉션 스트림 생성
            컬렉션의 최상위 클래스인 Collection에 정의된 stream()메서드르 사용하여 스트림을 생성
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream=list.stream();

        stream.forEach(System.out::println);

        /*
            임의의 수 스트림 생성
            Random 클래스 안에는 해당 타입의 난수들을 반환하는 스트림을 생성하는 메서드들이 정의되어 있다.
            int() 메서드의 경우, int형의 범위 안에 있는 난수들을 무한대로 생성하여 IntStream 타입의 스트림으로 반환
         */
        //스트림 생성의 범위를 5개로 제한
        IntStream ints=new Random().ints(5);
        //IntStream ints=new Random().ints().limit(5);

        ints.forEach(System.out::println);

        //특정 범위의 정수 모두 출력
        IntStream randomStream1 = IntStream.rangeClosed(1, 10);
        IntStream randomStream2 = IntStream.range(1, 10);
        randomStream1.forEach(System.out::print);//12345678910
        System.out.println();
        randomStream2.forEach(System.out::print);//123456789



    }
}
