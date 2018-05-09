package com.linkedlist;

public class FindMiddleTwoPointer {

	public static void main(String[] args) {
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		ll.append(1);ll.append(2);ll.append(3);	ll.append(4);	ll.append(5);	
		
		// initialize the mid as head and while traversing the linked list, increment the mid to node>next only for odd nodes
		Node<Integer> midNode = ll.head;
		Node<Integer>  current = ll.head;
		int i = 0;
		while(current != null){
			if(i % 2 != 0){
				midNode = midNode.next;
			}
			i++;
			current = current.next;
		}
		System.out.println(midNode.data);
	}

}
