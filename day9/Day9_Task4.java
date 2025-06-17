package datastructure;

import java.util.Arrays;

public class Day9_Task4{

	public static void main(String[]args) {
		int arr[]= {2,4,8,2,9,5,3,7,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}

		System.out.println("Sorted Array:"+Arrays.toString(arr));
		int rank=1;

		for(int i=0;i<arr.length;) {
			int tr=arr[i];

			int l=0,r=arr.length;

			while(l<r) {
				int mid=(l+r)/2;
				if(arr[mid]>tr) {
					l=mid+1;
				}else {
					r=mid;
				}
			}int lower=l;

			l=0;
			r=arr.length;

			while(l<r) {
				int mid=(l+r)/2;
				if(arr[mid]>=tr) {
					l=mid+1;
				}
				else {
					r=mid;
				}
			}

			int upper=l;
			int count=upper-lower;

			System.out.println("Count of "+tr+" is "+count+" and Rank is "+rank);

			rank=rank+count;

			if(upper>i) {
				i=upper;
			}else {
				i++;
			}
		}
	}
}


