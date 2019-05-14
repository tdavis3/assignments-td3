package hw_1.part_3;

import java.util.ArrayList;

public class Queue {

    private Integer size;
    private ArrayList<Integer> queue;

    public Queue() {
        queue = new ArrayList<>();
        size = 0;
    }

    public void enqueue(Integer to_enqueue) {
        queue.add(0, to_enqueue);
        size += 1;
    }

    public Integer dequeue() {
        if (this.isEmpty()) {
            throw new IllegalCallerException("The stack is empty. Cannot pop anything off the top.");
        }
        Integer val = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        size -= 1;
        return val;
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

//    TODO Implement min()
}
