package codingTestPractice.algorithm.search;

import java.util.Scanner;


//음료수 얼려 먹기
public class DFSex1 {
    static int N;
    static int M;

    static int[][] graph;

    public static boolean dfs(int x, int y) {
        if(x<0 || y<0 || x>=N || y >=M) return false;
        if(graph[x][y]==0){
            graph[x][y]=1;
            dfs(x - 1, y);
            dfs(x, y-1);
            dfs(x + 1, y);
            dfs(x, y+1);
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        graph = new int[N][M];


        for(int i=0;i<N;i++){
            char[] rowChars = sc.next().toCharArray();
            for(int j=0;j<M;j++){
                graph[i][j] = Character.getNumericValue(rowChars[j]);
            }
        }

        int result=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(dfs(i,j)==true)
                    result += 1;
            }
        }

        System.out.println(result);
    }
}
