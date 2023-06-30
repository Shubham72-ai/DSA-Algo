package com.base.Algorithms.Trees.BinaryTree.Algo;

import java.util.List;

import com.base.Algorithms.Trees.BinaryTree.Node.Node;

public class InvertBinaryTree {
	
	/*
	 *              1					  1
	 *            /   \					/   \
	 *           2     3     ->        3     2
	 *          / \   / \             / \   / \
	 *         4   5 6   7           7   6 5   4
	 *             
	 *             
	 * 
	 * */
	
	
	public Node inverBinaryTree(Node node) {
		if(node == null)
			return null;
		Node left = inverBinaryTree(node.leftNode);
		Node right = inverBinaryTree(node.rightNode);
		node.leftNode = right;
		node.rightNode = left;
		return node;
	}
	
}
