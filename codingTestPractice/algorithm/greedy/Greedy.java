package codingTestPractice.algorithm.greedy;

public class Greedy {
    /*
        탐욕 알고리즘은 선택의 순간마다 당장 눈앞에 보이는 최적의 상황만을 쫓아 최종적인 해답에 도달하는 방법

        문제 상황)
        장발장이 빵가게에서 빵을 훔치는데, 장발장의 가방은 35g까지의 빵만 담을 수 있고, 빵은 가격이 전부 다르며, 4개의 종류가
        각 1개씩 있고, 빵은 쪼개어 담은 수 있다. 장발장은 최대한 가격이 많이 나가는 빵으로만 채우고 싶다.

        이 문제에 탐욕 알고리즘을 사용한다면,
        1. 가방에 넣을 수 있는 물건 중 무게 대비 가장 비싼 물건을 넣는다.
        2. 그 다음으로 넣을 수 있는 물건 중 무게 대비 가장 비싼 물건을 넣는다.
        3. 만약, 가방에 다 들어가지 않을 경우 쪼개어 넣는다.

        하지만, 만약 빵을 쪼갤 수 없는 상ㅇ황일 경우, 탐욕 알고리즘은 최적의 결과를 보장할 수 없게 된다.

        따라서, 두 가지의 조건을 만족하는 '특정한 상황' 이 아니면 탐욕 알고리즘은 최적의 해를 보장하지 못한다.
        - 탐욕적 선택 속성 : 앞의 선태깅 이후의 선택에 영향을 주지 않음.
        - 최적 부분 구조 : 문제에 대한 최종 해결 방법은 부분 문제에 대한 최적 문제 해결 방법으로 구성된다.

        탐욕 알고리즘은 항상 최적의 결과를 도출하는 것은 아니지만, 어느 정도 최적에 근사한 값을 빠르게 도출할 수 있다는 장점이 있다.
        이 장점으로 탐욕 알고리즘은 근사 알고리즘으로 사용할 수 있다.
     */

    //거스름돈 문제
    public int countCoins(int money, int[] coins){
        int count=0;
        for(int coin:coins){
            count += money / coin;
            money %= coin;
        }
        return count;
    }

    public static void main(String[] args) {
        Greedy greedy = new Greedy();
        int[] coins = {500, 100, 50, 10};
        int count = greedy.countCoins(1260, coins);
        System.out.println("거슬러 주어야할 동전의 최소 개수: "+count);
    }
}
