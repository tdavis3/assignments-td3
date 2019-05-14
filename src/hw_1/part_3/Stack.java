package hw_1.part_3;

import java.util.ArrayList;

public class Stack {

    private Integer size;
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
        size = 0;
    }

    public void push(Integer to_top) {
        stack.add(0, to_top);
        size += 1;
    }

    public Integer pop() {
        if (this.isEmpty()) {
            throw new IllegalCallerException("The stack is empty. Cannot pop anything off the top.");
        }
        Integer val = stack.get(0);
        stack.remove(0);
        size -= 1;
        return val;
    }

    public Integer top() {
        return stack.get(0);
    }

    public Integer size() {
        return size;
    }
    
    public Boolean isEmpty() {
        if (size == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
