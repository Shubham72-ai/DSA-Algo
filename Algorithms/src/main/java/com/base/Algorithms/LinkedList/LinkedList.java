package com.base.Algorithms.LinkedList;

public class LinkedList {

	public LinkedListNode head;
	public LinkedListNode tail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void revLinkList(LinkedListNode ll) {
		if(ll == null)
			return; 
	}
	
	public void printRevLinkedList(LinkedListNode ll) {
		if(ll == null)
			return;
		printRevLinkedList(ll.next);
		System.out.print(ll.data);
	}
	
	public void insertAt(int pos, int val) {
		LinkedListNode newNode = new LinkedListNode(val);
		LinkedListNode p1 = this.head;
		for(int i=0; i<pos -1 ; i++)  {
			p1 = p1.next;
		}
		System.out.println(p1.data);
		LinkedListNode oldRef = p1.next;
		p1.next = newNode;
		newNode.next = oldRef;
	}
	
	public void insertNode(int val) {
		LinkedListNode newNode = new LinkedListNode(val);
		if(this.head == null) {
			// then it is our first node
			this.head = newNode;
			this.tail = newNode;
		}
		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	public void printList() {
		LinkedListNode p1 = this.head;
		while(p1!=null) {
			System.out.print(p1.data+"-> ");
			p1 = p1.next;
		}
	}
	
}
