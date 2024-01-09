package codingTestPractice.algorithm.implemetation;

import java.util.HashMap;

public class Sol {

    //보드판 게임
    public Integer boardGame(int[][] board, String route){
        HashMap<Character, int[]> hashMap = new HashMap<>() {{
            put('U', new int[] {-1, 0});
            put('D', new int[] {1, 0});
            put('L', new int[] {0, -1});
            put('R', new int[] {0, 1});
        }};

        int x=0;
        int y=0;

        int cnt=0;

        for(int i=0;i<route.length();i++){
            Character op = route.charAt(i);
            int nx = x + hashMap.get(op)[0];
            int ny = y + hashMap.get(op)[1];

            if(checkBoundary(board.length, nx, ny)){
                x=nx;
                y=ny;

                cnt += board[nx][ny];
            }else{
                return null;
            }
        }

        return cnt;

    }

    public boolean checkBoundary(int length, int nx, int ny){
        if(nx<0 || nx>=length || ny<0 || ny>=length) return false;
        return true;
    }

    public static void main(String[] args) {

        Sol s = new Sol();

        int[][] board = new int[][] {
            {0, 0, 0, 1},
            {1, 1, 1, 0},
            {1, 1, 0, 0},
            {0, 0, 0, 0}
        };

        String route = "RRDLLD";

        System.out.println(s.boardGame(board, route));
    }
}
