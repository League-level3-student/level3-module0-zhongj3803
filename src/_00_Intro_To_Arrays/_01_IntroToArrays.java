package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
	public static void main(String[] args) {
		// 1. declare and Initialize an array 5 Strings
		String[] strings = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(strings[2]);
		// 3. set the third element to a different value
		strings[2] = "q";
		// 4. print the third element again
		System.out.println(strings[2]);
		// 5. use a for loop to set all the elements in the array to a string
		// of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "potato";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		// 7. make an array of 50 integers
		int[] integers = new int[50];
		// 8. use a for loop to make every value of the integer array a random
		// number
		Random ran = new Random();
		for (int i = 0; i < integers.length; i++) {
			integers[i] = ran.nextInt(5000);
		}
		// 9. without printing the entire array, print only the smallest number
		// on the array
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < integers.length; i++) {

			if (integers[i] < smallest) {
				smallest = integers[i];
			}

		}
		System.out.println(smallest);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}
		// 11. print the largest number in the array.
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > largest) {
				largest = integers[i];
			}

		}
		System.out.println(largest);
		// 12. print only the last element in the array
		System.out.println(integers[integers.length - 1]);
	}
}
