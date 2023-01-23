package day46_collections;

import java.util.Stack;

public class _02StackExample {


    // Stack: subclass of Vector. Ama farkli function’i da var. Bu da thread-safe BUT LIFO (Last-in, first out order). In Stack, “Push” and “Pop” is how to use last-in, first out logic.

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();  // we used Stack reference here. stack.add() methodunu da kullanabiliriz ama istedigimiz sey: I want to follow LIFO (Last In First Out) operation, o yuzden stack.push() kullanacagiz
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);  // [a, b, c]

        System.out.println("At the top " + stack.peek()); // At the top c  -->// stack.peek() method -> it will go to your stack and see what is at the top of your stack -> print edince at top'ta c oldugunu gorduk. --> Saim's explanation: stack.peek() checks what at the top of the stack
        stack.pop();  // pop method removes the top stack  --> pop method returns to the one that you removed  --> Saim's explanation: stack.pop() removes the element at the top of the stack and returns it
        // System.out.println(stack.pop());  //c  //--> bunu denedim, bu sekilde print etsek c cikacak cunku pop method returns to the one that you removed
        System.out.println("At the top now " + stack.peek()); // At the top now b
        System.out.println(stack);  // [a, b]

        System.out.println(stack.pop() + " was removed from the stack");  // b was removed from the stack  ----> pop method returns to the one that you removed oldugu icin b
        System.out.println(stack);  // [a]

        // I can use the methods from List, but for stack; I want to use the function of LIFO
        System.out.println(stack.get(0));  // a
        stack.add("h");
        System.out.println(stack);  // [a, h]



    }
}
