package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_Task2 {
	public int findMyValue(int a[],int find,int l,int r) {
			if(l>r) {
				return -1;
			}
			int mid=(l+r)/2;
			if(find==a[mid]) {
				return mid;
			}
			else if(find>a[mid]) {
				return findMyValue(a,find,mid+1,r);
			}
			else {
				return findMyValue(a,find,l,mid-1);
			}
		}		
	public void binarysearch() {
		Scanner sc=new Scanner(System.in);
		int a[]= {4,9,2,7,1,6};
		System.out.println("Unsorted array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array:"+Arrays.toString(a));
		System.out.println("Search the element:");
		int find=sc.nextInt();
		
		int left=0;
		int right=a.length-1;
		
		int res=findMyValue(a, find, left, right);
		if(res!=-1) {
			
			System.out.println("Value found at "+res);
		}
		else {
			System.out.println("Value not found");
		}
		sc.close();
	}
	
	public static void main(String[]args) {
		Day8_Task2 bs=new Day8_Task2();
		bs.binarysearch();
	}

}


