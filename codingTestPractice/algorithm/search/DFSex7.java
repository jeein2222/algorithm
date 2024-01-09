package codingTestPractice.algorithm.search;

//단어 변환
public class DFSex7 {
    static boolean isVisited[];
    static int answer = Integer.MAX_VALUE;

    public static int solution(String begin, String target, String[] words){
        for(int i=0;i<words.length;i++){
            if(compare(begin, words[i])<=1){
                isVisited = new boolean[words.length];
                isVisited[i] = true;
                dfs(1, i, target, words);
            }
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    static void dfs(int cnt, int cur, String target, String[] words){
        if(target.equals(words[cur])){
            answer = Math.min(cnt, answer);
        }

        for(int i=0;i<words.length;i++){
            if(!isVisited[i] && compare(words[cur], words[i])==1){
                isVisited[i]=true;
                dfs(cnt + 1, i, target, words);
                isVisited[i]=false;
            }
        }
    }

    static int compare(String s1, String s2){
        int n=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                n++;
        }
        return n;
    }

    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin,target,words));
    }
}
