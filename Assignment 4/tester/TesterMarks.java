package tester;
import java.util.Scanner;
import code.Marks;
public class TesterMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Marks s=new Marks();
		System.out.println("Enter rollno mark1 mark2 mark3");
		s.acceptInfo(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        s.display();
	}

}
