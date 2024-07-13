package com.example.search.linkedList;

public class LinkedListmain {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        linkedlist.insert(1);
        linkedlist.insert(2);
        linkedlist.insert(3);
        linkedlist.insert(4);

        linkedlist.display();
        System.out.println();
        linkedlist.insertValueAtFirst(0);
        linkedlist.insertAt(0,40);

        linkedlist.deleteAt(0);
        linkedlist.deleteAt(1);
        linkedlist.display();
    }
}
