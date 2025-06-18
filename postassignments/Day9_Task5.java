package datastructure;

public class Day9_Task5 {
	
	    public static int lowerBound(int[] arr, int target) {
	        int l = 0, r = arr.length;
	        while (l < r) {
	            int mid = l + (r - l) / 2;
	            if (arr[mid] >= target) r = mid;
	            else l = mid + 1;
	        }
	        return l;
	    }

	    public static int upperBound(int[] arr, int target) {
	        int l = 0, r = arr.length;
	        while (l < r) {
	            int mid = l + (r - l) / 2;
	            if (arr[mid] > target) {
	            	r = mid;
	            }
	            else l = mid + 1;
	        }
	        return l;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 3, 7, 10, 11, 11, 25};
	        int target = 11;
	        System.out.println("Lower Bound: " + lowerBound(arr, target));
	        System.out.println("Upper Bound: " + upperBound(arr, target));
	    }
	
}
