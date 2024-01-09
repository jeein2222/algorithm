package codingTestPractice.algorithm.search;

import java.util.Scanner;

//최대점수 구하기
public class DFSex6 {

    static int max=0;
    static int n=0;
    static int m=0;
    public static void dfs(int depth, int totalScore, int totalTime, int[] score, int[] time){
        if(depth==n){
            if(totalTime<=m && max < totalScore){
                max=totalScore;
            }
        }else{
            dfs(depth + 1, totalScore + score[depth], totalTime + time[depth], score, time);
            dfs(depth + 1, totalScore, totalTime , score, time);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[] score = new int[n];
        int[] time = new int[n];

        for(int i=0;i<n;i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        dfs(0, 0, 0, score, time);

        System.out.println(max);
    }
}
