package tr.org.kamp.linux;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo2 {
	public static void main(String[] args) {
		
	/*	int[]  myArray = {4,2,8,6,4,2,12,67,87};
		reverseArray(myArray);
	}
	public static void reverseArray(int[] myArray){
		for (int i = 0; i < myArray.length; i++) {
         System.out.print(myArray[myArray.length-1-i] + " ");			
			
			
		}
	*/
		
		int[] intArray = {1,2,3,4,5,6,7,8,9,56,44,34,58,99};
		
		System.out.println("array" + Arrays.toString(intArray));
		for (int i = 0; i < intArray.length/2; i++) {
			int x = intArray[i];
			intArray[i] = intArray[intArray.length-i-1] =x;
			
		}
		System.out.println("ters array" + Arrays.toString(intArray));
		
	}
}