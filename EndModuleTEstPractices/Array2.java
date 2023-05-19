import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Size of first and second Arry:: ");
	int s1 = sc.nextInt();
	int s2 = sc.nextInt();
	int s3 = s1+s2;
	int[] arr1 = new int[s1];
	int[] arr2 = new int[s2];
	int[] arr3 = new int[s3];
	int count = 0;
	System.out.println("Enter the Element of First array");
	for(int i = 0 ; i<arr1.length; i++)
	{
		arr1[i] = sc.nextInt();
	}
	System.out.println("****************************************");
	for(int i = 0 ; i<arr2.length; i++)
	{
		arr2[i] = sc.nextInt();
	}
	System.out.println("****************************************");
	for(int i = 0 ; i<arr1.length; i++)
	{
		arr3[i] = arr1[i];
		count++;
	}
	System.out.println("****************************************");
	for(int i = 0 ; i<arr2.length; i++)
	{
		arr3[count] = arr2[i];
		count++;
	}
	System.out.println("****************************************");
	System.out.println("Element of first array:: ");
	for(int i = 0 ; i<arr1.length; i++)
	{
		System.out.print(arr1[i]+" ");
	}
	System.out.println("****************************************");
	System.out.println("Element of secound array:: ");
	for(int i = 0 ; i<arr2.length; i++)
	{
		System.out.print(arr2[i]+" ");
	}
	System.out.println("****************************************");
	System.out.println("Element of Third array:: ");
	for(int i = 0 ; i<arr3.length; i++)
	{
		System.out.print(arr3[i]+" ");
	}
	System.out.println("****************************************");
	}

}
