package Stack;

import java.util.Stack;

public class reverse_stack {
    // stack reversal using recursion
    static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.peek();
        st.pop();
       reverse(st);
       insertAtBottom(st,temp);
    }
    
    static void insertAtBottom(Stack<Integer> st, int value) {
        if (st.isEmpty()) {
            st.push(value);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, value);
        st.push(top);
    }

    static void printStack(Stack<Integer> st) {
        // print without modifying original stack: use a temporary stack
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()) {
            int v = st.pop();
            System.out.print(v + " ");
            temp.push(v);
        }
        System.out.println();
        while (!temp.isEmpty()) st.push(temp.pop());
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        insertAtBottom(st,11);
        System.out.print("Before reverse (top->bottom): ");
        printStack(st);
        reverse(st);
        System.out.print("After reverse (top->bottom): ");
        printStack(st);
    }
}
