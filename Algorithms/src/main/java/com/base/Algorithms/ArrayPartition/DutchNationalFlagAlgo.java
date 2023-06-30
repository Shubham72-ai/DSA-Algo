package com.base.Algorithms.ArrayPartition;


/**
 * @author elesc
 * this is part of array partition
 */
public class DutchNationalFlagAlgo {

	private int[] arr = null;
	
	public DutchNationalFlagAlgo(int[] arr) {
		this.arr = arr;
	}
	
	public void algo(int pivoit) {
		int lowerBoundary = 0;
		int upperBoundary = this.arr.length - 1;
		int i =0;
		while(i <= upperBoundary) {
			if(this.arr[i] < pivoit) {
				swap(i, lowerBoundary);
				lowerBoundary++;
				i++;
			} else if(this.arr[i] > pivoit) {
				swap(i, upperBoundary);
				upperBoundary--;
			} else {
				i++;
			}
		}
	}

	private void swap(int fst, int sec) {
		int temp = this.arr[fst];
		this.arr[fst] = this.arr[sec];
		this.arr[sec] = temp;
	}
	
	public void print() {
		for(int i=0; i<this.arr.length; i++) {
			System.out.print(this.arr[i]+" ");
		}
	}
}
