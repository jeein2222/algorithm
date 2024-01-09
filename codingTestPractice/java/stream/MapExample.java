package codingTestPractice.java.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};

        IntStream intStream = Arrays.stream(intArray);
        double avg = intStream
            .asDoubleStream()
            .average()
            .getAsDouble();

        System.out.println(avg); //3.0

        intStream = Arrays.stream(intArray);
        intStream
            .boxed()
            .forEach(obj -> System.out.print(obj.intValue())); //12345

    }
}
