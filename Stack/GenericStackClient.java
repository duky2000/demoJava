package Stack;

import java.util.Stack;

public class GenericStackClient {
    public static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("found");
        stack.push("find");
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
    }

    public static void main(String[] args) {
        stackOfStrings();

    }
}
