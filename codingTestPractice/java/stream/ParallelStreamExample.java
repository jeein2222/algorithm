package codingTestPractice.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("a");
        nameList.add("b");
        nameList.add("c");
        nameList.add("d");



        //병렬 처리
        Stream<String> parallelStream = nameList.parallelStream();
        parallelStream.forEach(name->{
            System.out.println(name + ": " + Thread.currentThread().getName());
        });

        /*
            Java의 병렬 스트림에서는 Fork-Join 프레임워크를 사용하여 병렬 처리를 구현한다.
            이 프레임워크는 작업을 작은 단위로 쪼개고, 각각의 작업을 병렬로 처리한 후 결과를 합치는 방식으로 동작한다.
            Fork-Join 프레임워크는 자체적으로 스레드풀을 관리하며, 각각의 작은 작업은 다양한 스레드에서 병렬로 실행된다.

            b: ForkJoinPool.commonPool-worker-19
            a: ForkJoinPool.commonPool-worker-23
            d: ForkJoinPool.commonPool-worker-5
            c: main
         */
    }
}
