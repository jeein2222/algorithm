package codingTestPractice.algorithm.search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//동전교환
public class DFSex9 {
    static int N,M,minCount;
    static Integer[] numbers;

    public static void dfs(int depth, int sum){
        if(sum>M){
            return;
        }
        if(depth>minCount){
            return;
        }
        if(M==sum){
            minCount = Math.min(minCount, depth);
        }else{
            for(int i=0;i<N;i++){
                dfs(depth+1, sum+numbers[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        numbers = new Integer[N];

        for(int i=0;i<N;i++){
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers, Comparator.reverseOrder());
        // Arrays.sort(numbers, Collections.reverseOrder()); -> time limit

        M = sc.nextInt();
        minCount=M;

        dfs(0,0);
        System.out.println(minCount);
    }
}
