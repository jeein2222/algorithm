package codingTestPractice.programmers.lv01;

import java.util.Arrays;
import java.util.HashMap;

public class P1210 {
    public static String[] solution(String[] players, String[] callings) {
        int rank=1;
        HashMap<String, Integer> hm = new HashMap<>();

        for(String player: players){
            hm.put(player, rank++);
        }

        int currRank, currIdx, frontIdx;
        String tmp;
        for(String calling:callings){
            currRank = hm.get(calling);
            currIdx=currRank-1;
            frontIdx=currIdx-1;

            tmp = players[currIdx];
            players[currIdx] = players[frontIdx];
            players[frontIdx]=tmp;

            hm.put(players[currIdx], currRank);
            hm.put(players[frontIdx], currRank - 1);
        }

        return players;
    }
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(players, callings)));

    }
}
