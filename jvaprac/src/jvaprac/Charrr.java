package jvaprac;

public class Charrr {

	public static void main(String[] args) {
		
		String word = "hello";

		for (char chh='a' ; chh<='z' ; chh++) {
			int count =0;
			for (int i=0;i<word.length();i++) {
				if(chh==word.charAt(i)) {
					count++;
				}
				
			}
			if (count>0) {
				System.out.println(count +" " + chh);
				}
		}
	}
}
