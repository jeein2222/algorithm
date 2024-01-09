package codingTestPractice.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class EtcExample {
    public static void main(String[] args) {
        //1~10범위의 정수로 구성된 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1, 10);

        //앞의 5개 숫자를 건너뛰고 숫자 6부터 출력
        intStream
            .skip(5)
            .mapToObj(e-> e+" ")
            .forEach(System.out::print);//6 7 8 9 10

        System.out.println();

        int[] newIntArr=IntStream.rangeClosed(1,10)
            .skip(5)
            .toArray();

        System.out.println(Arrays.toString(newIntArr));//[6, 7, 8, 9, 10]
    //     ArrayList<Integer> list = Arrays.stream(newIntArr)
    //         .boxed()//IntStream -> Stream<Integer>
    //         .collect(Collectors.toCollection(ArrayList::new));//스트림의 요소를 컬렉션으로 수집
    //
        IntStream intStream3 = IntStream.of(1, 2, 3, 4);
        int sum= intStream3
            .filter(e->e%2==0)
            .peek(System.out::println)
            .sum();
        System.out.println(sum);
    }
}
