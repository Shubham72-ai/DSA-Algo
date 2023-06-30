package com.base.Algorithms.ArrayPartition;

public class MoveAllZeroAtBegining {
	// one array 
	private int[] arr = null;
	
	// constructor to initialize the array
	public MoveAllZeroAtBegining(int[] arr) {
		this.arr = arr;
	}
	
	// swap function
	private void swap(int fst, int sec) {
		int temp = this.arr[fst];
		this.arr[fst] = this.arr[sec];
		this.arr[sec] = temp;
	}
	
	// actual code
	public void moveAllZero() {
		int auxVar = 0;
		for(int i=0; i<this.arr.length; i++) {
			if(this.arr[i] == 0) {
				swap(i, auxVar);
				auxVar++;
			}
		}
	}
	
	// print the array
	public void printArr() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(this.arr[i]+" ");
		}
		System.out.println(" ");
	}
	
}
