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

    public static Node insert_at_end(Node head, int data) {
        Node ptr = new Node(data);
        if (head == null) {
            return ptr;
        }
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = ptr;
        return head;
    }

    public static Node insert_at_position(Node head, int pos, int data) {
        Node ans = new Node(data);
        // Insert at front
        if (pos == 1) {
            ans.next = head;
            return ans;
        }
        // insert at middle or end
        Node q = head;
        int cnt = 1;
        while (q != null && cnt < pos - 1) {
            cnt++;
            q = q.next;
        }
        if (q != null) {
            ans.next = q.next;
            q.next = ans;
        }
        return head;
    }

    public static void display(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }

    public static boolean search(Node head, int val) {
        if (head == null)
            return false;
        Node p = head;
        while (p != null) {
            if (p.data == val) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    public static boolean search_recursive(Node head, int val) {
        if (head == null)
            return false;
        if (head.data == val) {
            System.out.println("element found!");
            return true;
        } else {
            return search_recursive(head.next, val);
        }
    }

    public static Node delete_from_front(Node head) {
        if (head == null)
            return null;
        return head.next;
    }

    public static Node delete_from_position(Node head, int pos) {
        if (head == null) {
            return null;
        }
        
        if (pos == 1) {
            return head.next;
        }
        
        Node q = head;
        int cnt = 1;
        while (q != null && cnt < pos - 1) {
            cnt++;
            q = q.next;
        }
        
        if (q != null && q.next != null) {
            q.next = q.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_at_front(head, 20);
        head = insert_at_front(head, 30);
        head = insert_at_end(head, 5);
        head = insert_at_position(head, 2, 25);
        
        System.out.println("Linked list after insertions:");
        display(head);
        
        if (search(head, 5)) {
            System.out.println("5 found!");
        } else {
            System.out.println("5 not found!");
        }
        
        boolean ans = search_recursive(head, 66);
        System.out.println("66 recursive search: " + ans);
        
        head = delete_from_front(head);
        System.out.println("\nAfter deleting from front:");
        display(head);
        
        head = delete_from_position(head, 2);
        System.out.println("After deleting from position 2:");
        display(head);
    }
}