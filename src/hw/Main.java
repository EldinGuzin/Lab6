package hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//1
		
		
		
		int[] values = {6,5,8,7,11};
		System.out.println("smallest: " + smallest(values));
		

	}

	public static int smallest(int[] array) {
		
		Arrays.sort(array);
		return array[0];
		
}
	}
