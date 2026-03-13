package com.dsa.main;

import com.dsa.parenthesesProblem.ValidParenthesesArray;


import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //valid parenthesis using prim array
        ValidParenthesesArray vp=new ValidParenthesesArray();
        String s="([])";
        System.out.println("Valid Parenthesis using prim array:"+vp.isValid(s));


	// creating stack using java built in stack class
        Stack<Integer> stack =new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }


    }

}
