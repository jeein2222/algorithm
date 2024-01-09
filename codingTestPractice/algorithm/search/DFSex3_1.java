package codingTestPractice.algorithm.search;

import java.util.Scanner;

//합이 같은 부분집합
public class DFSex3_1 {
    static int n=0;
    static int total=0;

    static boolean flag=false;

    public static void dfs(int depth, int sum, int[] arr){
        if(depth==n){
            if(total-sum==sum){
                flag=true;
            }
        }else{
            dfs(depth + 1, sum + arr[depth], arr);
            dfs(depth + 1, sum, arr);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        dfs(0, 0, arr);

        if(!flag)
            System.out.println("NO");
        else
            System.out.println("YES");
    }

}
