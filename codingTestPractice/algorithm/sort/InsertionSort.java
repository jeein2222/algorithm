package codingTestPractice.algorithm.sort;

import java.util.Arrays;

/*
    삽입 정렬
    현재 비교하고자 하는 target과 그 이전의 원소들을 비교하여 자기를 교환하는 정렬 방법
    비교 정렬, 제자리 정렬
    장점) 추가적인 메모리 소비가 작다, 거의 정렬된 경우 매우 효율적(최선의 경우 O(N))
    단점) 역순에 가까울수록 매우 비효율적. 최악의 경우 O(N^2)의 시간 복잡도를 갖는다. 데이터의 상태에 따라서 성능 편차가 매우 크다.
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int target = arr[i];
            int j=i-1;
            while(j>=0 && target<arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {4, 1, 3, 2};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
