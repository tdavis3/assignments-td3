package hw_1.part_3;

import java.util.ArrayList;


public class Stack {

    private Integer min;
    private Integer size;
    private ArrayList<Integer> stack;

    private Stack() {
        stack = new ArrayList<>();
        size = 0;
        min = null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(42);
        stack.push(9000);
        stack.push(50);
        System.out.println(stack.min());
        System.out.println(stack.pop());
    }

    private void push(Integer to_top) {
        if (min == null) {
            min = to_top;
        } else if (to_top < min) {
            min = to_top;
        }
        stack.add(0, to_top);
        size += 1;
    }

    private Integer pop() {
        if (this.isEmpty()) {
            throw new IllegalCallerException("The stack is empty. Cannot pop anything off the top.");
        }
        Integer val = stack.get(0);
        stack.remove(0);
        size -= 1;
        if (val.equals(min)) {
            Integer new_minimum = null;
            for (Integer num : stack) {
                if (new_minimum == null) {
                    new_minimum = num;
                } else if (num < new_minimum) {
                    new_minimum = num;
                }
            }
            min = new_minimum;
        }
        return val;
    }

    private Integer top() {
        return stack.get(0);
    }

    private Integer size() {
        return size;
    }

    private Boolean isEmpty() {
        if (size == 0) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private Integer min() {
        return min;
    }
}
