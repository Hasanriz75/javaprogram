package jvapracarry;

public class Maxnumber {
public static void main(String[] args) {
int arr [] = {3,5,8,2,7,9};
int max = arr[0];
for(int i=0;i<=arr.length-1 ; i++)
{
	if (arr[i]>max) {
		max = arr[i];
	}
}
System.out.print("Maximum number is " + max);
}
}