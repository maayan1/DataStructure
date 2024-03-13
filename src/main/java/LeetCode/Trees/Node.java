package LeetCode.Trees;

import java.sql.SQLOutput;

public class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        public boolean contains(int value){
        if(value == data){
            return true;
        }else if(value < data ) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else{
                if(right == null){
                    return  false;
                } else{
                    return right.contains(value);
                }
            }
        }

        public void printInOrder(){
        if (left != null){
            left.printInOrder();
        }
            System.out.println(data);
        if(right != null){
            right.printInOrder();
        }

        }


    public static void main(String[] args) {
        Node node = new Node(20);

        node.insert(2);
        node.insert(5);
        node.insert(9);

        System.out.println(node.contains(3));
        System.out.println();
        node.printInOrder();



    }
  }


