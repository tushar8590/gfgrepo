package com.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {
	Node<E> head;

	public void append(E new_data) {
		/*
		 * 1. Allocate the Node & 2. Put in the data 3. Set next as null
		 */
		Node<E> new_node = new Node(new_data);

		/*
		 * 4. If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			head = new_node;
			return;
		}

		/*
		 * 4. This new node is going to be the last node, so make next of it as
		 * null
		 */
		new_node.next = null;

		/* 5. Else traverse till the last node */
		Node last = head;
		while (last.next != null)
			last = last.next;

		/* 6. Change the next of last node */
		last.next = new_node;
		return;
	}


	@Override
	public Iterator<E> iterator() {
		return new ElementIterator();
	}

	// Inner class example
	private class ElementIterator<E> implements Iterator<Object> {
		private Node<E> cursor;

		public ElementIterator() {
			this.cursor = (Node<E>) head;
		}

		public boolean hasNext() {
			return this.cursor != null;
		}

		public E next() {
			if (this.hasNext()) {
				Node<E> currentNode = this.cursor;
				E currentData = currentNode.data;
				cursor = currentNode.next;
				return currentData;
			}
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
