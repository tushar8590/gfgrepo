package com.trees;

public class SimpleTreeImpl {

	public static void main(String ar[]){
		Node rootNode = new Node(5);
		rootNode.insert(4);
		rootNode.insert(2);
		rootNode.insert(1);
		rootNode.insert(8);rootNode.insert(18);rootNode.insert(10);
		System.out.println(rootNode.contains(18));
		rootNode.printInOrder();
	}
	
	
}


