package codingTestPractice.algorithm.dp;

//탑다운 방식
public class Fibo_DP {

    //한번 계산된 결과를 메모이제이션 하기 위한 리스트 초기화
    static int[] d = new int[100];

    //피보나치 함수를 재귀함수로 구현(탑다운 다이나믹 프로그래밍)
    public static int fibo(int n){
        //종료 조건(1 혹은 2일 때 1 반환)
        if(n==1 || n==2)
            return 1;
        //이미 계산한 적 있는 문제라면 그대로 반환
        if(d[n]!=0)
            return d[n];
        //아직 계산하지 않은 문제라면 점화식에 따라서 피보나치 결과 반환
        d[n] = fibo(n - 1) + fibo(n - 2);
        return d[n];
    }

    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
}
