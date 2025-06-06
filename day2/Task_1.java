package datastructure;
import java.util.Arrays;

import java.util.Scanner;

public class Task_1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	
			        System.out.print("Enter the number of elements in the array: ");

			        int n = sc.nextInt();

			        int[] array = new int[n];

			        System.out.println("Enter " + n + " elements:");

			        for (int i = 0; i < n; i++) {

			            array[i] = sc.nextInt();

			        }

			        Arrays.sort(array);

			        int left = 0;

			        int right = n - 1;

			        while (left < right) {

			            int temp = array[left];

			            array[left] = array[right];

			            array[right] = temp;

			            left++;

			            right--;

			        }

			        System.out.println(Arrays.toString(array));
	       
			    }

}
