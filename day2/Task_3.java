package datastructure;
import java.util.Arrays;
import java.util.Scanner;
public class Task_3 {

	public static void main(String[]args) {

		Scanner s=new Scanner (System.in);

		System.out.println("Enter the size:");

		int size=s.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements:");

		for(int i=0;i<size;i++) {

			arr[i]=s.nextInt();

		}

		Arrays.sort(arr);

		int l=0;

		for(int r=1;r<size;r++) {

			if(arr[r]!=arr[l]) {

				l++;

				arr[l]=arr[r];

			}

		}

		System.out.println("After removing duplicates:");

		for(int i=0;i<=l;i++) {

		System.out.print(arr[i]+" ");

		}

		s.close();

	}

	}