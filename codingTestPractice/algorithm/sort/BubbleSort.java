package codingTestPractice.algorithm.sort;

import java.util.*;

/*
    버블 정렬 : O(N^2) 최선의 경우 O(N)
    인접한 두 개의 원소를 비교해가며 정렬(비교 정렬)
    제자리 정렬
    장점) 추가적인 메모리 소비가 작다, 구현이 매우 쉽다
    단점) 다른 정렬 알고리즘에 비해 교환 과정이 많아 많은 시간을 소용한다.
 */
public class BubbleSort {
    /*
        4 2 1 3
        1) 2 4 1 3
        2) 2 1 4 3
        3) 2 1 3 "4"

        4) 1 2 3 4
        5) 1 2 "3" 4

        6) 1 "2" 3 4

     */
    public static int[] bubbleSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    //성능을 개선한 bubbleSort : 최선의 경우 O(N)
    public static int[] bubbleSort2(int[] arr){
        for(int i=1;i<arr.length;i++){
            boolean isSwapped=false;

            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1]=tmp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
        System.out.println(Arrays.toString(bubbleSort2(arr)));
    }
}
