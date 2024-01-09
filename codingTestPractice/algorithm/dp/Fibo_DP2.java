package codingTestPractice.algorithm.dp;

public class Fibo_DP2 {

    static int[] d = new int[100];

    public static int fibo(int n) {
        d[1]=1;
        d[2]=1;
        for(int i=3;i<n+1;i++){
            d[i] = d[i - 1] + d[i - 2];
        }
        return d[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo(3));

    }
}
