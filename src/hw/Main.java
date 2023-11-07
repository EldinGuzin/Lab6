package hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		
		int[] values = {6,5,8,7,11};
		//System.out.println("smallest: " + smallest(values));
		//System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
		System.out.println(indexOfTheSmallestStartingFrom(values, 2));
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
	
	
	
	
	
		}
