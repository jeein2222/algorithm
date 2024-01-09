package codingTestPractice.algorithm.완전탐색;

import java.util.HashSet;
import java.util.Iterator;

//소수 찾기
public class Sol1 {

    static HashSet<Integer> numberSet = new HashSet<>();

    public static int solution(String numbers){
        int answer=0;
        recursive("", numbers);
        Iterator<Integer> iterator = numberSet.iterator();

        while(iterator.hasNext()){
            int number = iterator.next();
            if(isPrime(number)){
                answer++;
            }
        }
        return answer;
    }

    public static void recursive(String comb, String others){
        if(!comb.equals("")){
            numberSet.add(Integer.valueOf(comb));
        }

        for(int i=0;i<others.length();i++){
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }
}
