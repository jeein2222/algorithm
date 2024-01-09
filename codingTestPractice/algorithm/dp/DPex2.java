package codingTestPractice.algorithm.dp;

import java.util.Scanner;

//개미전사
public class DPex2 {

    static int[] d = new int[100];
    public static int solution(int n, int[] arr){
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);

        for(int i=2;i<arr.length;i++){
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        return d[n - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));

    }
}