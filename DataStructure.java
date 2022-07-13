package com.bridgelabz.linkedlist;

/**
 * Ability to create Linked List by adding 30 and 56 to 70
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

	public static void main(String[] args) {
		System.out.println("-----------Welcome to linked list program---------");
		System.out.println();

		System.out.println("Add Elements in List : ");
		add();
	}
}
