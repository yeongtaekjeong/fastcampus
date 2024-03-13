package com.fastcampus.de.java.clip14;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);
        System.out.println("last element: " + stack.peek());
        System.out.println("size: "+ stack.size());
        System.out.println("last element " + stack.pop());
        System.out.println("size: "+ stack.size());
        System.out.println("last element " + stack.peek());
        System.out.println("exist 1 : " + stack.contains(1));
        System.out.println("exist 7 : " + stack.contains(7));

        int lastSizeOfStack = stack.size();
        for(int i=0; i<lastSizeOfStack; i++){
            stack.pop();
        }
        System.out.println("isEmpty: " + stack.isEmpty());
        System.out.println(stack);
    }
}
