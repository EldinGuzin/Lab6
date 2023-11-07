package hw;

import java.util.Arrays;

public class BinarySearch {

	public static boolean search(int[] array, int searchedValue) {
		
	Arrays.sort(array);
	int left = 0;
    int right = array.length - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (array[mid] == searchedValue) {
            return true; // Found the value in the array
        }
        
        if (array[mid] < searchedValue) {
            left = mid + 1; // Value is in the right half of the array
        } else {
            right = mid - 1; // Value is in the left half of the array
        }
    }
    
    return false; // Value not found in the array
	
	}
}
