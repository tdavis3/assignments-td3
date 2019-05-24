package hw_1.part_4;

public class Node {
    private Node right;
    private Integer val;

    public Node(Integer temp_val) {
        right = null;
        val = temp_val;
    }

    public Node get_right() {
        return right;
    }

    public void delete_right() {
        right = null;
    }

    public void change_right(Node right_node) {
        right = right_node;
    }

    public Integer get_val() {
        return val;
    }
}
