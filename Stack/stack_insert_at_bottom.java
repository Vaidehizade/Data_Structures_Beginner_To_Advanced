package Stack;
import java.util.Stack;

public class stack_insert_at_bottom {

    static void insertAtBottom(Stack<Integer> st, int val){
        if(st.isEmpty()) {
            st.push(val);
            return;
        }
        int temp = st.peek();
        st.pop();
        insertAtBottom(st, val);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int val = 5;
        st.push(10);
        st.push(20);
        insertAtBottom(st,val);
        while(!st.empty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
