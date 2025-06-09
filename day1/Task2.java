package datastructure;

import java.util.Scanner;

public class Task2 {

		 static void insertAtBeginning(int[] arr, int n, int element) {
		        for (int i = n; i > 0; i--) {
		            arr[i] = arr[i - 1];
		        }
		        arr[0] = element;
		    }

		   
		    static void insertAtMiddle(int[] arr, int n, int element) {
		        int mid = n / 2;
		        for (int i = n; i > mid; i--) {
		            arr[i] = arr[i - 1];
		        }
		        arr[mid] = element;
		    }

		    
		    static void insertAtEnd(int[] arr, int n, int element) {
		        arr[n] = element;
		    }

		    static void printArray(int[] arr, int size) {
		        for (int i = 0; i < size; i++) {
		            System.out.print(arr[i] + " ");
		        }
		        System.out.println();
		    }

		 
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        int[] arr = new int[100]; 
		        int n;

		        System.out.print("Enter size: ");
		        n = sc.nextInt();

		        System.out.println("Enter elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.print("Enter element to insert: ");
		        int element = sc.nextInt();

		       
		        insertAtBeginning(arr, n, element);
		        System.out.print("Inserting at beginning: ");
		        printArray(arr, n + 1);

		      
		        insertAtMiddle(arr, n + 1, element);
		        System.out.print("Inserting at middle: ");
		        printArray(arr, n + 2);

		        
		        insertAtEnd(arr, n + 2, element);
		        System.out.print("Inserting at end: ");
		        printArray(arr, n + 3);

		        sc.close();
		    }
		
}

