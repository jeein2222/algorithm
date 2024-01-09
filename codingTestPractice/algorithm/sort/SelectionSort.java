package codingTestPractice.algorithm.sort;

import java.util.Arrays;
/*
    선택 정렬 : O(N^2)
    처리되지 않은 데이터에서 가장 작은 데이터를 선택해 맨 앞에 데이터와 바꾸며 정렬하는 방식.
    비교 정렬, 제자리-정렬
    장점) 추가적인 메모리 소비가 작다
    단점) 시간복잡도가 O(N^2)이다.
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 5, 4, 1, 6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
