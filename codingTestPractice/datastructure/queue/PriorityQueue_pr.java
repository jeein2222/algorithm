package codingTestPractice.datastructure.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_pr {
    public static void main(String[] args) {

        //낮은 숫자가 우선 순위인 int형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        //높은 숫자가 우선 순위인 int형 우선순위 큐 선언
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(1);
        priorityQueue.add(4);

        /*
                     1
                 3      2
             4
         */


        System.out.println(priorityQueue.peek()); //1
        System.out.println(priorityQueue); //[1, 3, 2, 4]

        System.out.println(priorityQueue.poll()); //1
        System.out.println(priorityQueue); //[2, 3, 4]

        System.out.println(priorityQueue.remove()); //2
        System.out.println(priorityQueue); //[3, 4]

        priorityQueue.clear();
        System.out.println(priorityQueue); //[]


    }
}
