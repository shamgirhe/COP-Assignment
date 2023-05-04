package code;
/*4:  Create a class Book with data members as bname,id,author,price.
 *  Write getters and setters for all the data members.
 *   Also add the display function.  
Create the object of this class in main method and invoke all the 
methods in that class.
*/
public class Book {
String bname, author;
int id, price;
public void AcceptBookDetails(String bnm, int i_d, String au,int pr)
{
	bname=bnm;
	id=i_d;
	author=au;
	price=pr;
}
public void Display()
{
	System.out.println("Book Name : "+bname);
	System.out.println("Book ID : "+id);
	System.out.println("Book Author : "+author);
	System.out.println("Book Price : "+price);
}
public void SetName(String bnm)
{
	bname=bnm;
}
public String GetName()
{
	return bname;
}
public void SetId(int i_d)
{
	id=i_d;
}
public int GetId()
{
	return id;
}
public void SetAuthor(String au)
{
	author=au;
}
public String GetAuthor()
{
	return author;
}
public void SetPrice(int pr)
{
	price=pr;
}
public int GetPrice()
{
	return price;
}
}