package com.brigelabz.linkedlist;

public class MainClass {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addLast(56);
		linkedList.addLast(70);
		linkedList.insertBetween(56, 70, 30);
		linkedList.show();
		System.out.println();
		linkedList.insertAfterSearch(30, 40);
		linkedList.show();
		System.out.println("Size = " + linkedList.getSize());
		System.out.println();
		linkedList.deleteAfterSearch(40);
		linkedList.show();
		System.out.println("Size = " + linkedList.getSize());
	}
}
