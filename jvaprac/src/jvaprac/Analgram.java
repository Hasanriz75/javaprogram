package jvaprac;

import java.util.Arrays;

public class Analgram {

	public static void main(String[] args) {
String one = "lusten";
String second = "silent";
int str1 = one.length();
int str2 = second.length();

if (str1!=str2) {
	System.out.println("String can't be analgram");
}
else {
	
	char[] c1 = one.toCharArray();
	char[] c2 = second.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	if (Arrays.equals(c1, c2)) {
		System.out.println("String is analgram");
	}
	else {
		System.out.println("String is not analgram");
	}
}
	}
}
