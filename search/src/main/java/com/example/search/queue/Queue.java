package com.example.search.queue;

public class Queue {

    private final int[] queue = new int[5];
    int length = queue.length;
    private int size;
    private int front;
    private int rear;

    public void queue(int data) {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % length;
            size++;
        } else {
            System.out.println("Queue is Full");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int i = queue[front];
            front = (front + 1) % length;
            size--;
            System.out.println("Element Left the Queue : " + i);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % length] + " ");
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Is queue Empty : " + q.isEmpty());
        q.queue(10);
        q.queue(20);
        q.queue(30);
        q.queue(40);
        q.queue(50);
        q.display();
        q.dequeue();
        q.queue(60);
        q.dequeue();
        q.queue(70);
        q.display();
        System.out.println();
        q.display();

        System.out.println("Size of the queue : " + q.getSize());
        System.out.println("Is queue Empty : " + q.isEmpty());
        System.out.println("Is queue Full : " + q.isFull());
    }
}
