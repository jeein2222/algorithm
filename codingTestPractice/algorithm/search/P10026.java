package codingTestPractice.algorithm.search;

import java.util.Arrays;
import java.util.Scanner;

public class P10026 {
    static int n;
    static String s;
    static char[][] arr;
    static char map[][];
    static boolean visits[][];

    //상, 하, 좌, 우
    static int dx[] = {-1, 1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new char[n + 1][n + 1];
        visits = new boolean[n + 1][n + 1];

        for(int i=0;i<n;i++){
            s = sc.nextLine();
            for(int j=0;j<n;j++){
                arr[i][j] = s.charAt(j);
            }
        }

        //정상인 경우
        int normalCnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visits[i][j]){
                    dfs(i, j);
                    normalCnt++;
                }
            }
        }

        //비정상인 경우
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R'; // G를 R로 바꿔준다.
                }
            }
        }

        int abnormalCnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!visits[i][j]){
                    dfs(i, j);
                    abnormalCnt++;
                }
            }
        }

        System.out.println(normalCnt + " " + abnormalCnt);
    }

    public static void dfs(int x, int y){
        visits[x][y]=true;
        char tmp_char = arr[x][y];
        for(int i=0;i<4;i++){
            int new_x = x + dx[i];
            int new_y = y + dy[i];

            if (new_x < 0 || new_y < 0 || new_x > n || new_y > n) {
                continue;
            }

            if (!visits[new_x][new_y] && arr[new_x][new_y] == tmp_char) {
                dfs(new_x, new_y);
            }
        }
    }


}
