package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_Task3 {
	public static int search(int[] arr, int tr) {
		int l=0,r=arr.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==tr) {
				return mid;
			}
			else if(arr[l]<=arr[mid]) {
				if(arr[l]<=tr && tr<arr[mid]) {
					r=mid-1;
				}
				else {
					l=mid+1;
				}
			}
			else {
				if(arr[mid]<=tr && tr<=arr[r]) {
					l=mid+1;
				}
				else {
					r=mid-1;
				}
			}
		}
		return -1;
	}
	public static void main(String[]args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=ob.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=ob.nextInt();
		}
		System.out.println("Array:"+Arrays.toString(arr));
		System.out.println("Search the value:");
		int tr=ob.nextInt();
		System.out.println("Value found at the index "+search(arr,tr));

		ob.close();
	}

}