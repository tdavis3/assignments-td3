package Assignment_1.part_3;

public class Queue {

    private Integer size;
    private Stack stack_push;
    private Stack stack_pop;

    public Queue() {
        stack_push = new Stack();
        stack_pop = new Stack();
        size = 0;
    }

    private void enqueue(Integer to_enqueue) {
        stack_push.push(to_enqueue);
        size += 1;
    }

    private Integer dequeue() {
        if (this.isEmpty()) {
            throw new IllegalCallerException("The queue is empty. Cannot pop anything off the top.");
        }

        if (stack_pop.isEmpty()) {
            while (!(stack_push.isEmpty())) {
                stack_pop.push(stack_push.pop());
            }
        }
        size -= 1;
        return stack_pop.pop();
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
}
