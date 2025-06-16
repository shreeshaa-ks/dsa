package datastructure;

import java.util.*;


public class Day8_Task4 {

	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);



	        List<Integer> intList = new ArrayList<>();

	        List<Double> doubleList = new ArrayList<>();

	        List<String> stringList = new ArrayList<>();



	        System.out.println("Enter values (type 'done' to finish):");



	        while (true) {

	            String input = scanner.nextLine();



	            if (input.equalsIgnoreCase("done")) break;



	            try {

	                int intValue = Integer.parseInt(input);

	                intList.add(intValue);

	                continue;

	            } catch (NumberFormatException e) {

	              

	            }



	            try {

	                double doubleValue = Double.parseDouble(input);

	                doubleList.add(doubleValue);

	                continue;

	            } catch (NumberFormatException e) {

	            

	            }



	            stringList.add(input);

	        }



	        System.out.println("\nStored Data:");

	        System.out.println("Integers: " + intList);

	        System.out.println("Doubles: " + doubleList);

	        System.out.println("Strings: " + stringList);



	        System.out.println("\nEnter a value to search:");

	        String searchInput = scanner.nextLine();



	        boolean found = false;



	        try {

	            int searchInt = Integer.parseInt(searchInput);

	            found = intList.contains(searchInt);

	            System.out.println("Input type: Integer");

	        } catch (NumberFormatException e1) {

	            try {

	                double searchDouble = Double.parseDouble(searchInput);

	                found = doubleList.contains(searchDouble);

	                System.out.println("Input type: Double");

	            } catch (NumberFormatException e2) {

	                found = stringList.contains(searchInput);

	                System.out.println("Input type: String");

	            }

	        }



	        if (found) {

	            System.out.println("Value found!");

	        } else {

	            System.out.println("Value not found.");

	        }



	        scanner.close();

	    }

	}

