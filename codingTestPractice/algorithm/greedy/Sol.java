package codingTestPractice.algorithm.greedy;

import java.util.Arrays;

public class Sol {
    //0. 큰수의 법칙
    /*
       2,4,4,5,6
       m=6 k=2
       6+6+5+6+6+5
       m=7 k=2
       6+6+5+6+6+5+6
       m=8 k=3
       6+6+6+5+6+6+6+5
     */
    public int solution0(int n, int m, int k, int[] arr){
        int result=0;
        Arrays.sort(arr);
        int first = arr[n - 1];
        int second = arr[n - 2];

        int cnt = (m / (k + 1)) * k; //가장 큰 수가 곱해지는 횟수
        cnt += m % (k + 1);//나머지가 있을 경우

        result += cnt * first;
        result += (m - cnt) * second;

        return result;
    }

    //2. 1이 될 때까지
    /*
        N=N-1
        N=N/k
        N=17 k=4
        17-1=16
        16/4=4
        4/4=1

        N=15 k=4
        15-1=14
        14-1=13
        13-1=12
        12/4=3
        3-1=2
        2-1=1

     */
    public int solution2(int n, int k){
        int cnt=0;
        while(n>1){
            if(n%k==0){
                n=n/k;
                cnt++;
            }else{
                n=n-1;
                cnt++;
            }
        }
        return cnt;
    }

    public int solution2_v2(int n, int k){
        int cnt=0;
        while(true){
            int target=(n/k)*k;
            cnt+=n-target;
            n=target;
            if (n<k)
                break;
            cnt++;
            n/=k;
        }
        cnt+=n-1;
        return cnt;
    }

    //3.곱하기 혹은 더하기
    /*
        02984
        02194

     */

    public int solution3(String str){
        int result=0;
        int[] arr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
        for(int a:arr){
            if(a<=1||result<=1) result+=a;
            else result*=a;
        }
        return result;
    }

    //4.모험가 길드
    /*
        N=5
        1,2,1,3,2
        1 1 2 2 3
     */
    public int solution4(int N,int[] arr){
        Arrays.sort(arr);
        int result=0; //총 그룹의 수
        int cnt=0; //현재 기릅에 포함된 멤버 수
        for(int a:arr){
            cnt++; //현재 그룹에 해당 멤버 포함시키기
            if(cnt>=a){
                result++;
                cnt=0;
            }
        }
        return result;
    }


    //숫자카드게임
    /*
        3 3
        3 1 2
        4 1 4
        2 2 2
     */
    public int solution5(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int min=Arrays.stream(arr[i]).min().orElseThrow();
            if(max<min){
                max=min;
            }
        }
        return max;
    }


    //박스 무게제한
    /*
        {70,50,80,50} 무게 제한 100kg
        50 50 70 80

        30 40 50 50

        30 30 30 40
     */
    public int solution6(int[] arr, int n){
        arr = Arrays.stream(arr).sorted().toArray();

        //쌍으로 묶이는 짐의 개수
        int count=0;

        //가장 가벼운 짐부터 무거운 짐으로 이동할 index
        int leftIdx=0;

        //가장 무거운 짐부터 가벼운 짐으로 이동할 index
        int rightIdx = arr.length - 1;

        while(leftIdx<rightIdx){
            if(arr[leftIdx]+arr[rightIdx]<=n){
                count++;
                leftIdx++;
                rightIdx--;
            }else{
                rightIdx--;
            }
        }
        return arr.length - count;
    }

    public int solution7(int money){
        int[] coins = {1, 5, 10, 50, 100, 500};

        int cnt=0;
        for(int i=coins.length-1;i>=0;i--){
            cnt += money / coins[i];
            money %= coins[i];
        }
        return cnt;
    }




    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution0(5, 8, 3, new int[] {2, 4, 5, 4, 6}));
        System.out.println(s.solution0(5, 7, 2, new int[] {2, 4, 5, 4, 6}));

        System.out.println(s.solution2(17, 4));
        System.out.println(s.solution2_v2(7, 4));

        System.out.println(s.solution3("02984"));
        System.out.println(s.solution3("010209"));

        System.out.println(s.solution4(5, new int[] {1,2,1,3,2}));
        //
        // Scanner sc = new Scanner(System.in);
        //
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // int[][] arr = new int[n][m];
        //
        // for(int r=0;r<n;r++){
        //     for(int c=0;c<m;c++){
        //         arr[r][c]=sc.nextInt();
        //     }
        // }

        // System.out.println(s.solution5(arr));
        System.out.println(s.solution6(new int[]{70, 50, 80, 50}, 100));
        System.out.println(s.solution6(new int[]{60, 80, 120, 90, 130}, 140));

        System.out.println(s.solution7(4000));
        System.out.println(s.solution7(4972));

    }
}
