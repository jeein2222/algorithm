package codingTestPractice.datastructure.tree;

import java.util.ArrayList;

//후위 순회 : 완 -> 오 -> 부
public class Postorder_Traverse {
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

    public ArrayList<String> postOrder(Node node, ArrayList<String> list) {
        if(node !=null){
            list = postOrder(node.getLeft(), list);
            list = postOrder(node.getRight(), list);
            list.add(node.getData());
        }
        return list;
    }

    public static void main(String[] args) {
        Postorder_Traverse pt = new Postorder_Traverse();

        //이진 트리 생성
        Postorder_Traverse.Node root = pt.new Node("1");
        root.left = pt.new Node("2");
        root.right = pt.new Node("3");
        root.left.left = pt.new Node("4");
        root.left.right = pt.new Node("5");
        root.right.left = pt.new Node("6");
        root.right.right = pt.new Node("7");

        //후위 순회 결과를 저장할 리스트
        ArrayList<String> result = new ArrayList<>();

        result = pt.postOrder(root, result);

        System.out.println(result);//[4, 5, 2, 6, 7, 3, 1]
    }
}
