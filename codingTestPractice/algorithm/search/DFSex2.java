package codingTestPractice.algorithm.search;


//타겟 넘버
public class DFSex2 {
    static int answer=0;
    public static int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);
        return answer;
    }

    public static void dfs(int depth, int sum, int[] arr, int target){
        if(depth==arr.length){
            if(sum==target){
                answer++;
            }
        }else{
            dfs(depth + 1, sum + arr[depth], arr, target);
            dfs(depth + 1, sum - arr[depth], arr, target);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 1};
        int target=4;
        solution(numbers, target);
        System.out.println(answer);
    }
}
