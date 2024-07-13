package com.example.search.linkedList;

public class Linkedlist {
    Node head;

    public void insert(int data){

        //creating a new node with the given data
        Node node = new Node();
        node.data=data;
        node.next = null;

        // checking if the head node is null
        if(head == null){
            head = node; //making new node as head node
        }else{
            Node n = head; // creating node locally to hold the next node
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertValueAtFirst(int data){

        //creating a new node with the given data
        Node node = new Node();
        node.data=data;
        node.next = head;
        head = node; //assigning old head node address at the new node-next address

    }

    public void display(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }

    public void insertAt(int index, int data) {
        int count = -1;
        if(head == null){
            System.out.println("invalid index");
        }
        if(index==0){
            insertValueAtFirst(data);
        }
        else{
            Node n = head;
            while(n.next!=null){
                count++;
                if(count == index-1){
                    Node newNode = new Node();
                    newNode.data = data;
                    newNode.next = n.next;
                    n = n.next = newNode;
                }
                n = n.next;
            }
        }
    }

    public void deleteAt(int index){
        if(index == 0){
            head = head.next;
        }else{

            Node n = head;
            for(int i = 0 ; i<index;i++){
                if(i == index-1) {
                    n.next = n.next.next;
                }
                n = n.next;
            }
            n = n.next;


        }
    }
}
