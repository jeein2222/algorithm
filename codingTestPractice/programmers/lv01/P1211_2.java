package codingTestPractice.programmers.lv01;

import java.util.Arrays;
import java.util.HashMap;

public class P1211_2 {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        HashMap<String, Integer[]> hm=new HashMap<>();

        hm.put("E", new Integer[] {0,+1});
        hm.put("S",new Integer[] {+1,0});
        hm.put("W",new Integer[] {0,-1});
        hm.put("N",new Integer[] {-1,0});

        int len=park.length;

        int sx=0;
        int sy=0;

        for(int i=0;i<len;i++){
            for(int j=0;j<park[i].length();j++){
                if(park[i].charAt(j)=='S'){
                    sx=i;
                    sy=j;
                }
            }
        }

        int cx=sx;
        int cy=sy;

        for(String route:routes){

            String[] splitRoute=route.split(" ");

            String s = splitRoute[0];
            int m = Integer.parseInt(splitRoute[1]);

            Integer[] foundRoute = hm.get(s);

            int nx=0;
            int ny=0;

            for(int i=0;i<m;i++){
                nx=cx+foundRoute[0];
                ny=cy+foundRoute[1];

                System.out.println(ny);

                if(checkBoundary(nx, ny, len)){
                    if(park[nx].charAt(ny)!='X'){
                        cx=nx;
                        cy=ny;
                    }
                }
            }
        }

        answer[0]=cx;
        answer[1]=cy;

        return answer;
    }

    public static boolean checkBoundary(int nx, int ny, int len){
        if(nx<0 || ny<0 || nx>len-1 || ny>len-1){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        int[] result = solution(park, routes);

        System.out.println(Arrays.toString(result));

    }
}
