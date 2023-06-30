package com.base.Algorithms.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.base.Algorithms.ArrayPartition.DutchNationalFlagAlgo;
import com.base.Algorithms.ArrayPartition.MoveAllZeroAtBegining;
import com.base.Algorithms.ArrayPartition.MoveAllZeroAtEnd;
import com.base.Algorithms.LinkedList.LinkedList;
import com.base.Algorithms.Trees.BinaryTree.BinaryTreeTravalsal;
import com.base.Algorithms.Trees.BinaryTree.Algo.InvertBinaryTree;
import com.base.Algorithms.Trees.BinaryTree.Algo.MaxDepth;
import com.base.Algorithms.Trees.BinaryTree.Node.Node;
import com.base.Algorithms.leetcode.LeetCode;
import com.base.Algorithms.subarray.KadanesAlgo;

@Component
public class MainRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 *      1
		 *    /  \
		 *   2	  3
		 *  / \  / \
		 * 4   5 6  7
		 * 
		 * */
		
		Node root = new Node(1);
		root.leftNode = new Node(2);
		root.rightNode = new Node(3);
		root.leftNode.leftNode = new Node(4);
		root.leftNode.rightNode = new Node(5);
		root.rightNode.leftNode = new Node(6);
		root.rightNode.rightNode = new Node(7);
		
		/*
		 * 1->2->3->4->5->x
		 * 		
		 */
		
		LinkedList linkedList = new LinkedList();
		
		for(int i=1; i<6; i++) {
			linkedList.insertNode(i);
		}
		
		linkedList.printRevLinkedList(linkedList.head);
		System.out.println(" ");
		linkedList.printList();

	}

}
