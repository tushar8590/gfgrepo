package com.linkedlist;

import java.util.Iterator;

public class BasicInsertion {
	public static void main(String[] args) {
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		ll.append(4);ll.append(7);ll.append(4);
	
		Iterator<Integer> itr = ll.iterator();
		while(itr.hasNext()){
			Integer intNode = itr.next();
			System.out.println(intNode);
		}
	}
}

