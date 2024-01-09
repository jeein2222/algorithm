package codingTestPractice.algorithm.dp;


//정수 삼각형
public class DPex4 {
    public static int solution(int[][] triangle){
        int len = triangle.length;
        int max=0;

        for(int i=1;i<len;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(j==0){
                    triangle[i][j]+=triangle[i-1][j];
                }else if(j==i){
                    triangle[i][j]+=triangle[i-1][j-1];
                }else{
                    triangle[i][j]+=Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }

                if(max<triangle[i][j]){
                    max=triangle[i][j];
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[][] triangle =
            {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}};
        System.out.println(solution(triangle));
    }
}
