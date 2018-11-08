package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        while(!stack.empty()){
            System.out.println(stack.pop() + " ");
        }
    }

}
