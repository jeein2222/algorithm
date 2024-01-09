package codingTestPractice.algorithm.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {
    public int[] radixSort(int[] arr){
        Queue<Integer>[] bucket = new LinkedList[10];

        for(int i=0;i< bucket.length;++i){
            bucket[i] = new LinkedList<>();
        }

        int factor = 1;
        int max = Arrays.stream(arr).max().getAsInt();
        int maxD = (int) (Math.log(max) + 1);

        for(int d=0;d<maxD;++d){
            for(int i=0;i<arr.length;++i){
                bucket[(arr[i] / factor) % 10].add(arr[i]);
            }
            for(int i=0, j=0;i< bucket.length;++i){
                while(!bucket[i].isEmpty()){
                    arr[j++] = bucket[i].poll();
                }
            }
            factor *= 10;
        }

        return arr;

    }

    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        int[] arr = {1, 2, 43, 100, 21};
        System.out.println(Arrays.toString(rs.radixSort(arr)));
    }
}
