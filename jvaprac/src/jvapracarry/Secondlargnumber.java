package jvapracarry;

public class Secondlargnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {3,5,8,2,7,9};
		int max = arr[0];
		int secmax = arr[1];
		for(int i=0;i<=arr.length-1 ; i++)
		{
			if (arr[i]>max) {
				secmax = max;
				max = arr[i];
				
				
				if(arr[i]>secmax && arr[i]!=max) {
					secmax = arr[i];
				}
			
			}
		}
		System.out.println("Maximum number is " + max);
		System.out.print("Second Maximum number is " + secmax);

	}

}
