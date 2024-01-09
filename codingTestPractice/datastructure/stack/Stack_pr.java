package codingTestPractice.datastructure.stack;

import java.util.Stack;

public class Stack_pr {
    /*
        Stack의 특징
        - LIFO : 먼저 들어간 데이터는 제일 나중에 나오는 후입선출 구조
        - 데이터를 하나씩 넣고 뺄 수 있다.
        - 하나의 입출력 방향을 가지고 있다.

        Stack 자료 구조의 장점
        - 스택은 후입선출(LIFO)의 구조를 가지기 때문에, 스택에 저장된 데이터를 가져오는 속도가 매우 빠르다.
        - 자바에서는 스택을 기본 자료구조로 제공하기 때문에, 별도의 라이브러리나 모듈을 설치할 필요가 없다.

        Stack 자료 구조의 단점
        - 크기 제한이 없다.
            데이터를 저장할 때 크기가 제한되지 않기 때문에 메모리 사용량이 불필요하게 증가하라 수 있다.
        - Stack 클래스는 Vector 클래스를 상속받아 구현되어 있어, 크기를 동적으로 조정하지 않는다.
            Vector 클래스는 내부적으로 배열ㅇ르 사용하여 구현되어 있고, 배열의 크기는 처음에 지정된 크기만큼만 할당되고,

     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //가장 위에 있는 값
        System.out.println(stack.peek());//4

        //가장 위에서 부터 몇번째
        System.out.println(stack.search(3));//2
        System.out.println(stack.search(2));//3
        System.out.println(stack.search(1));//4


        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1

        System.out.println(stack.empty());
    }
}
