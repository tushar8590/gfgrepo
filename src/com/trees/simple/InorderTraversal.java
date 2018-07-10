package com.trees.simple;

import com.trees.Node;

public class InorderTraversal {

	public static void main(String[] args) {
		Node rootNode = new Node(10);
		
		rootNode.left = new Node(2);
		rootNode.right = new Node(12);
		rootNode.left.right = new Node(4);
		rootNode.left.left = new Node(3);
		rootNode.right.left = new Node(5);
		rootNode.right.right = new Node(6);
		InorderTraversal t = new InorderTraversal();
		t.traverseInorder(rootNode);
	}
	
	private void traverseInorder(Node root){
		if(root == null)
			return;
		traverseInorder(root.left);
		System.out.print(root.data+" ");
		traverseInorder(root.right);
		
	}


}

