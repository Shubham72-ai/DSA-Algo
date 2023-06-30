package com.base.Algorithms.Trees.BinaryTree.Algo;

import com.base.Algorithms.Trees.BinaryTree.Node.Node;

public class MaxDepth {

	/*
	 *				1
	 * 			  /	   \
	 * 		     2      3
	 * 				   / \
	 * 		          6	  7
	 * 
	 * so here max depth will be 3
	 * 
	 */

	
	public int maxDepth(Node node) {
		if(node == null)
			return 0;
		if(node.leftNode == null && node.rightNode == null)
			return 1;
		int leftDepth = maxDepth(node.leftNode);
		int rightDepth = maxDepth(node.rightNode);
		
		return Math.max(leftDepth, rightDepth) + 1;
		
	}
	
	
	
	
	
	
	
	
	
}








