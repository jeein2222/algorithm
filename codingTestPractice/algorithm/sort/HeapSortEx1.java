package codingTestPractice.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class HeapSortEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=1;i<n;i++){
            for(int j=i;j>1;j/=2){
                arr[j] = arr[j / 2];
                System.out.println("arr["+j+"]("+arr[j]+")="+arr[j/2]);
            }
            arr[1] = i + 1;
            System.out.println("arr[1]="+arr[1]);
        }

        arr[n]=1;
        for(int i=1;i<=n;i++)
            System.out.print(arr[i]+" ");


    }
}
