package Assignment_1.part_3;

import java.util.ArrayList;


public class Stack {

    private Integer min;
    private Integer size;
    private ArrayList<Integer> min_stack;
    private ArrayList<Integer> stack;

    public Stack() {
        min_stack = new ArrayList<>();
        stack = new ArrayList<>();
        size = 0;
        min = null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(42);
        stack.push(9000);
        stack.push(50);
        stack.push(33);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
        System.out.println(stack.pop());
    }

    public void push(Integer to_top) {
        if (min_stack.size() == 0) {
            min_stack.add(0, to_top);
        } else if (to_top <= min_stack.get(0)) {
            min_stack.add(0, to_top);
        }

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

        if (val == min_stack.get(0)) {
            min_stack.remove(0);
        }
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

    public Integer min() {
        return min_stack.get(0);
    }
}
