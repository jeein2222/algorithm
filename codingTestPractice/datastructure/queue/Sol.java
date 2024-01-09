package codingTestPractice.datastructure.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Sol {

    public static String StringTransform(String str){
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            queue.add(str.charAt(i));
        }

        while(!queue.isEmpty()){
            sb.append(queue.poll());
            if(!queue.isEmpty()){
                queue.add(queue.poll());
            }
        }
        return sb.toString();
    }

    public static ArrayList<Stack> browserStack(String[] actions, String start){
        Stack<String> prev = new Stack<>();
        Stack<String> curr = new Stack<>();
        Stack<String> next = new Stack<>();

        ArrayList<Stack> result = new ArrayList<>();

        curr.push(start);

        for(int i=0;i<actions.length;i++){
            try{
                int b = Integer.parseInt(actions[i]);
                if(b==-1 && !prev.isEmpty()){
                    next.push(curr.pop());
                    curr.push(prev.pop());
                }else if(b==1 && !next.isEmpty()){
                    prev.push(curr.pop());
                    curr.push(next.pop());
                }
            }catch (NumberFormatException e){
                prev.push(curr.pop());
                curr.push(actions[i]);
                if(!next.isEmpty())
                    next.clear();
            }
        }

        result.add(prev);
        result.add(curr);
        result.add(next);

        return result;
    }

    public static int paveBox(int[] boxes){
        //같이 나갈 수 있는 사람의 수
        List<Integer> listQueue = new ArrayList<>();

        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i=0;i<boxes.length;i++){
            listQueue.add(boxes[i]);
        }

        boolean isMax=false;
        for(int i=0;i<listQueue.size();i++){
            if(listQueue.get(0)<listQueue.get(i)){
                isMax=true;
                answerList.add(i);
                listQueue = listQueue.subList(i, listQueue.size());
                System.out.println(listQueue);
            }
        }

        if(isMax==false){
            answerList.add(listQueue.size());
        }

        return Collections.max(answerList);

    }

    public static void main(String[] args) {

        //1
        System.out.println(StringTransform("abcdef"));

        //2
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = browserStack(actions, start);

        System.out.println(output);

        //3
        int[] boxes = new int[]{5, 1, 4, 6, 8};
        int result = paveBox(boxes);
        System.out.println(result);

    }
}
