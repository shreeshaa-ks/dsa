package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_Task4 {
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
		for(int i=0;i<size-1;i++) {
			int k=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[k]) {
					k=j;
				}
			}
			int temp=arr[k];
			arr[k]=arr[i];
			arr[i]=temp;
		}
		System.out.println("Sorted array:"+Arrays.toString(arr));

		sc.close();
	}

}
