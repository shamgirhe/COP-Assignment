package code;
/*6. Create a class ComplexNumber with data members real, imaginary. 
   Write getters and setters for all the data members. 
   Also add the display function. 
   Create the object of this class in main method and invoke all the methods 
   in that class.*/

public class ComplexNumber {
private int real, imaginary;
public void Accept(int r, int i)
{
	real=r;
	imaginary=i;
}
public void Display()
{
	System.out.println("Complex Number is : "+real+"+i"+imaginary);
}
public void Set_Real(int new_real)
{
	real=new_real;
}
public int Get_Real()
{
	return real;
}
public void Set_img(int new_img)
{
	imaginary=new_img;
}
public int Get_img()
{
	return imaginary;
}
}