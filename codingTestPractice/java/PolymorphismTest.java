package codingTestPractice.java;

public class PolymorphismTest {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.methodA();//SuperClass methodA
        superClass.methodB();//SuperClass methodB
        System.out.println(superClass.name);

        SuperClass subClass1 = new SubClass();
        subClass1.methodA();// SubClass methodA => 동적 바인딩으로 Runtime시점에 해당 메서드를 구현하고 있는 실제 객체 타입을 기준으로 찾아가서 실행될 함수를 호출한다.
        subClass1.methodB();// SuperClass methodB (정적 멤버를 인스턴스 참조를 통해 접근하려고 시도하는 것은 올바르지 않음) => 정적 바인딩으로 컴파일 시간에 성격이 결정되어 변수의 타입에 따라 실행될 함수를 호출한다.
        System.out.println(subClass1.name);

        //subClass.methodC(); => 부모 클래스에 선언된 메서드만 접근 가능하다.

        SubClass subClass2 = new SubClass();
        System.out.println(subClass2.name);
        subClass2.methodA();// SubClass methodA
        subClass2.methodB();// SubClass methodB
        subClass2.methodC();// SubClass methodC
    }
}

class SuperClass{
    String name="a";
    void methodA(){
        System.out.println("SuperClass methodA");
    }

    static void methodB(){
        System.out.println("SuperClass methodB");
    }
}

class SubClass extends SuperClass{
    @Override
    void methodA(){
        System.out.println("SubClass methodA");
    }

    /*
     * (부모의)static 메서드는 컴파일 타임에 메모리에 올라가므로
     * 객체가 생성되기 전부터 이미 메모리에 할당되어 있으므로
     * 부모의 static 메서드를 자식은 상속받지 않는다. 따라서 오버라이딩 대상도 아니다.
     *
     */
    static void methodB(){
        System.out.println("SubClass methodB");
    }

    void methodC(){
        System.out.println("SubClass methodC");
    }
}
