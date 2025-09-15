package jvaprac;

public class Findvowel {

	public static void main(String[] args) {
String test = "nnnn";
for (int i = 0 ; i<test.length();i++) {
	char ch = test.charAt(i);
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		System.out.println("Vowel is present");
		break;
		
	}

}
}

}
