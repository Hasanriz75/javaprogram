package jvaprac;

public class dupchar {

	public static void main(String[] args) {
		String name = "tabaht";
		
		for(int i=0;i<name.length();i++) {
			int count=1;
			for (int j = i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println("Count is "+ count + " for " +name.charAt(i));
			}
		
		}
}}