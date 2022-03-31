package com.brigelabz.linkedlist;

public class LinkedList {
	 Node head;

	    public void show(){
	        Node temp = head;
	        System.out.print("LinkedList: ");
	        while(temp != null){
	            System.out.print(temp.data+" ---> ");
	            temp = temp.next;
	        }
	        System.out.print(temp);
	    }
}
