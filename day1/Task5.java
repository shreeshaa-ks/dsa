package datastructure;
import java.util.Scanner;
public class Task5 {


	    public static void main(String[] args) {
	        showMenu(); 
	    }

	    public static void showMenu() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\n==== Menu ====");
	        System.out.println("1. Add two numbers");
	        System.out.println("2. Find factorial");
	        System.out.println("3. Reverse a string");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice: ");
	        
	        int choice = scanner.nextInt();
	        scanner.nextLine(); 

	        switch (choice) {
	            case 1:
	                System.out.print("Enter first number: ");
	                int a = scanner.nextInt();
	                System.out.print("Enter second number: ");
	                int b = scanner.nextInt();
	                System.out.println("Sum = " + (a + b));
	                break;

	            case 2:
	                System.out.print("Enter number to find factorial: ");
	                int num = scanner.nextInt();
	                System.out.println("Factorial of " + num + " = " + factorial(num));
	                break;

	            case 3:
	                System.out.print("Enter a string to reverse: ");
	                String str = scanner.nextLine();
	                System.out.println("Reversed string: " + reverseString(str));
	                break;

	            case 4:
	                System.out.println("Exiting... Goodbye!");
	                return; 
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }

	    
	        showMenu();
	    }

	    
	    public static int factorial(int n) {
	        if (n <= 1)
	            return 1;
	        else
	            return n * factorial(n - 1);
	    }

	   
	    public static String reverseString(String str) {
	        if (str.isEmpty())
	            return str;
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
	}
