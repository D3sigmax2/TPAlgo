package s01;

public class CharStack {
	private int topIndex;
	private char[] buffer;
	// -------------------------------------
	private static final int DEFAULT_SIZE = 10;

	// -------------------------------------
	public CharStack() {
		this(DEFAULT_SIZE);
	}

	// -------------------------------------
	
	// if estimatedSize <1 then the stack is instantiated with the DEFAULT_SIZE
	public CharStack(int estimatedSize) {
		if(estimatedSize<1) {
			estimatedSize = DEFAULT_SIZE;
		}
		this.buffer = new char[estimatedSize];
		this.topIndex = -1;
		
	}

	// -------------------------------------
	// 
	public boolean isEmpty() {

		if (this.topIndex == -1) {
			return true;
		}
		return false; 
	}

	// -------------------------------------
	// if the stack is empty this method return the char null
	public char top() {
		if (!isEmpty()) {
			return this.buffer[this.topIndex];
		}
		return '\0'; 
	}

	// -------------------------------------
	// if the stack is empty this method return the char null
	public char pop() {

		if (!isEmpty()) {

			char temp = this.buffer[this.topIndex];
			this.buffer[this.topIndex] = 0;
			topIndex--;
			return temp;

		}
		return '\0'; 
	}

	// -------------------------------------
	public void push(char x) {

		if (topIndex == buffer.length - 1) {
			char[] newBuffer = new char[this.buffer.length * 2];
			for (int i = 0; i < buffer.length; i++) {
				newBuffer[i] = buffer[i];
			}
			buffer = newBuffer;
		}
		topIndex++;
		buffer[topIndex] = x;

		
	}

	// -------------------------------------
	public static void main(String[] args) {
		int error = 0;
		CharStack stack = new CharStack();
		if(!stack.isEmpty() && (int)stack.pop() != 0 && (int)stack.top() != 0) {
			error++;
		}
		
		String forTest = "jhlidu98shini9vj'ptbh^q4r^gnpwgrp9n";
		for(int i = 0; i<forTest.length();i++) {
			stack.push(forTest.charAt(i));
		}
		for(int i = 0; i<forTest.length();i++) {
			if(stack.pop()==forTest.charAt((forTest.length()-1)- i) == false) {
				error++;
			}
		}
		if(!stack.isEmpty()) {
			error++;
		}
		System.out.println(error +" errors were encountered during test");
	}

}
