package codingTestPractice.algorithm.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort_Before {

    public int[] heapSort(int[] arr){
        //오름차순으로 정렬
       PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        //배열을 힙으로 만든다
        for(int i=0;i<arr.length;i++){
            heap.add(arr[i]);
        }

        //힙에서 우선순위가 가장 놓은 원소를 하나씩 뽑는다.
        for(int i=0;i<arr.length;i++){
            arr[i]=heap.poll();
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 4, 2, 8};
        System.out.println("정렬 전 original 배열 : "+ Arrays.toString(arr));

        HeapSort_Before heapSort = new HeapSort_Before();
        int[] newArr = heapSort.heapSort(arr);
        System.out.println("정렬 후 배열 : "+ Arrays.toString(newArr));

    }
}
