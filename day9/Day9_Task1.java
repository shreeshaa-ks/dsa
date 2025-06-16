package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day9_Task1 {
	private static int search(int[] arr, int tr) {
		int l=0;
		int r=arr.length;
		
		while(l<r) {
			int mid=(l+r)/2;
			if(arr[mid]<tr ) {
				l=mid+1;
			}
			else {
				r=mid;
			}
		}
		return l;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int arr[]= {3,1,8,4,5,2};
		System.out.println("Unsorted array:"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array:"+Arrays.toString(arr));
		System.out.println("Enter the value:");
		int tr=s.nextInt();
		int res=search(arr,tr);
		if(res<arr.length) {
			System.out.println("Value found at "+res);
		}
		else {
			System.out.println("Value not found");
		}
		
		
		s.close();
	}

	

}
