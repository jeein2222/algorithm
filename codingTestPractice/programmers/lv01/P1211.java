package codingTestPractice.programmers.lv01;

import java.util.Arrays;
import java.util.HashMap;

public class P1211 {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx=0;

        HashMap<String, Integer> memory=new HashMap<>();

        for(int i=0;i<name.length;i++){
            memory.put(name[i],yearning[i]);
        }

        int sum=0;
        for(String[] p : photo){
            for(String n : p) {
                if (memory.containsKey(n)) {
                    sum += memory.get(n);
                }
            }
            answer[idx++]=sum;
            sum=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};

        String[][] photo={{"may", "kein", "kain", "radi"},
            {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name, yearning, photo)));


    }
}
