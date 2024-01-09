package codingTestPractice.datastructure.tree;

import java.util.ArrayList;

//이진 탐색 트리
public class BST_pr {
    public static class Node{
        private int data;
        private Node left;
        private Node right;

        public Node(int data){
            this.setData(data);
            setLeft(null);
            setRight(null);
        }

        public int getData(){
            return this.data;
        }

        public Node getLeft(){
            return left;
        }

        public Node getRight(){
            return right;
        }

        public void setData(int data){
            this.data = data;
        }

        public void setLeft(Node left){
            this.left = left;
        }

        public void setRight(Node right){
            this.right = right;
        }
    }

    public static class binarySearchTree{
        public Node root;

        public binarySearchTree(){
            root = null;
        }

        public void insert(int data){
            Node newNode = new Node(data);

            if(root==null){
                root = newNode;
                return;
            }

            if(root.data ==data) return;

            Node currentNode=root;
            Node parentNode=null;

            while(true){
                parentNode = currentNode;

                if(data<currentNode.getData()){
                    currentNode = currentNode.getLeft();
                    if(currentNode==null){
                        parentNode.setLeft(newNode);
                        return;
                    } else if (currentNode.data == newNode.data) {
                        return;
                    }
                }else{
                    currentNode = currentNode.getRight();
                    if(currentNode==null){
                        parentNode.setRight(newNode);
                        return;
                    }else if(currentNode.data == newNode.data) return;
                }
            }
        }

        public boolean contains(int data){
            Node currentNode=root;
            while(currentNode!=null){
                if(currentNode.data ==data){
                    return true;
                }
                if(currentNode.data >data){
                    currentNode = currentNode.left;
                }else{
                    currentNode=currentNode.right;
                }
            }
            return false;
        }

        public ArrayList<Integer> preorderTree(Node root, int depth, ArrayList<Integer> list) {    //전위 순회
            if (root != null) {
                list.add(root.getData());
                preorderTree(root.getLeft(), depth + 1, list);
                preorderTree(root.getRight(), depth + 1, list);
            }
            return list;
        }

        public ArrayList<Integer> inorderTree(Node root, int depth, ArrayList<Integer> list) { //중위 순회
            //TODO: 전위 순회를 바탕으로 중위 순회를 구현하세요.
            if (root != null) {
                inorderTree(root.getLeft(), depth + 1, list);
                list.add(root.getData());
                inorderTree(root.getRight(), depth + 1, list);
            }
            return list;
        }

        public ArrayList<Integer> postorderTree(Node root, int depth, ArrayList<Integer> list) {   //후위 순회
            //TODO: 전위 순회를 바탕으로 후위 순회를 구현하세요.
            if (root != null) {
                postorderTree(root.getLeft(), depth + 1, list);
                postorderTree(root.getRight(), depth + 1, list);
                list.add(root.getData());
            }
            return list;
        }

    }


}
