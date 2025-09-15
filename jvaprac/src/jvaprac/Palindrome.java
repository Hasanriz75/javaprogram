package jvaprac;

public class Palindrome {

	public static void main(String[] args) {
		String test = "tteerett";
		String test1="";
		for(int i=test.length()-1;i>=0;i--) {
			test1 += test.charAt(i);
			
		}
		if (test1.equals(test)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");

		}
	}

}
