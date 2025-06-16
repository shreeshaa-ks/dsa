package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_Task3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array:"+Arrays.toString(arr));
		for(int i=1;i<size;i++) {
			int k=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>k) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;
		}
		System.out.println("Sorted array:"+Arrays.toString(arr));

		sc.close();
	}

}
