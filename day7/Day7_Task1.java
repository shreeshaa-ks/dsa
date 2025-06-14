package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_Task1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array values:"+Arrays.toString(arr));
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After bubble sort"+Arrays.toString(arr));
		
		sc.close();
	}

}
