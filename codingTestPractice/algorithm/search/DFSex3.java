package codingTestPractice.algorithm.search;

import java.util.ArrayList;
import java.util.Scanner;

//합이 같은 부분집합 1
public class DFSex3 {

    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

    public static void dfs(ArrayList<Integer> fullList, int depth, ArrayList<Integer> list) {
        if(depth==fullList.size()){
            result.add(list);
        }else{
            dfs(fullList, depth + 1, list);
            ArrayList<Integer> nList =new ArrayList<>();
            for(int i:list){
                nList.add(i);
            }
            nList.add(fullList.get(depth));
            dfs(fullList, depth+1, nList);
        }
    }

    public static int getSum(ArrayList<Integer> list){
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total=0;
        ArrayList<Integer> fullList = new ArrayList<>();

        for(int i=0;i<n;i++){
            fullList.add(sc.nextInt());
            total += fullList.get(i);
        }


        ArrayList<Integer> list = new ArrayList<>();
        dfs(fullList, 0, list);

        int sum=0;
        boolean isValid=false;

        for(ArrayList<Integer> subList: result){
            sum = getSum(subList);
            if(total-sum==sum){
                isValid=true;
                break;
            }
        }

        if(isValid)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
