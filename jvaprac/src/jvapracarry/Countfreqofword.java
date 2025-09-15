package jvapracarry;

import java.util.Arrays;

public class Countfreqofword {

	public static void main(String[] args) {
int arr1[] = { 2,4,5,6,2,4,4,7,6,7,3};

Arrays.sort(arr1);

System.out.println(Arrays.toString(arr1));
int count = 1;
for (int i = 0;i<arr1.length-1;i++) {
	
	if (arr1[i]== arr1[i+1]) {
		count++;
		System.out.println(arr1[i]+" occur " +count + " times");
	}
	else {
		count = 1;
	}
	
}
// now counting last word

System.out.println(arr1[arr1.length-1]+ " occur " +count + " times");

	}

}
