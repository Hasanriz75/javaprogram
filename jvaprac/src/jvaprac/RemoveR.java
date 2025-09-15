package jvaprac;

public class RemoveR {

	public static void main(String[] args) {
		String name = "Irtiza";
		String newname = "";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)!='r') {
				newname += name.charAt(i);
			}
		}
System.out.println(newname);
	}

}
