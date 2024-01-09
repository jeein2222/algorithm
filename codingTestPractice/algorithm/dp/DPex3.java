package codingTestPractice.algorithm.dp;

import java.util.HashSet;

public class DPex3{

    static HashSet<Integer>[] dp = new HashSet[9];

    public static void union(HashSet<Integer> newSet, HashSet<Integer> set1, HashSet<Integer> set2 ){
        for (int n : set1) {
            for (int m : set2) {
                newSet.add(n + m);
                newSet.add(n - m);
                newSet.add(n * m);
                if (m != 0) {
                    newSet.add(n / m);
                }
            }
        }
    }

    public static int solution(int n, int number){
        for(int i=0;i<9;i++){
            dp[i]=new HashSet<Integer>();
        }

        if(number==n) return 1;

        dp[0].add(n);
        dp[1].add(n);

        for(int i=2;i<9;i++){
            for(int j=1;j<=i/2;j++){
                union(dp[i], dp[i - j], dp[j]);
                union(dp[i], dp[j], dp[i - j]);
            }
            dp[i].add(Integer.parseInt((n+"").repeat(i)));
            if(dp[i].contains(number)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solution(5, 31168));
    }
}