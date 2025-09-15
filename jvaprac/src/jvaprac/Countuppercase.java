package jvaprac;

public class Countuppercase {

	public static void main(String[] args) {
		String word = "My Name Is HasaN";
		String newword ="";
		for(int i = 0 ;i<word.length();i++) {
			char c = word.charAt(i);
			if(!Character.isUpperCase(c)&&!Character.isWhitespace(c)) {
			newword += c;
				
			}
		}
		System.out.print(newword);
	}
}
