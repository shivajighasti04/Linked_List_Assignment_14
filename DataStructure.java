package com.bridgelabz.linkedlist;

/**
 *Ability to create Linked List by appending 30 and 70 to 56
 * 
 * @author Shivaji Ghasti
 *
 */
public class DataStructure {
	// Add element
	public static void add() {
		// create object
		MyLinkedList list = new MyLinkedList();

		list.add(70);
		list.add(30);
		list.add(56);

		// print node
		list.printNode();
	}

	// Append Method
	public static void append() {
		MyLinkedList list = new MyLinkedList();

		// append node
		list.append(56);
		list.append(30);
		list.append(70);

		// print node
		list.printNode();
	}

	public static void main(String[] args) {
		System.out.println("-----------Welcome to linked list program---------");
		System.out.println();

		// Calling Add methods
		System.out.println("Add Elements in List : ");
		add();

		// Calling Append Method
		System.out.println("Appended element of Linked List :");
		append();
	}
}
