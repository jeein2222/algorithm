package codingTestPractice.algorithm.sort;

import java.util.Arrays;
import java.util.Comparator;

//가장 큰 수
public class Sortex1 {

    public static String solution(int[] numbers){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
                //아스키 코드 값을 비교한다.(내림차순 정렬)
            }
        };

        String[] strNumbers = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            strNumbers[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(strNumbers, comparator);

        if (strNumbers[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(String strNumber:strNumbers){
            sb.append(strNumber);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));
    }
}
