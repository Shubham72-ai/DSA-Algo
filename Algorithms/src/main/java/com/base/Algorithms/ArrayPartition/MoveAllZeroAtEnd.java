package com.base.Algorithms.ArrayPartition;

public class MoveAllZeroAtEnd {

	private int[] arr=null;
	
	public MoveAllZeroAtEnd(int[] arr) {
		this.arr = arr;
	}
	
	public void moveAllZeroAtEnd() {
		int boundary = this.arr.length - 1;
		for(int i=this.arr.length - 1; i>0; i--) {
			if(this.arr[i]==0) {
				swap(i, boundary);
				boundary--;
			}
		}
		
	}
	
	public void swap(int first, int seconed) {
		int temp = this.arr[first];
		this.arr[first] = this.arr[seconed];
		this.arr[seconed] = temp;
	}
	
	public void printArr() {
		for(int i=0; i<this.arr.length; i++)
		{
			System.out.print(this.arr[i]+",");
		}
	}
}
