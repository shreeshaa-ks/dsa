package datastructure;

import java.util.Arrays;

import java.util.Scanner;

public class Task_5 {

	public static void main(String []args) {

		Scanner sc=new Scanner (System.in);

		System.out.println("Enter the size:");

		int size=sc.nextInt();

		int []arr=new int[size];

		System.out.println("Enter the elements:");

		for(int i=0;i<size;i++) {

			arr[i]=sc.nextInt();

		}

	   System.out.println("Enter the target:");

	   int tr=sc.nextInt();

	   Arrays.sort(arr);

		int l=0;

		int r=size-1;

		boolean result=false;

		while(l<r) {

			int sum=arr[l]+arr[r];

			if(sum==tr) {

				System.out.println("Pairs found:"+arr[l]+" and "+arr[r]);

				result=true;

				break;

			}else if(sum<tr) {

				l++;

			}else {

				r--;

			}

		}

		if(!result)

		System.out.println("Pairs not found");

		sc.close();

	}

}