package jvaprac;

public class Removelowercase {

	public static void main(String[] args) {
		String word = "My Name Is HasaN";
		String newword ="";
		for(int i = 0 ;i<word.length();i++ ) {
			char c = word.charAt(i);
			if(Character.isLowerCase(c)) {
				continue;
			}
			newword += c;
			}
		System.out.println(newword);		}
		
	
	}


