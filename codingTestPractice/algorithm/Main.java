package codingTestPractice.algorithm;

import java.util.Scanner;

public class Main {
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
            arr[min]=tmp;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            boolean isSwapped=false;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    isSwapped=true;
                }
            }
            if(!isSwapped) break;
        }
        return arr;
    }

    /*
        4 1 3 2
        target = 1;
        4와 비교 4>1 -> 1 4 3 2
        target = 3;
        4와 비교 4>3 -> 1 3 4 2
        1와 비교 1<3
        target=2;
     */

    public static int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int target = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>target){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = target;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int[] result = insertionSort(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
