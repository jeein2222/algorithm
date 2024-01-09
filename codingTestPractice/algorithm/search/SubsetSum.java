package codingTestPractice.algorithm.search;

//부분 집합의 합 구하기
public class SubsetSum {

    private static int calculateSubsetSum(int[] arr) {
        return calculateSubsetSumRecursive(arr, 0, 0);
    }

    private static int calculateSubsetSumRecursive(int[] arr, int index, int currentSum) {
        if(index==arr.length)
            return currentSum;

        //현재 요소를 선택하지 않는 경우
        int sum1 = calculateSubsetSumRecursive(arr, index + 1, currentSum);

        //현재 요소를 선택하는 경우
        int sum2 = calculateSubsetSumRecursive(arr, index + 1, currentSum + arr[index]);

        return sum1 + sum2;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 1};

        int result=calculateSubsetSum(arr);
        System.out.println("부분집합의 합: "+result);
    }


}
