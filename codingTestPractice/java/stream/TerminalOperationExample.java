// package codingTestPractice.java.stream;
//
// import java.util.Arrays;
// import java.util.List;
//
// public class TerminalOperationExample {
//     public static void main(String[] args) {
//         /*
//             기본 집계 연산 : count, sum, average, max, min, findFirst
//          */
//         int[] intArray = {1, 2, 3, 4};
//
//         //카운팅
//         long count = Arrays.stream(intArray).count();
//         System.out.println("count: " + count);
//
//         //합계
//         long sum = Arrays.stream(intArray).sum();
//         System.out.println("sum: " + sum);
//
//         //평균
//         double average = Arrays.stream(intArray).average().getAsDouble();
//         System.out.println("average: " + average);
//
//         //최댓값
//         int max = Arrays.stream(intArray).max().getAsInt();
//         System.out.println("max: " + max);
//
//         //최소값
//         int min = Arrays.stream(intArray).min().getAsInt();
//         System.out.println("min: " + min);
//
//         //첫번째 요소
//         int first = Arrays.stream(intArray).findFirst().getAsInt();
//         System.out.println("first element: " + first);
//
//         /*
//             매칭 : allMatch, anyMatch, noneMatch
//             match() 메서드를 사용하면 조건식 람다 Predicate를 매개변수로 넘겨
//             스트림의 각 데이터 요소가 특정 조건을 충족하는지 마는지 결과를 boolean으로 반환
//          */
//
//         //int형 배열 생성
//         int[] intArray2 = {2, 4, 5};
//
//         boolean result = Arrays.stream(intArray2).allMatch(e -> e % 2 == 0);
//         System.out.println("요소 모두 2의 배수인가요? " + result);//요소 모두 2의 배수인가요? false
//
//         result = Arrays.stream(intArray2).anyMatch(e -> e % 2 == 0);
//         System.out.println("요소 중 하나라도 2의 배수인가요? " + result);//요소 모두 2의 배수인가요? true
//
//         result = Arrays.stream(intArray).noneMatch(e -> e % 3 == 0);
//         System.out.println("요소 중 2의 배수가 하나도 없나요? " + result);//요소 중 2의 배수가 하나도 없나요? false
//
//
//         /*
//             요소 소모  : reduce
//             스트림의 요소를 줄여나가면서 연산을 수행하고 최종적인 결과를 반환한다.
//             스트림의 최종 연산은 모든 요소를 소모하여 연산을 수행하지만, reduce() 연산의 경우 먼저 첫 번째 요소와 두 번째 요소를 수행하고,
//             그 결과와 다음 세 번째 요소를 가지고 또다시 연산을 수행하는 식으로 끝날 때까지 반복.
//          */
//         int[] intArray3 = {1, 2, 3, 4, 5};
//
//         //sum
//         long sum3 = Arrays.stream(intArray3).sum();
//         System.out.println("전체 요소 합 : " + sum3);//전체 요소 합 : 15
//
//         //초기값이 없는 reduce()
//         int sum1 = Arrays.stream(intArray3)
//             .map(e -> e * 2) //2 4 6 8 10
//             .reduce((a, b) -> a + b)
//             .getAsInt();
//         System.out.println("초기값이 없는 reduce : " + sum1);//초기값이 없는 reduce : 30
//
//         //초기값이 있는 reduce()
//         int sum2 = Arrays.stream(intArray3)
//             .map(e -> e * 2) //2 4 6 8 10
//             .reduce(5, (a, b) -> a + b);
//         System.out.println("초기값이 있는 redue : " + sum2);//초기값이 있는 redue : 35
//
//         /*
//             요소 수집(collect)
//             스트림은 중간 연산을 통한 요소들의 데이터 가공 후 요소들을 수집하는 최종 처리 메서드인 collect()를 지원한다.
//             좀 더 구체적으로, 스트림의 요소들을 List, Set, Map 등 다른 타입의 결과로 수집하고 싶은 경우에 collect() 메서드를 유용하게 사용할 수 있다.
//             collect() 메서드는 Collector 인터페이스 타입의 인자를 받아서 처리할 수 있는데, 직접 구현하거나 미리 제공된 것들을 사용할 수 있다.
//             collect() 메서드는 단순히 요소를 수집하는 기능 이외에도 요소 그룹핑 및 분할 등 다른 기능들을 제공한다.
//          */
//         List<Student>
//
//     }
// }
// class Student{
//     enum Gender {Male, Female};
//     private String name;
//     private int score;
//     private Gender gender;
//
//
// }