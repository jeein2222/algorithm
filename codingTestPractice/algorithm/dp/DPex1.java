package codingTestPractice.algorithm.dp;

//1로 만들기
public class DPex1 {

    static int[] d = new int[30001];

    public static int makeToOne(int n){

        for(int i=2;i<n+1;i++){
            d[i] = d[i - 1] + 1;

            if(i%2==0)
                d[i] = Math.min(d[i], d[i / 2] + 1);
            if(i%3==0)
                d[i] = Math.min(d[i], d[i / 3] + 1);
            if(i%5==0)
                d[i] = Math.min(d[i], d[i / 5] + 1);
        }

        return d[n];
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(makeToOne(n));
    }
}
