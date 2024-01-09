package codingTestPractice.algorithm.sort;

import java.util.Arrays;

public class MergeSort {

    public int[] mergeSort(int[] arr){
        sort(arr,0,arr.length-1);
        return arr;
    }

    public void  sort(int[] arr, int left, int right){
        if(left<right){
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);

        int leftIdx=left;
        int rightIdx=mid+1;

        //정렬된 값을 병합된 배열에 넣을 인덱스
        int index=left;

        //좌측 배열, 우측 배열 두 배열 중 한쪽의 요소가 모두 없어질 때까지
        while(leftIdx<=mid && rightIdx<=right){
            if(temp[leftIdx]<=temp[rightIdx]){
                arr[index++] = temp[leftIdx++];
            }else{
                arr[index++] = temp[rightIdx++];
            }
        }


        //좌측 배열의 요소가 남았을 경우, 남은 요소를 넣어준다.
        //오른쪽 그룹의 원소가 남는 경우는 따로 처리 필요 없음.
        for(int i=0;i<=mid-leftIdx;i++){
            arr[index + i] = temp[leftIdx + i];
        }

    }


    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = new int[]{1, 9, 8, 5};
        System.out.println(Arrays.toString(ms.mergeSort(arr)));

    }
}
