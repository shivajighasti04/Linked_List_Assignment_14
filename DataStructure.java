package com.bridgelabz.linkedlist;

/**
 *Ability to insert 30 between 56 and 70
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
	
	// Insert node in LinkList
	public static void insertNode() {
		MyLinkedList list = new MyLinkedList();
	
		// insert node
		list.append(56);
		list.append(70);
		System.out.println("Before Inserting : ");
		list.printNode();
		list.insertNode(list.head, 30);
		System.out.println("After Inserting : ");
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
	
		// Calling Insert Method
		System.out.println("Insert 30 in between 56 and 70");
		insertNode();
	}
}
