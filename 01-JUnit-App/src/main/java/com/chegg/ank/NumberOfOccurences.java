package com.chegg.ank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NumberOfOccurences {

	public static Integer[] getInput() {

		// creating scanner class object for take input from user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 Positive Integer Number");

		// creating Intgere array with size 10
		Integer[] arra = new Integer[10];

		// Applying for loop to take input from user upto array size
		for (int i = 0; i < arra.length - 1; i++) {

			// it will take input from user and stored on arra[i] index 0 to 9
			arra[i] = sc.nextInt();

		}

		// stored element on arra[i] position then return the array
		return arra;

	}

	public static void showRepeatNums(Integer[] array) {

		// Map object stored data in key & value pair
		// creating HashMap object with reference as a duplicates
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// for count we take it count variable
		int count = 1;

		/*
		 * // retrive the element which is stored on array for (int i = 1; i <
		 * array.length - 1; i++) { // comparing element to other element same or not if
		 * (array[i].equals(array[i + 1])) { count++; } // if element not same then
		 * stored into map // using put method else { duplicates.put(array[i], count);
		 * count = 1; } }
		 */
		// retrive the duplicates elements from arrya which is called using keySet()
		// present in HashMap
		// for retrive element we used for each loop
		/*
		 * for ( Integer key : duplicates.keySet() ) { //if duplicates element greater
		 * than 1 then will check that number how many times are their
		 * 
		 * 
		 * 
		 * 
		 * //Here printing the number which is as a key if( duplicates.get(key) >1) {
		 * System.out.println("Number: " + key + " occuars " + duplicates.get(key) +
		 * " times" );
		 * 
		 * } }
		 */


        Set<Integer> duplicate = new LinkedHashSet<Integer>();
        Set<Integer> noDuplicate = new LinkedHashSet<Integer>();
		
		
		   for (int i = 0; i < array.length; i++) {
	            if (map.containsKey(array[i])) {
	                System.out.println("Key :" + array[i] + " Value : " + map.get(array[i]));

	                if (map.get(array[i]) > 1) {
	                    // means repeated character
	                    duplicate.add(array[i]);

	                } else {
	                    // non repeated character
	                    noDuplicate.add(array[i]);
	                }
	            }
	            System.out.println("Duplicate Chars : " + Arrays.toString(duplicate.toArray()));
	            System.out.println("No Duplicate Chars : " + Arrays.toString(noDuplicate.toArray()));
		   
		   }
		
		
	}

	// Program execution start from main() methid
	public static void main(String[] args) {

		/*
		 * getInput() is a static method which is call by using class name and strored
		 * that element in Integer[] input
		 */
		Integer[] input = NumberOfOccurences.getInput();

		/*
		 * showRepeatNums() is also static method which also call by using class name
		 * and and finding repeat number with count each number
		 */
		NumberOfOccurences.showRepeatNums(input);

	}

}
