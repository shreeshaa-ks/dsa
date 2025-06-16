package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_Task5 {
	public static void mergesort(int[] num, int l, int r) {
		if(l<r) {
			int mid=(l+r)/2;
			mergesort(num,l,mid);
			mergesort(num,mid+1,r);
			merge(num,l,mid,r);
		}

	}
	public static void merge(int[] num, int l, int mid, int r) {
		int n1=mid-l+1;
		int n2=r-mid;

		int lnum[]=new int[n1];
		int rnum[]=new int[n2];
		for(int i=0;i<n1;i++) {
			lnum[i]=num[l+i];
		}
		for(int i=0;i<n2;i++) {
			rnum[i]=num[mid+1+i];
		}
		int a=0;
		int b=0;
		int c=l;
		while(a<n1 && b<n2) {
			if(lnum[a]<=rnum[b]) {
				num[c]=lnum[a];
				a++;
			}
			else {
				num[c]=rnum[b];
				b++;
			}
			c++;
		}
		while(a<n1) {
			num[c]=lnum[a];
			a++;
			c++;
		}
		while(b<n2) {
			num[c]=rnum[b];
			b++;
			c++;
		}

	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int x=s.nextInt();
		int num[]=new int[x];
		System.out.println("Enter the elements:");
		for(int i=0;i<x;i++) {
			num[i]=s.nextInt();
		}
		System.out.println("Unsorted array:"+Arrays.toString(num));

		mergesort(num,0,x-1);

		System.out.println("Sorted array:"+Arrays.toString(num));


		s.close();
	}



}