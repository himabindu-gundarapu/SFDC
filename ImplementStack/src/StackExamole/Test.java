package StackExamole;

public class Test {
		int[] iArr;
		int size;
		int top;
		public Test( int s) {
			this.size = s;
			this.iArr = new int[s];
			this.top = 0;
		}
		
		public void push(int element) {
			iArr[top] = element;
			top++;
		}
		
		public int pop() {
			if (top <= 0) { return -1; }
			
			int elm = iArr[top-1];
			top--;
			return elm;
		}
		
		public int peek() {
			int elm = iArr[top-1];
			return elm;
			
		}
		
		public boolean empty() {
			if (top == 0) { return true; }
			
			return false;
		}
	}
		




