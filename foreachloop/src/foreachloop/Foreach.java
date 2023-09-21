package foreachloop;

public class Foreach {
	
	    public static void main(String[] args) {
	        // Define & assign array
	        int[] numbers = {18, 23, 54, 7, 56, 8, 34, 2, 6};

	        // Initialize a variable to store the maximum number
	        int max = Integer.MIN_VALUE; // Initialize to the smallest possible integer value

	        //  for-each loop to find the maximum number
	        for (int number : numbers) {
	            if (number > max) {
	                max = number;
	            }
	        }

	        // Print the maximum number
	        System.out.println("The maximum number in the array is: " + max);
	    }
	}

