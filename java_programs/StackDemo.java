package java_programs;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        

        //adding the elements to the stack
        stack.push(5);
        stack.push(56);
        stack.push(85);
        stack.push(53);
        stack.push(59);
        stack.push(51);


        System.out.println(stack);


        //removing elements to the stack
        System.out.println(stack.pop());
        System.out.println(stack);



        //getting the upper element
        System.out.println(stack.peek());

        //searching the element 
        System.out.println("index of the serched item is : "+stack.search(56));



    }
    
}
