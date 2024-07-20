package com.example.search.BinarySearchTree;

public class BinaryTree {
    private Node root;

    public void insert(int data) {
        root = traverseAndInsert(root,data);
    }

    private Node traverseAndInsert(Node root, int data) {
        if (root == null) {
            Node n = new Node(data);
            root = n;
        } else if (data < root.data) {
           root.left = traverseAndInsert(this.root = root.left, data);
        }else if(data > root.data){
           root.right = traverseAndInsert(this.root = root.right, data);
        }
        return root;
    }

    public void inOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root){
        if(root != null){
            traverseInOrder(root.right);
            System.out.print(root.data+" ");
            traverseInOrder(root.left);

        }
    }

    public void preOrder() {

        if(root != null){
            System.out.print(root.data+" ");
            traverseInOrder(root.left);
            traverseInOrder(root.right);
        }
    }

    public void postOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root){

        if(root != null){
            traversePostOrder(root.right);
            System.out.print(root.data+" ");
            traversePostOrder(root.left);

        }
    }
}
