package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class stack_using_colllection_framework {

	static void demoJavaUtilStack() {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);

		System.out.println("java.util.Stack top: " + st.peek());
		System.out.println("java.util.Stack pop: " + st.pop());
		System.out.println("java.util.Stack size: " + st.size());
	}

	static void demoArrayDequeStack() {
		Deque<Integer> st = new ArrayDeque<>();
		st.push(10); // push to head
		st.push(20);
		st.push(30);

		System.out.println("ArrayDeque top: " + st.peek());
		System.out.println("ArrayDeque pop: " + st.pop());
		System.out.println("ArrayDeque size: " + st.size());
	}

	public static void main(String[] args) {
		System.out.println("--- java.util.Stack demo ---");
		demoJavaUtilStack();
		System.out.println("--- ArrayDeque (recommended) demo ---");
		demoArrayDequeStack();
	}
}
