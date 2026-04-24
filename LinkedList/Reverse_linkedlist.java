package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int d){
        data = d;
        next = null;
    }
};
public class Reverse_linkedlist {

    public static Node reverse_linked_list(Node head){
        //if linked list is empty
        if(head ==null) return null;
        else{
            Node q = head;
            int cnt =0;
            Node p = q;
            while(q.next !=null){
                cnt ++;
                p =q;
                q = q.next;
            }
            q.next = p;
            q = q.prev;
            p = p.prev;
            head = p;
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
        head = reverse_linked_list(head);
        display(head);
    }
}
