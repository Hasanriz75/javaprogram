package jvapracarry;

import java.util.Arrays;

public class Reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		
		int revarr[] = new int[arr.length];
		
for (int i = 0 ; i < arr.length ; i++) {
	revarr[arr.length-i-1]=arr[i];
}
System.out.println(Arrays.toString(revarr));
	}

}
