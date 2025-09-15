package jvapracarry;

import java.util.Arrays;

public class Addtwoarray {

	public static void main(String[] args) {
int arr[] = new int[3];
arr[0] = 2;
arr[1] = 3;
arr[2] = 4;

int arr2[] = new int[4];
arr2[0] = 67;
arr2[1] = 64;
arr2[2] = 61;
arr2[3] = 26;

int arr3[] = new int[arr.length + arr2.length];
for (int i = 0 ; i<arr.length ; i++) {
	arr3[i] = arr[i];
}
for (int j = 0 ; j<arr2.length ; j++) {
arr3[arr.length+j]= arr2[j];
	}
System.out.println(Arrays.toString(arr3));
}
}