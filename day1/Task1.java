package datastructure;

import java.util.Scanner;

public class Task1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}	
			int min=a[0];
			int max=a[0];
			for(int i=1;i<n;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			
				if(a[i]<min) {
					min=a[i];
				}
			}
			System.out.println("Max:"+max);
			System.out.println("Min:"+min);
		
	}
}
