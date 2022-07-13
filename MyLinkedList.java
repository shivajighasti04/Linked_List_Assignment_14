package com.bridgelabz.linkedlist;

/**
 * 
 * 
 * @author Shivaji Ghasti
 *
 */
public class MyLinkedList {
	
	// class variable declaration
	Node head;
	Node tail;

	// Constructor
	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
	}

	// Method to add node in linked list
	public void add(int key) {
		Node newNode = new Node(key);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
	}

	// Method to print node of linked list
	public void printNode() {
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.key + "->");
			temp = temp.next;
		}
		System.out.println(temp.key);
		System.out.println("--------------------------------------------------");
	}
}
