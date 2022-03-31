package com.brigelabz.linkedlist;

public class MainClass {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        linkedList.head.next = second;
        second.next = third;

        linkedList.show();
    }
}
