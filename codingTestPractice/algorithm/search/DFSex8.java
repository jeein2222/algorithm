package codingTestPractice.algorithm.search;

import java.util.Scanner;

//중복 순열
public class DFSex8 {
    static int N,M;

    static int[] result;
    public static void dfs(int depth){
      if(depth==M){
           for(int i=0;i<result.length;i++){
               System.out.print(result[i]+" ");
           }
           System.out.println();
           return;
       }else{
           for(int i=1;i<=N;i++){
               result[depth]=i;
               dfs(depth+1);
           }
       }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        result = new int[M];

        dfs(0);
    }
}
