
/*16:read two int array...and store both in third array and display third array
1 2 3
5 6 7 8 9
1 2 3 5 6 7 8 9*/
import java.util.Scanner;

public class arrayconnect {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;

		int size1;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size for array 1::");
		size1 = sc.nextInt();
		arr1 = new int[size1];

		System.out.print("enter elements in array1 : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
        }

		int size2;
		System.out.print("enter size for array 2::");
		size2 = sc.nextInt();
		arr2 = new int[size2];

		System.out.print("enter elements in array2 : ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		arr3 = new int[size1 + size2];
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
			count++;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr3[count] = arr2[i];
			count++;

		}
		System.out.print("array 3 is :");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

	}

}
