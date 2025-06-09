package datastructure;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[]args) {

		Scanner st=new Scanner(System.in);

		System.out.println("Enter a string:");

		String str=st.next();

		int l=0;

		int r=str.length()-1;

		boolean res=false;

		while(l<r) {

		if (str.charAt(l)==str.charAt(r)) {

			System.out.println("It is a palindrome");

			res=true;

			break;

		}

		l++;

		r--;

		}

		if(res!=true) {

			System.out.println("It is not a palindrome");

		}

		st.close();

	}



}

