package datastructure;

import java.util.Arrays;

import java.util.Scanner;

public class Day8_Task5 {

	public int find(int[] arr, int mid, int tr, int l, int r) {

		int freq=1;

		while(l<=r) {

			mid=(l+r)/2;

			if(arr[mid]==tr) {

				System.out.println("Value found at "+mid);

				int i=mid-1;

				while(i>=1 && arr[i]==tr) {

					freq++;

					i--;

				}

				int j=mid+1;

				while(j<=r && arr[j]==tr) {

					freq++;

					j++;

				}

				System.out.println("Frequency count is "+freq);

				break;

			}

			else if(arr[mid]>tr) {

				r=mid-1;

			}

			else {

				l=mid+1;

			}

		}

		return -1;

	}

	public static void main(String[]args) {

		Scanner s=new Scanner(System.in);

		Day8_Task5 bt=new Day8_Task5();

		System.out.println("Enter the size:");

		int n=s.nextInt();

		int arr[]=new int[n];

		System.out.println("Enter the elements:");

		for(int i=0;i<n;i++) {

			arr[i]=s.nextInt();

		}

		System.out.println("Array:"+Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.println("Sorted array:"+Arrays.toString(arr));

		System.out.println("Search the value:");

		int tr=s.nextInt();

		int l=0,r=n-1,mid=0;

		int res=bt.find(arr,mid,tr,l,r);
		

		if(res!=-1) {

			System.out.println("Value not found");

		}

		s.close();

	}

}