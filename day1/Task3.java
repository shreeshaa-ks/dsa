package datastructure;

import java.util.Scanner;

public class Task3 {

	public static int factorial(int x) {

		if(x==0 || x==1) {

			return 1;

		}

		else {

			return x*factorial(x-1);

		}

	}
	

	public static int fibonacci(int y) {

		if(y==0) {

			return 0;

		}

		else if(y==1) {

			return 1;

		}

		else {

			return fibonacci(y-1)+ fibonacci(y-2);

		}

	}

	

	public static void main(String []args) {

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a value:");

		int m=sc.nextInt();

		System.out.println("Factorial of "+ m +" is:"+factorial(m));

		System.out.println("Fibonacci of "+ m +" is:");

		for(int i=0;i<m;i++) {

			System.out.print(fibonacci(i)+ " ");

		}

	}

}

