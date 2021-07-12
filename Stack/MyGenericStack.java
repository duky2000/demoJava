package Stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Stack;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.push(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack.removeFirst();
        }
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.isEmpty();


    }

}
