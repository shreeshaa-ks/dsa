package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_Task1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {3,8,4,7};
		System.out.println("Unsorted array:"+Arrays.toString(arr));
		System.out.println("Search the element:");
		int find=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==find) {
				System.out.println(i);
				flag=true;
				break;
			}
		}
		if(flag!=true) {
		System.out.println("Value not found");
		
		}
		sc.close();
	}

}
