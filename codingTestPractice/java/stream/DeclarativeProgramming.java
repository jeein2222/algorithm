package codingTestPractice.java.stream;

import java.util.List;

public class DeclarativeProgramming {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 7, 8, 9);
        int sum=numbers.stream()
            .filter(num -> num >4 && num%2==0)
            .mapToInt(num->num)
            .sum();
        System.out.println("선언형 프로그래밍을 사용한 합계 : " + sum);
    }
}
