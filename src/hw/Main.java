package hw;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		//Here are all the test for all the methods
		int[] values = {6,5,8,7,11};
		//System.out.println("smallest: " + smallest(values));
		//System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
		//System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//		System.out.println(Arrays.toString(values));
//		swap(values,1,0);
//		System.out.println(Arrays.toString(values));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Values of the array: " + Arrays.toString(values));
		System.out.println();
		System.out.println("Enter searched number: ");
		int searchedValue = scanner.nextInt();
		System.out.println();
		
		boolean result = BinarySearch.search(values, searchedValue);
		
		System.out.println(result);
		
	}

	//1
	public static int smallest(int[] array) {
		
		Arrays.sort(array);
		return array[0];
		
}
	
	//2
	
	public static int indexOfTheSmallest(int[] array) {
		
		int smallest = array[0];
		int indexOfTheSmallest = 0;
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] < smallest) {
				smallest = array[i];
				indexOfTheSmallest = i;
			}
			
			
		}
		
		return indexOfTheSmallest;
		
	}
	
	
	//3
	public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
		
		int smallest = array[index];
		int result = index;
		
		for(int i = index; i < array.length; i++) {
			
			if(array[i] < smallest) {
				
				smallest = array[i];
				result = i;
				
				
			}

			}
		return result;
	}
	
	//4
	
	public static void swap(int[] array, int index1, int index2) {
		
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		
	}
	
	
	
		}
