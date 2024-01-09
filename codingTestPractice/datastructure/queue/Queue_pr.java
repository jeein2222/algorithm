package codingTestPractice.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_pr {
    /*
        Queue의 특징
        - FIFO, LILO 선입선출
        - 입력과 출력의 방향이 다르다.
        - 데이터를 하나씩 넣고 뺄 수 있다.

        Queue 자료 구조의 장점
        - 데이터를 넣은 순서대로 데이터를 꺼내서 처리할 수 있다. 삽입 순서와 삭제 순서가 동일하게 유지되는 작업의 경우, 효율적으로 처리가 가능하다.
        - 데이터의 삽입과 삭제가 양 끝에서 이루어지며, 중간에 있는 원소를 삭제하는 연산이 없으므로, 다른 자료 구조에 비해 상대적으로 빠른 속도를 보인다.

        Queue 자료 구조의 단점
        - 중간에 있는 데이터를 조회, 수정하는 연산에는 적합하지 않다.
        - 크기 제한이 없어서 메모리 낭비가 발생할 수 있다.(Java에서 제공하는 Queue 인터페이스의 경우)
        - iterator() 메서드가 지원되지 않는다.
        - remove() 메서드의 동작이 불명확하다.


     */

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();

        queue.add(1);//queue.offer(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.element()); //1
        System.out.println(queue.peek()); //1
        System.out.println(queue.poll()); //1
        System.out.println(queue.poll()); //2
        System.out.println(queue.remove()); //3

    }
}
