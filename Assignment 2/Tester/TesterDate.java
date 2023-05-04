package Tester;
import code.Date;
import java.util.Scanner;
public class TesterDate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Date obj=new Date(); 
		obj.Display();
		
		System.out.println("enter day month year");
		Date obj1=new Date(sc.nextInt(),sc.nextInt(),sc.nextInt()); 
		obj1.Display();
		sc.close();
			}
	

}