package datastructure;

import java.util.Arrays;

import java.util.Scanner;


public class Task2 {

	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size:");

		int a=sc.nextInt();

		System.out.println("Enter the elements:");

		int []num=new int[a];

		for(int i=0;i<a;i++) {

			num[i]=sc.nextInt();

		}

		System.out.println("Before insertion:"+Arrays.toString(num));

		int start=0;

		int end=a-1;

		System.out.println("Element to be inserted:");

		int k=sc.nextInt();

		

		int []array=new int[a+1];

		for(int i=0,j=0;i<array.length;i++) {

			if(i==start) {

				array[i]=k;

			}

			else {

				array[i]=num[j++];

			}

		}
			

		System.out.println("After insertion:"+Arrays.toString(array));

	}



}

