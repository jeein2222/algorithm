package codingTestPractice.datastructure.tree;

import java.util.ArrayList;

//중위 순회 : 왼 -> 부 -> 오
public class Inorder_Traverse {
    class Node{
        String data;
        Node left;
        Node right;

        public Node(String data){
            this.data=data;
        }

        public String getData(){
            return this.data;
        }

        public Node getLeft(){
            return left;
        }

        public Node getRight(){
            return right;
        }
    }

    public ArrayList<String> inOrder(Node node, ArrayList<String> list){
        if(node != null){
            list = inOrder(node.getLeft(), list);
            list.add(node.getData());
            list = inOrder(node.getRight(), list);
        }
        return list;
    }

    public static void main(String[] args) {
        Inorder_Traverse it = new Inorder_Traverse();

        //이진 트리 생성
        Inorder_Traverse.Node root = it.new Node("1");
        root.left = it.new Node("2");
        root.right = it.new Node("3");
        root.left.left = it.new Node("4");
        root.left.right = it.new Node("5");
        root.right.left = it.new Node("6");
        root.right.right = it.new Node("7");

        //중위 순회 결과를 저장할 리스트
        ArrayList<String> result = new ArrayList<>();

        result = it.inOrder(root, result);

        System.out.println(result);//[4, 2, 5, 1, 6, 3, 7]
    }
}
