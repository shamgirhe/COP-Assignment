package tester;
import java.util.Scanner;
import code.Student;

public class TesterStudent {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student[] s=new Student[5];
		for(int i=0;i<s.length;i++)
		{
			System.out.println("ENter name and city:");
			s[i]=new Student(sc.next(),sc.next());
		}
		for(int i=0;i<s.length;i++)
		{
			s[i].Display();
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getName()+" ");
		}
		sc.close();
	}

}
