package codingTestPractice.java.random;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //1. Math.random() 사용하기
        //현재 시간을 seed로 사용 0.0~1.0 미만의 double 값의 난수를 균일한 분포로 반환
        double randomDoubleValue= Math.random();

        //0~9사이 숫자 랜덤하게
        int randomIntValue= (int)(randomDoubleValue*10);
        System.out.println(randomIntValue); //5

        //알파벳 랜덤하게 발생시키기
        char randomCharValue1 = (char)(randomDoubleValue * 26 + 65);//대문자
        char randomCharValue2 = (char)(randomDoubleValue * 26 + 97);//소문자
        System.out.println(randomCharValue1);//Z
        System.out.println(randomCharValue2);//z

        //2. Random 클래스 사용하기
        //기본 생성자를 사용해서 생성하면 현재 시스템 시간을 seed로 가지는 Random 객체 생성
        Random rand = new Random();

        // long seed = System.currentTimeMillis();
        // Random rand = new Random(seed);

        //0~9 사이 난수
        int intValue = rand.nextInt(10);
        System.out.println(intValue);//6

        //1~10 사이 난수
        int intValue2=rand.nextInt(10)+1;
        System.out.println(intValue2);


    }
}
