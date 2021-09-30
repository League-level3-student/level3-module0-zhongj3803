package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		

	}	
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

void printStrings(String[] arr) {
	for (int i = 0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.

void printStringsReverse(String[] arr) {
	for (int i=arr.length-1; i>-1;i--) {
		System.out.println(arr[i]);
	}
}

    //4. Write a method that takes an array of Strings and prints every other String in the array.
void printEveryOther(String[] arr){
	for(int i =0; i<arr.length;i+=2) {
		System.out.println(arr[i]);
	}
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
void printRandom(String[] arr) {
	boolean notFinished = true;
	boolean isEqual = false;
	Random ran = new Random();
	int number = 0;
	int arrNumber = 0;
	ArrayList<Integer> usedNumbers = new ArrayList<Integer>();
	while (notFinished) {
		if (arrNumber==arr.length) {
			break;
		}
		isEqual=false;
		number=ran.nextInt(arr.length);
		for (int i = 0; i<usedNumbers.size();i++) {
			if (number==usedNumbers.get(i)) {
				isEqual=true;
			}
		}
		if (!isEqual) {
			usedNumbers.add(number);
			arr[arrNumber]=arr[number];
			arrNumber++;
		}
	}
	for (int i =0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
}
	
