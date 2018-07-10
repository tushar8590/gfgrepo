package com.trees.simple;

import com.trees.Node;

public class PostorderTraversal {

	public static void main(String[] args) {
	Node rootNode = new Node(10);
		
		rootNode.left = new Node(2);
		rootNode.right = new Node(12);
		rootNode.left.right = new Node(4);
		rootNode.left.left = new Node(3);
		rootNode.right.left = new Node(5);
		rootNode.right.right = new Node(6);
		PostorderTraversal t = new PostorderTraversal();
		t.traversePostorder(rootNode);

	}
	private void traversePostorder(Node root){
		if(root == null)
			return;
		traversePostorder(root.left);
		traversePostorder(root.right);
		System.out.print(root.data+" ");
		
	}

}
