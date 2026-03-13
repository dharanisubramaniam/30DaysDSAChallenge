package com.dsa.parenthesisProblem;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesesDeque {

    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else if(ch==')'||ch==']'||ch=='}'){
                if (stack.isEmpty()) return false;
                char c=stack.peek();
                if(c=='('&& ch==')'){
                    stack.pop();
                }else if(c=='['&&ch==']'){
                    stack.pop();
                }else if(c=='{'&& ch=='}'){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public boolean isValidEfficientVersion(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            // If we see an opening bracket, push its MIRROR onto the stack
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            }
            // If it's a closing bracket:
            // 1. Is the stack empty? (No opening bracket to match)
            // 2. Does the top of the stack match our current bracket?
            else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }

        // If the stack is empty, every bracket was matched perfectly
        return stack.isEmpty();
    }
}
