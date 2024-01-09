package codingTestPractice.algorithm.sort;

import java.util.Arrays;

public class QuickSort_leftPivot {
    /*
        기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법.

        int[] a={3,4,1,2};
     */
    public static void sort(int[] a){
        l_pivot_sort(a, 0, a.length - 1);//{3,4,1,2},0,3
    }

    public static void l_pivot_sort(int[] a, int lo, int hi){
        if(lo>=hi) return;
        int pivot = partition(a, lo, hi);//{3,4,1,2},0,3
        l_pivot_sort(a, lo, pivot-1);//{3,4,1,2},0,
        l_pivot_sort(a, pivot+1, hi);//{3,4,1,2},,3
    }

    public static int partition(int[] a, int left, int right){
        int lo=left;
        int hi=right;
        int pivot = a[left];

        while(lo<hi){
            while(a[hi]> pivot && lo<hi){
                hi--;
            }
            while(a[lo]<=pivot && lo<hi){
                lo++;
            }
            swap(a, lo, hi);
        }
        swap(a, left, hi); //wk

        return hi;
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;

    }
    public static void main(String[] args) {
        int[] a = new int[] {3,4,1,5,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
