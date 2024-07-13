package com.example.search.stack;

public class Stack {
    int[] stack = new int[5];
    int top = 0;
    public void push(int data){
        if(top<stack.length){
        stack[top] = data;
        top++;
        }else System.out.println("Array Size reached max");
    }
    public int pop(){
        if(isEmpty()){
            System.out.print("Stack is Empty : ");
            return 0;
        }else{
            int data = 0;
            top--;
            data = stack[top];
            stack[top] = 0;
            return data;
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

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(9);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());

        st.display();
        System.out.println();
    }
}
