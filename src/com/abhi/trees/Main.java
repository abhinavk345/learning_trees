package com.abhi.trees;
public class Main {
    public static void main(String[] args) {
        Node root= Node.createTree();
        //FindMaxElementInTree
        //demoooo
      int result=  FindMaxElementInTree.findMaxElement(root);

        System.out.println("maximum value in tree is : "+result );

    }
}