package jvaprac;

public class Remove_dups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "tabaht";
String names ="";
		for(int i=0;i<name.length();i++) {
			int count=1;
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					count++;
				}			
			}
			if(count==1) {
				
			names += name.charAt(i);		
			}			
		}
		System.out.println(names);
	}
}
