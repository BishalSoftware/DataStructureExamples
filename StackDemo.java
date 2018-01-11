package com.BishalSoftware.Jan09_2018;

public class StackDemo {
	int top;
	final int M = 5;
	int[] a = new int[M];

	StackDemo() {
		top = -1; // initialize the state of an object (to create object and assign values to object's instance variable)
	}

	void push(int k) {
		top++;
		if (top <= (a.length - 1)) {
			a[top] = k;
			System.out.println("top number: " + top + " ;top value: " + a[top]);
		} else if (top >= a.length) {
			System.out.println("Stack overflow");
			top--;
		}
	}

	void pop() {
		if (isEmpty() == false) {
			System.out.println(a[top]);
			top--;
		}
		if (isEmpty() == true) {
			System.out.println("Underflow");
		}
	}

	boolean isEmpty() {
		return (top < 0);
	}

	void printData() {
		for (int i = 0; i <= top; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
			System.out.println("array");
		}
	}

	public static void main(String[] args) {

		StackDemo sd = new StackDemo();
		sd.push(2);
		sd.push(5);
		sd.push(8);
		sd.push(10);
		sd.push(15);
		sd.push(50);
		sd.push(20);

		sd.pop();
		sd.pop();
		sd.pop();
		sd.pop();
		sd.pop();
		sd.pop();
		sd.pop();
		sd.pop();
		
		System.out.println();
		sd.printData();
		System.out.println();
	}
}
