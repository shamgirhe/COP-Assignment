package tester;
import java.util.Scanner;
import code.AccessSpecifier;
public class TesterAccessSpecifier {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		AccessSpecifier as=new AccessSpecifier(sc.nextInt());
		int b=as.getA();
		System.out.println(b);

	}
}
