package codingTestPractice.programmers.lv01;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class P1218 {
    public static int solution(String[][] clothes) {
        int answer=1;
        HashMap<String, Integer> hm=new HashMap<>();

        for(int i=0;i<clothes.length;i++){
            if(hm.containsKey(clothes[i][1])){
                hm.put(clothes[i][1],hm.get(clothes[i][1])+1);
            }else{
                hm.put(clothes[i][1],1);
            }
        }

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            answer*=(entry.getValue()+1);
        }

        return answer-1;
    }
    public static void main(String[] args) {
        // String[][] clothes = {{"yellow_hat", "headgear"},
        //     {"blue_sunglasses", "eyewear"},
        //     {"green_turban", "headgear"}
        // };

        String[][] clothes = {{"crow_mask", "face"},
            {"blue_sunglasses", "face"},
            {"smoky_makeup", "face"}
        };

        System.out.println(solution(clothes));
    }
}
