package com.abhi.trees;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TraversalInAll3Ways {
    public static void main(String[] args) {

       Node root= Node.createTree();
        Node.inOrder(root);
        System.out.println();
        Node.preOrder(root);
        System.out.println();
        Node.postOrder(root);

    }
}

/*
//output:::::::::::

Enter data:: 22
Enter left data:: 22
Enter data:: 11
Enter left data:: 11
Enter data:: 5
Enter left data:: 5
Enter data:: -1
Enter right data:: 5
Enter data:: 6
Enter left data:: 6
Enter data:: 4
Enter left data:: 4
Enter data:: -1
Enter right data:: 4
Enter data:: 5
Enter left data:: 5
Enter data:: -1
Enter right data:: 5
Enter data:: -1
Enter right data:: 6
Enter data:: 8
Enter left data:: 8
Enter data:: -1
Enter right data:: 8
Enter data:: -1
Enter right data:: 11
Enter data:: 9
Enter left data:: 9
Enter data:: -1
Enter right data:: 9
Enter data:: -1
Enter right data:: 22
Enter data:: 33
Enter left data:: 33
Enter data:: 16
Enter left data:: 16
Enter data:: -1
Enter right data:: 16
Enter data:: -1
Enter right data:: 33
Enter data:: -1
5  4  5  6  8  11  9  22  16  33
22  11  5  6  4  5  8  9  33  16
5  4  8  6  5  9  11  16  33  22
Process finished with exit code 0

 */