import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int[] arr = new int[5];
	 System.out.println("Enter  the Array Element::");
	 for(int i = 0 ; i<5; i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 for(int i = 0 ; i<arr.length - 1 ; i++)
	 {
		 for(int j=i+1; j<arr.length; j++ )
		 {
			 if(arr[i]<arr[j])
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
		 }
	 }
	 for(int i =0 ; i<arr.length; i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
	 
	}

}
