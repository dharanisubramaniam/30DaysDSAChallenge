package com.dsa.parenthesesProblem;

import com.dsa.stack.StackArray;



public class ValidParenthesesArray {


    public boolean isValid(String s){
        int n=s.length();
        StackArray stack = new StackArray(n);


        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('||s.charAt(i)=='{' || s.charAt(i)=='['){
               stack.push(s.charAt(i));
           }else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
               if(stack.top == -1) return false;
               char c = stack.peek();
               if(s.charAt(i)==')' && c=='('){
                   stack.pop();
               }else if(s.charAt(i)==']' && c=='['){
                   stack.pop();
               }else if(s.charAt(i)=='}' && c=='{'){
                   stack.pop();
               }else{
                   return false;
               }
           }
        }

    return stack.top ==-1;
    }
    public boolean isValidEfficientVersion(String s) {
        int n=s.length();
        StackArray stack = new StackArray(n);

        for(char ch : s.toCharArray()) {

            if(ch == '(') stack.push(')');
            else if(ch == '[') stack.push(']');
            else if(ch == '{') stack.push('}');
            else if(stack.isEmpty() || stack.pop() != ch)
                return false;
        }

        return stack.isEmpty();
    }

}
