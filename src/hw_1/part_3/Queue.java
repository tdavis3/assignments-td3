package hw_1.part_3;

import java.util.ArrayList;

public class Queue {

    private Integer min;
    private Integer size;
    private ArrayList<Integer> queue;

    private Queue() {
        queue = new ArrayList<>();
        size = 0;
    }

    private void enqueue(Integer to_enqueue) {
        if (min == null) {
            min = to_enqueue;
        } else if (to_enqueue < min) {
            min = to_enqueue;
        }
        queue.add(0, to_enqueue);
        size += 1;
    }

    private Integer dequeue() {
        if (this.isEmpty()) {
            throw new IllegalCallerException("The stack is empty. Cannot pop anything off the top.");
        }
        Integer val = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        size -= 1;
        if (val.equals(min)) {
            Integer new_minimum = null;
            for (Integer num : queue) {
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
