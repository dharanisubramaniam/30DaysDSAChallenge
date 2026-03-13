package com.dsa.stack;

public class StackArray {
    public char[] stack;
    public int top;
    int capacity;

    public StackArray(int n){
        stack=new char[n];
        capacity=n;
        top=-1;
    }

    public void push(char ch){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return;
        }
        stack[++top]=ch;
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return '\0';
        }
        return stack[top--];
    }
    public char peek(){
        return stack[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }

}
