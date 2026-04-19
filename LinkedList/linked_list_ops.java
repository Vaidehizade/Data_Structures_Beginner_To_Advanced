package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

public class linked_list_ops {

    public static Node insert_at_front(Node head, int data) {
        Node ptr = new Node(data);
        if (head == null) {
            return ptr;
        } else {
            ptr.next = head;
            return ptr;
        }
    }

    public static void insert_at_end(Node head, int data) {
        Node ptr = new Node(data);
        if (head == null) {
            head = ptr;
            return;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = ptr;
    }

    public static void insert_at_position(Node head, int pos, int data) {
        Node q = head;
        int cnt = 0;
        while (q != null) {
            cnt++;
            if (cnt == pos - 1) {
                break;
            }
            q = q.next;
        }
        if (q != null) {
            Node ans = new Node(data);
            ans.next = q.next;
            q.next = ans;
        }
    }

    public static void display(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_at_front(head, 20);
        head = insert_at_front(head, 30);
        insert_at_end(head, 5);
        insert_at_position(head, 2, 25);
        
        System.out.println("Linked list:");
        display(head);
    }
}