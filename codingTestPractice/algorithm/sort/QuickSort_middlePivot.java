package codingTestPractice.algorithm.sort;

import java.util.Arrays;

public class QuickSort_middlePivot {
    public static void sort(int[] a){
        m_pivot_sort(a, 0, a.length - 1);//{3,4,1,2},0,3
    }

    public static void m_pivot_sort(int[] a, int lo, int hi){
        if(lo>=hi) return;
        int pivot = partition(a, lo, hi);//{3,4,1,2},0,3
        m_pivot_sort(a, lo, pivot-1);//{3,4,1,2},0,
        m_pivot_sort(a, pivot+1, hi);//{3,4,1,2},,3
    }

    public static int partition(int[] a, int left, int right){
        int lo=left;
        int hi=right;
        int mid=(left+right)/2;
        int pivot = a[mid];

        while(lo<hi){
            while(a[hi]> pivot && lo<hi){
                hi--;
            }
            while(a[lo]<=pivot && lo<hi){
                lo++;
            }
            swap(a, lo, hi);
        }

        return hi;
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j]=temp;

    }
    public static void main(String[] args) {
        // int[] a = new int[] {2,1,3};
        // sort(a);
        // System.out.println(Arrays.toString(a));
    }
}
