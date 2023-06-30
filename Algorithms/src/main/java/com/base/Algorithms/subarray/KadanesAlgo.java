package com.base.Algorithms.subarray;

public class KadanesAlgo {
	public static Integer maximumSumSubarray(int[] a) {
		int maxSum = a[0], maxEndingHere = a[0];
		int[] arr = {-2,-3,4-1,-2,1,5,-1};
		for (int i = 1; i < a.length; i++) {
		int b = a[i];
		int a2 = maxEndingHere + b;
		maxEndingHere = Math.max(a2, b);
		maxSum = Math.max(maxSum, maxEndingHere);
		}
		return maxSum;
		}
	
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}
