package com.bridgelabz.linkedlist;

/**
 * create a simple Linked List of 56, 30 and 70
 * 
 * @author Shivaji Ghasti
 *
 */
public class DataStructure {
	
	public static void main(String[] args) {
		System.out.println("-----------Welcome to linked list program---------");
		System.out.println();

		System.out.println("Linked list contain : ");
		MyLinkedList list = new MyLinkedList();

		// Add key
		list.add(70);
		list.add(30);
		list.add(56);

		// Print node
		list.printNode();
	}
}
