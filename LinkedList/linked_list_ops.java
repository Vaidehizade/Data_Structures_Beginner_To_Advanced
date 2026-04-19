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

    public static Node insert_at_position(Node head, int pos, int data) {

        Node ans = new Node(data);
        // Insert at front
        if (pos == 1) {
            ans.next = head;
            return ans;
        }
        //insert at middle or end
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
        return ans;
    }

    public static void display(Node head) {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }
    public static boolean search(Node head, int val){
        if(head == null) return false;
        Node p = head;
        int flag =0;
        while(p!=null){
            if(p.data == val){
                flag=1;
                break;
            }
            p = p.next;
        }
        if(flag ==1){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert_at_front(head, 20);
        head = insert_at_front(head, 30);
        insert_at_end(head, 5);
        insert_at_position(head, 2, 25);
        System.out.println("Linked list:");
        display(head);
        if(search(head,5)== true){
            System.out.println("element found!");
        }
        else{
            System.out.println("element not found!");
        }
    }
}