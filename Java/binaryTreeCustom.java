package com.company;

public class binaryTreeCustom {
    public static void main(String[] args) {
       Node n1 = new Node(5);
       Node n2 = new Node(3);
       Node n3 = new Node(2);
       Node n4 = new Node(32);
       Node n5 = new Node(23);
       Node n6 = new Node(52);


        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
//        n1.right = n5;

        System.out.println(sumvalue(n1));

    }
    public static int sumvalue(Node root){
        if (root==null){
            return 0;
        }
            return root.data+sumvalue(root.left)+sumvalue(root.right);

    }
}
class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
         this.data = data;
    }
}
