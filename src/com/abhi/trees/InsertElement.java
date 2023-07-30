package com.abhi.trees;

import java.util.Scanner;

public class InsertElement {
    public static void insertElement(Node root,int dataToBeInserted){

        if(root==null){
            root.data=dataToBeInserted;
            System.out.println("Data "+dataToBeInserted+" inserted Successfully");
            return;
        }

        if(root!=null) {
            if (root.right == null)
                insertElement(root.right, dataToBeInserted);
            else insertElement(root.right, dataToBeInserted);
        }
        }


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Node root=Node.createTree();
        System.out.println("Enter data to insert ::");
            int data =scanner.nextInt();
        insertElement(root,data);
        Node.preOrder(root);
    }
}
