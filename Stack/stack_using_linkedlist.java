package Stack;

public class stack_using_linkedlist {

    // Simple generic node for linked list
    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    // Stack implementation using singly linked list (LIFO)
    static class Stack<T> {
        private Node<T> head;
        private int size = 0;

        public boolean isEmpty() {
            return head == null;
        }

        public int size() {
            return size;
        }

        public void push(T data) {
            Node<T> node = new Node<>(data);
            node.next = head;
            head = node;
            size++;
        }

        public T pop() {
            if (head == null) return null;
            T val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public T top() {
            if (head == null) return null;
            return head.data;
        }
    }

    // Demo
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println("Top: " + st.top());
        System.out.println("Size: " + st.size());
        System.out.println("Popped: " + st.pop());
        System.out.println("Top after pop: " + st.top());
        System.out.println("Is empty? " + st.isEmpty());

        st.pop();
        st.pop();
        System.out.println("Is empty after popping all? " + st.isEmpty());
    }
}
