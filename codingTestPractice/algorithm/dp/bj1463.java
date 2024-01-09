package codingTestPractice.algorithm.dp;

import java.util.Scanner;

public class bj1463 {

    /*
        d[1]=0
        d[2]=min(d[2-1],d[2/2], d[2/3])+1;
     */
    static int[] d = new int[1000001];
    public static int solution(int n){
        for(int i=2;i<n+1;i++){
            d[i]=d[i-1]+1;
            if(i%2==0)
                d[i] = Math.min(d[i], d[i / 2]+1);
            if(i%3==0)
                d[i] = Math.min(d[i], d[i / 3]+1);
        }
        return d[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));

    }
}
