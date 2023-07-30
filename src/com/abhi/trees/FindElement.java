package com.abhi.trees;

import java.util.Scanner;

public class FindElement {

    public static boolean isPresent(Node root, int value) {
        if (root == null)
            return false;
        if (root.data == value)
            return true;
        else return isPresent(root.left, value) || isPresent(root.right, value);
    }

    public static void main(String[] args) {

        Node root=Node.createTree();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be search::");
        int data=sc.nextInt();
        boolean present = isPresent(root, data);
        if(present)
        System.out.println("yes data is present in trees");
        else System.out.println("No data is not present in trees");


    }
}
