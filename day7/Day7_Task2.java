package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Day7_Task2 {
   public static void quicksort(int[] num, int l, int r) {
	   if(l<r) {
		   int m=split(num,l,r);
		   quicksort(num,l,m-1);
		   quicksort(num,m+1,r);
	   	}
   }
   public static int split(int[] num, int l, int r) {
	   int n=num[r];
	   int i=l-1;
	   for(int j=l;j<r;j++) {
		   if(num[j]<=n) {
			   i++;
			   int temp=num[i];
			   num[i]=num[j];
			   num[j]=temp;
		   }
	   }
	   int temp=num[i+1];
	   num[i+1]=num[r];
	   num[r]=temp;
	   return i+1;
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

	   quicksort(num,0,x-1);

	   System.out.println("Sorted array:"+Arrays.toString(num));

	   s.close();
   }


}
