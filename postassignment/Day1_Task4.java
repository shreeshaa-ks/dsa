package datastructure;

import java.util.Scanner;

public class Task4 {
	
	public static int sum(int x) {
		int a=0;

		for(int i=1;i<=x;i++) {

			 a += i;

		}
		return a;
	}

	public static void main(String[] args) {

		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");

		int num=ob.nextInt();

		System.out.println("Sum of digits:"+sum(num));

	}



}