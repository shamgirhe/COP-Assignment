package Tester;
import code.Book;
import java.util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book obj=new Book();
		System.out.println("Enter Book Name ID Author Price");
		obj.AcceptBookDetails(sc.next(), sc.nextInt(), sc.next(), sc.nextInt());
        obj.Display();
        System.out.println("Enter Modified Book Name");
        obj.SetName(sc.next());
        obj.GetName();
        System.out.println("Enter Modified Book ID");
        obj.SetId(sc.nextInt());
        obj.GetId();
        System.out.println("Enter Modified Book Author");
        obj.SetAuthor(sc.next());
        obj.GetAuthor();
        System.out.println("Enter Modified Book Price");
        obj.SetPrice(sc.nextInt());
        obj.GetPrice();
        System.out.println("Modified Book Details : ");
        obj.Display();
        
	}

}
