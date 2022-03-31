package com.brigelabz.linkedlist;

public class LinkedList {
	Node head;
	Node tail;
	int size;

	public void addFirst(int data) {
		Node t = new Node(data);
		t.data = data;
		t.next = head;
		if (size == 0) {
			tail = t;
		}
		head = t;
		size++;
	}

	public void show(){
		Node temp = head;
		System.out.print("LinkedList: ");
		if(head == null) {
			System.out.println("List is empty");
		}
		while(temp != null){
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.print(temp);
	}
}
