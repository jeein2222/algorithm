package codingTestPractice.algorithm.search;

import java.util.Scanner;

//바둑이 승차
public class DFSex4 {

    static int max;
    public static int solution(int c, int[] arr){
        dfs(0, 0, c, arr);
        return max;
    }

    public static void dfs(int depth, int sum, int c, int[] arr){
        if(depth==arr.length){
            if(max<sum && sum<c){
                max=sum;
            }
        }
        else{
            dfs(depth + 1, sum + arr[depth], c, arr);
            dfs(depth + 1, sum, c, arr);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(c, arr));
    }
}
