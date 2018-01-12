package com.BishalSoftware.Jan09_2018;

public class StackDemo {
	int top;
	final int M = 5;
	int[] a = new int[M]; //array with M capacity of array element is created for stack operation

	StackDemo() {
		top = -1; // initialize the state of an object (to create object and assign values to object's instance variable)
	}

	//push method to place an element on top for stack operation
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

	//pop method for taking out a top element from stack
	void pop() {
		if (isEmpty() == false) {
			System.out.println(a[top]);
			top--;
		}
		else if (isEmpty() == true) {
			System.out.println("Underflow");
		}
	}

	//Returns true if stack is empty; otherwise returns false if stack has an array element. 
	boolean isEmpty() {
		return (top < 0);
	}

	//prints array elements present on stack
	void printData() {
		System.out.println("Printing array elements in Stack...");
		for (int i = 0; i <= top; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
	}

	public static void main(String[] args) {

		StackDemo sd = new StackDemo();
		
		sd.printData();
		System.out.println();
		
		sd.push(2);
		sd.push(5);
		sd.push(8);
		sd.push(10);
		sd.push(15);
		sd.push(50);
		sd.push(20);
		
		System.out.println();
		sd.printData();
		System.out.println();

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
