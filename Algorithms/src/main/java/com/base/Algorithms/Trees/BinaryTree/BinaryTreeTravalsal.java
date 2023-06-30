package com.base.Algorithms.Trees.BinaryTree;

import java.util.List;

import com.base.Algorithms.Trees.BinaryTree.Node.Node;

public class BinaryTreeTravalsal {
	
	public List<Integer> preOrder(Node node, List<Integer> arrayList) {	
		if(node == null)
			return null;
		arrayList.add(node.data);
		preOrder(node.leftNode, arrayList);
		preOrder(node.rightNode, arrayList);
		return arrayList;
	}
	
	public void inOrder(Node node) {
		if(node == null)
			return;
	}
	
	public void postOrder(Node node) {
		if(node == null)
			return;
	}
	
}
