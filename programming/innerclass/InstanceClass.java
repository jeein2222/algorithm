package programming.innerclass;

class PocketBall {
    //인스턴스 변수
    int size=100;
    int price=5000;

    //인스턴스 내부 클래스
    class PocketMonster{
        String name = "이상해씨";
        int level=0;

        static final int cost =100;

        public void getPocketMember(){
            System.out.println(size);
            System.out.println(price);


            System.out.println(name);
            System.out.println(level);
            System.out.println(cost);
        }

    }
}

public class InstanceClass{
    public static void main(String[] args) {
        PocketBall ball = new PocketBall(); //외부 클래스를 인스턴스화
        PocketBall.PocketMonster poketMon1 = ball.new PocketMonster(); //외부 클래스.내부클래스 형식으로 내부클래스를 초기화하여 사용할 수 도 있다.
        poketMon1.getPocketMember();

        //위의 단계를 한줄로 표현
        PocketBall.PocketMonster pocketMon2 = new PocketBall().new PocketMonster();

    }

}