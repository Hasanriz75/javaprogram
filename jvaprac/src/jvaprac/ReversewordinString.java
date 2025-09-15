package jvaprac;

import java.util.Arrays;

public class ReversewordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "Hey you what are you doing";
String words[] = word.split(" ");
System.out.println(Arrays.toString(words));
System.out.println(words.length);
String result = "";



for (String word1 : words) {
	String revword = "";
	for (int i = word1.length()-1 ; i >=0;i--) {
		
		   char c = word1.charAt(i);
		   revword += c;
			
		}
	result += revword +" ";
}
System.out.println(result);
String resultarr[] = result.split(" ");



System.out.println(Arrays.toString(resultarr));
	}

}
