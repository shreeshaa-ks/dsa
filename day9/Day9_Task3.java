package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day9_Task3 {
	static int lowersearch(int[] a, int tr) {
		int l=0;
		int r=a.length;
		while(l<r) {
			int mid=(l+r)/2;
			if(a[mid]<tr ) {
				l=mid+1;
			}
			else {
				r=mid;
			}
		}
		return l;
	}
	static int uppersearch(int[] a, int tr) {
		int l=0;
		int r=a.length;
		while(l<r) {
			int mid=(l+r)/2;
			if(a[mid]<=tr ) {
				l=mid+1;
			}
			else {
				r=mid;
			}
		}
		return l;
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		int a[]= {2,8,5,5,5,1,9};
		System.out.println("Unsorted array:"+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array:"+Arrays.toString(a));
		System.out.println("Enter the value:");
		int tr=s.nextInt();
		int res1=lowersearch(a,tr);
		int res2=uppersearch(a,tr);
		int count=res2-res1;
		System.out.println("Count of value:"+count);
		
		s.close();
	}
	

	

}
