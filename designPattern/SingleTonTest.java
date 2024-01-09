package designPattern;

/*
    하나의 클래스에 오직 하나의 인스턴스만 가지는 패턴.
    장점)
    - 인스턴스를 생성할 때 드는 비용이 줄어든다.
    단점)
    - 의존성이 높아진다.(모듈간의 결합을 강하게 만들 수 있다)
    - TDD를 할 때 걸림돌이 된다. 단위 테스트를 할 때 테스트가 서로 독립적이어야 하며, 테스트를
    어느 순서로든 실행할 수 있어야 한다. 하지만 싱글톤 패턴은 미리 생성된 하나의 인스턴스를 기반으로 구현한느 패턴이므로 각 테스트마다 독립적인 인스턴스를 만들기 어렵다.
    - 의존성 주입을 통해 모듈 간의 결합을 조금 더 느슨하게 만들어 해결할 수 있다.
    데이터베이스 연결 모듈에서 많이 사용한다.

 */
class Singleton{
    private static class singleInstanceHolder{
        private static final Singleton INSTANCE=new Singleton();
    }

    public static Singleton getInstance(){
        return singleInstanceHolder.INSTANCE;
    }
}

public class SingleTonTest {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        if(a==b){
            System.out.println("a==b");
        }
    }
}
