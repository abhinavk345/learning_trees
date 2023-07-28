package com.abhi.trees;

public class FindMaxElementInTree {

   public static int findMaxElement( Node root){
      if(root==null){
          return 0;
      }
      int left=findMaxElement(root.left);
       int right = findMaxElement(root.right);

       return Math.max(root.data,Math.max(left,right));
   }
    public static void main(String[] args) {

    }
}
