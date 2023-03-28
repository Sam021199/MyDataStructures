package practice;

import java.util.Random;

public class QuickSort {

	
	public static void main(String[] args) {

		Random rd = new Random();
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(100);
		}
		
		
		System.out.println("Before sort: ");
		print(arr);
		
		sort(arr,0,arr.length-1);
		
		System.out.println("After sort: ");
		print(arr);
		
	}

	private static void sort(int[] arr, int low, int high) {
		
		if(low>=high) {
			return;
		}
		
		int pivot=arr[high];
		int leftPointer=low;
		int rightPointer=high;
		
		while(leftPointer < rightPointer) {
			
			while(arr[leftPointer] < pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			while(arr[rightPointer] > pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			swap(arr,leftPointer,rightPointer);
			
		}
		swap(arr,leftPointer,high);
		
		
		sort(arr,low,leftPointer-1);
		sort(arr,leftPointer+1,high);
	}
	
	

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
