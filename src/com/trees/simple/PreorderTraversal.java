package com.trees.simple;

import com.trees.Node;

public class PreorderTraversal {

	public static void main(String[] args) {
		Node rootNode = new Node(10);
		
		rootNode.left = new Node(2);
		rootNode.right = new Node(12);
		rootNode.left.right = new Node(4);
		rootNode.left.left = new Node(3);
		rootNode.right.left = new Node(5);
		rootNode.right.right = new Node(6);
		PreorderTraversal t = new PreorderTraversal();
		t.traversePreorder(rootNode);
	}
	private void traversePreorder(Node root){
		if(root == null)
			return;
		System.out.print(root.data+" ");
		traversePreorder(root.left);
		traversePreorder(root.right);
		
		
	}
}
