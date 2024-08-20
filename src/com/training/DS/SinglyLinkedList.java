package com.training.DS;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void printSllValues(ListNode head) {

		if (null == head) {
			return;
		}

		ListNode current = head;
		while (null != current) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	private int getSllLength(ListNode head) {

		if (null == head) {
			return 0;
		}

		int count = 0;
		ListNode current = head;
		while (null != current) {
			count++;
			current = current.next;
		}

		return count;
	}

	private void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	private void insertEnd(int value) {
		ListNode current = head;
		if (null == current) {
			current = new ListNode(value);
			head = current;
		}

		while (null != current.next) {
			current = current.next;
		}

		ListNode newNode = new ListNode(value);
		current.next = newNode;
	}

	private void insertNodeAtIndex(int value, int index) {
		ListNode current = head;
		ListNode previous = null;
		int count = 0;

		while (count < index) {
			previous = current;
			current = current.next;
			count++;
		}

		ListNode newNode = new ListNode(value);
		newNode.next = current;
		previous.next = newNode;
	}

	private void deleteFirstNode() {
		ListNode current = head;

		if (null == head) {
			return;
		}

		ListNode temp = current.next;
		head = temp;
	}

	private void deleteLastNode() {
		ListNode current = head;
		ListNode previous = null;
		
		while (null != current.next) {
			previous = current;
			current = current.next;
		}
		
		previous.next = null;
	}
	
	private void reverseSinglyLinkedList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while (null != current) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
			/*
			 * previous = current; current = current.next; current.next = previous;
			 */
		}
		
		head = previous;
	}

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		/*
		 * sll.head = new ListNode(10); ListNode second = new ListNode(1); ListNode
		 * third = new ListNode(8); ListNode fourth = new ListNode(11);
		 * 
		 * sll.head.next = second; second.next = third; third.next = fourth;
		 */

		int sllLength = sll.getSllLength(sll.head);
		System.out.println("Length of SLL :: " + sllLength);

		sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);
		sll.printSllValues(sll.head);
		// System.out.println();

		sll.insertEnd(20);
		sll.printSllValues(sll.head);

		sll.insertNodeAtIndex(15, 2);
		sll.printSllValues(sll.head);

		sll.deleteFirstNode();
		sll.printSllValues(sll.head);

		sll.deleteLastNode();
		sll.printSllValues(sll.head);
		
		System.out.println("***Reverse***");
		sll.reverseSinglyLinkedList();
		sll.printSllValues(sll.head);
	}

}
