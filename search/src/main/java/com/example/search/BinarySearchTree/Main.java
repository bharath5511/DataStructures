package com.example.search.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
      BinaryTree bT = new BinaryTree();
        bT.insert(1);
        bT.insert(2);
        bT.insert(3);


        bT.inOrder();
        System.out.println();
        bT.preOrder();
      System.out.println();
      bT.postOrder();
    }
}
