 package Tester;
import code.ComplexNumber;
import java.util.Scanner;
public class TesterComplexNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ComplexNumber obj = new ComplexNumber();
		System.out.println("Enter real and imaginary number : ");
		obj.Accept(sc.nextInt(), sc.nextInt());
		obj.Display();
		System.out.println("Enter new real number : ");
		obj.Set_Real(sc.nextInt());
		obj.Get_Real();
		obj.Display();
		System.out.println("Enter new imaginary number : ");
		obj.Set_img(sc.nextInt());
		obj.Get_img();
		obj.Display();
		
	}

}
