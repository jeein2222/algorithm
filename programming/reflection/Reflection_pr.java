package programming.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/*
    Reflection은 구체적인 클래스 Type을 알지 못해도 해당 Class의 method, type, variable들에 접근할 수 있도록 해주는 자바 API,
    컴파일된 바이트 코드를 통해 Runtime에 동적으로 특정 Class의 정보를 추출할 수 있는 프로그래밍 기법이다.

    장점)
    -   Class 브라우저 및 시각적 개발 환경을 제공 : Reflection을 통해 Method, Property, Constructor를 미리 파악함으로써 사용할 정보를
        열거하여 시각적 개발 환경을 구축할 수 있다.
    -   디버거 및 테스트 도구 : 디버거는 개인 Property, Method, Constructor를 검사할 수 있어야 한다. 테스트 자치는
 */
public class Reflection_pr {
    public static void main(String[] args) throws Exception{
        //Class를 알고 있을 경우
        Class car1=Car.class;

        //Class의 이름만 알고 있을 경우
        Class car2=Class.forName("programming.reflection.Car");

        //기본 생성자 가져오기
        Constructor<Car> constructor1 = car1.getDeclaredConstructor();

        //기본 생성자를 이용한 객체 생성
        Car realCar1 = constructor1.newInstance();
        System.out.println("carName: "+realCar1.getCarName());

        //String 인자를 가진 생성자 가져오기
        Constructor<Car> constructor2 = car2.getDeclaredConstructor(String.class);

        //생성자를 이용한 객체 생성
        Car realCar2 = constructor2.newInstance("car2");
        System.out.println("carName: "+realCar2.getCarName());

        //String 인자를 가진 메서드 가져오기
        Method method1 = car2.getDeclaredMethod("moveForward", int.class);
        method1.invoke(realCar2, 10);

        Method method2 = car2.getDeclaredMethod("moveBackward", int.class);
        method2.invoke(realCar2, 5);


    }
}


