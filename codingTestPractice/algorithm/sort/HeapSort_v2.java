package codingTestPractice.algorithm.sort;

import java.util.Arrays;

public class HeapSort_v2 {

   public static void heapSort(int[] arr){
       int size = arr.length;

       if(size<2) return;

       //가장 마지막 노드의 부모 인덱스
       int parentIdx = getParent(size - 1);

       //최대 힙 만들기
       for(int i=parentIdx;i>=0;i--){
           heapify(arr, i, size - 1);
       }

       //정렬 과정
       for(int i=size-1;i>0;i--){
           swap(arr, 0, i);
           heapify(arr, 0, i - 1);
       }
   }

   public static void heapify(int[] arr, int parentIdx, int lastIdx){
       int leftChildIdx;
       int rightChildIdx;
       int largestIdx;

       while((parentIdx*2+1)<=lastIdx){
           leftChildIdx=parentIdx*2+1;
           rightChildIdx=parentIdx*2+2;
           largestIdx = parentIdx;

           if(arr[leftChildIdx]>arr[largestIdx]){
               largestIdx = leftChildIdx;
           }

           if (rightChildIdx <= lastIdx && arr[rightChildIdx] > arr[largestIdx]) {
               largestIdx = rightChildIdx;
           }

           if(parentIdx!=largestIdx){
               swap(arr, parentIdx, largestIdx);
               parentIdx = largestIdx;
           }else{
               return;
           }
       }
   }
    public static int getParent(int child){
        return (child-1)/2;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 4, 2, 8};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
