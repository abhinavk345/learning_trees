package com.abhi.trees;
import java.util.Scanner;

public class Node {

    int data;
    Node left;
    Node right;


    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    static Node createTree(){
        Node root= null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data:: ");
        int data=sc.nextInt();
        if(data==-1)
            return null;

        root=new Node(data);
        System.out.println("Enter left data:: "+data);
        root.left=createTree();
        System.out.println("Enter right data:: "+data);
        root.right=createTree();

        return  root;
    }

    static void preOrder(Node root){
        if(root ==null){
            return;
        }

        System.out.print(root.data+ "  ");
        preOrder(root.left);
        preOrder(root.right);

    }

    static void postOrder(Node root){
        if(root ==null){
            return;
        }


        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ "  ");

    }

    static void inOrder(Node root){
        if(root ==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+ "  ");
        inOrder(root.right);

    }
}