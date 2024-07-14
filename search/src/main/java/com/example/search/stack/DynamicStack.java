package com.example.search.stack;

/*
 * This is an implementation of Dynamic stack with Dynamic array in size
*/
public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;
    public void push(int data){
        if(size() == capacity) {
            expandTheArray(); // to increase the array length by capacity*2
        }
            stack[top] = data;
            top++;
    }

    private void expandTheArray() {
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack = newStack;
        capacity *=2;
    }

    public int pop(){
        int data = 0;
        if(isEmpty()){
            System.out.print("Stack is Empty : ");
            return 0;
        }else{
            top--;
            data = stack[top];
            stack[top] = 0;
            shrinkArraySize(); // to decrease the array when length is 3/4 of the stack
        }
        return data;
    }

    private void shrinkArraySize() {

        int length = size();
        if(length <= (capacity/2)/2){
            capacity = capacity/2;
            int[] newstack = new int[capacity];
            System.arraycopy(stack,0,newstack,0,length);
            stack = newstack;

        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.print("Stack is Empty : ");
            return 0;
        }else{
            int data = 0;
            data = stack[top-1];
            return data;
        }
    }
    private boolean isEmpty(){
        if(top<=0) return true;
        else return false;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty : 0");
        }
        else {
            for (int a : stack) {
                System.out.print(a);
            }
        }
    }

    public int size(){
        return top;
    }

    public static void main(String[] args) {
        DynamicStack dst = new DynamicStack();
        dst.push(9);
        dst.push(2);
        dst.push(4);
        dst.push(4);
        dst.push(4);
        System.out.println("Size : "+dst.size());
        dst.display();
        System.out.println();

        dst.pop();
        dst.pop();
        dst.pop();
        dst.pop();

        System.out.println("Size : "+dst.size());
        dst.display();
        System.out.println();

        System.out.println(dst.peek());

    }
}
