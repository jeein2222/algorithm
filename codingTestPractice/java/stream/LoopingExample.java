package codingTestPractice.java.stream;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int total = Arrays.stream(intArr)
            .filter(a -> a % 2 == 0)
            .peek(n-> System.out.print(n+", "))
            .sum();
        System.out.println();
        System.out.println("total:"+ total);

        Arrays.stream(intArr)
            .filter(a-> a%2==0)
            .forEach(n-> System.out.print(n+", "));
    }
}
