package codingTestPractice.java.stream;

import java.util.List;

public class ImperativeProgramming {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 7, 8, 9);
        int sum=0;

        for(int num : numbers){
            if(num > 4 && num %2 ==0){
                sum += num;
            }
        }
        System.out.println("명령형 프로그래밍을 사용한 합계 : " + sum);
    }
}
