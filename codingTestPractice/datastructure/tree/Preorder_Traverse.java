package codingTestPractice.datastructure.tree;

import java.util.ArrayList;

//전위 순회 : 부 -> 왼 -> 오
public class Preorder_Traverse {
    class Node{
        String data;
        Node left;
        Node right;

        public Node(String data){
            this.data = data;
        }

        public Node getLeft(){
            return left;
        }

        public Node getRight(){
            return right;
        }

        public String getData(){
            return data;
        }
    }

    public ArrayList<String> preOrder(Node node, ArrayList<String> list){
        if(node !=null){
            list.add(node.getData());
            list = preOrder(node.getLeft(), list);
            list = preOrder(node.getRight(), list);
        }
        return list;
    }

    public static void main(String[] args) {
        Preorder_Traverse pt = new Preorder_Traverse();

        //이진 트리 생성
        Node root = pt.new Node("1");
        root.left = pt.new Node("2");
        root.right = pt.new Node("3");
        root.left.left = pt.new Node("4");
        root.left.right = pt.new Node("5");
        root.right.left = pt.new Node("6");
        root.right.right = pt.new Node("7");

        //전위 순회 결과를 저장할 리스트
        ArrayList<String> result = new ArrayList<>();

        result = pt.preOrder(root, result);

        System.out.println(result);//[1, 2, 4, 5, 3, 6, 7]

    }
}
