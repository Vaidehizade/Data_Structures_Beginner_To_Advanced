package Stack;

import java.util.ArrayList;

public class stack_using_vector {

    static class Stack1<T> {
        private ArrayList<T> arr = new ArrayList<>();

        public void push(T data) {
            arr.add(data);
        }

        public T pop() {
            if (arr.isEmpty()) return null;
            return arr.remove(arr.size() - 1);
        }

        public T top() {
            if (arr.isEmpty()) return null;
            return arr.get(arr.size() - 1);
        }

        public boolean isEmpty() {
            return arr.isEmpty();
        }

        public int size() {
            return arr.size();
        }
    }

    public static void main(String[] args) {
        Stack1<Integer> s = new Stack1<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top: " + s.top());
        System.out.println("Size: " + s.size());
        System.out.println("Popped: " + s.pop());
        System.out.println("Top after pop: " + s.top());
        System.out.println("Is empty? " + s.isEmpty());

        s.pop();
        s.pop();
        System.out.println("Is empty after popping all? " + s.isEmpty());
    }
}