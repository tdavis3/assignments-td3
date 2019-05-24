package hw_1.part_4;

public class Singly_Linked_List {
    private Integer size;
    private Node head;
    private Node end;

    private Singly_Linked_List() {
        size = 0;
        head = null;
        end = null;
    }

    public static void main(String[] args) {
        Singly_Linked_List l_list = new Singly_Linked_List();
        l_list.pushBack(42);
        l_list.pushBack(9000);
        l_list.pushBack(50);
        l_list.erase(1);
        System.out.println(l_list.size());
        System.out.println(l_list.elementAt(1).get_val());
    }


    private void pushBack(Integer val) {  // O(1)
        Node new_node = new Node(val);
        if (size == 0) {
            head = new_node;
        } else if (size == 1) {
            head.change_right(new_node);
            end = new_node;
        } else {
            end.change_right(new_node);
            end = new_node;
        }
        size += 1;
    }

    private void popBack(Integer val) {  // O(n)
        Node curr = head;
        for (int i = 0; i < size - 1; i++) {
            curr = curr.get_right();
        }
        curr.delete_right();
        end = curr;
        size -= 1;
    }

    private void insert(Integer index, Integer data) {  // O(n)
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.get_right();
        }
        Node right = curr.get_right();
        Node new_node = new Node(data);
        curr.change_right(new_node);
        new_node.change_right(right);
        size += 1;
    }

    private void erase(Integer index) {  // O(n)
        if (index == 0) {
            head = head.get_right();
            return;
        }
        Node curr = head;
        Node left = null;
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                left = curr;
            }
            curr = curr.get_right();
        }
        Node right = curr.get_right();
        left.change_right(right);
        size -= 1;
    }

    private Node elementAt(Integer index) {  // O(n)
        Node curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.get_right();
        }
        return curr;
    }

    private Integer size() {
        return size;
    }

    private void hasCycle() {
//        TODO - Run DFS for cycle detection
    }

    private void is_palindrome() {
//        TODO - Check if palindrome
    }
}
