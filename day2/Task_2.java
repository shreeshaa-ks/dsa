package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
		public static void main(String[] args) 

	    {

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of elements: ");

	        int n = scanner.nextInt();

	        int[] array = new int[n];

	        System.out.println("Enter " + n + " elements:");

	        for (int i=0;i<n;i++) 

	        {

	            array[i] = scanner.nextInt();

	        }

	        Arrays.sort(array);

	        int front=0;

	        int back=array.length-1;

	        System.out.println("Before swapping"+ Arrays.toString(array));

	        while(front<back)

	        {

	        	int temp=array[back];

	        	array[back]=array[front];

	        	array[front]=temp;

	        	front++;

	        	back--;

	        }

	        System.out.println("After swapping"+ Arrays.toString(array));

	    
	    }
}

