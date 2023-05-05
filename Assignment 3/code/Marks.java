/*1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
Accept data (acceptInfo()) and display  using display member function.
Also display total,percentage and grade.*/
 package code;


public class Marks {
	private int rollno;
	private int mark1;
	private int mark2;
	private int mark3;
	
	public void acceptInfo(int rollno,int mark1,int mark2,int mark3)
	{
		this.rollno=rollno;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	public void display()
	{
		
		if(mark1>=40&&mark2>=40&&mark3>=40)
		{
			int total=this.mark1+this.mark2+this.mark3;
			System.out.println("total marks="+total);
			double per=total/3;
			System.out.println("percentage="+per);
			
		if(per>=40&&per<60)
			System.out.println("Grade c");
		else if(per>=60&&per<80)
			System.out.println("Grade B");
		else if(per>=80&&per<=100)
			System.out.println("Grade A");
		else if(per>100)
			System.out.println("you are fail");
		else
			System.out.println("you entered incorrect marks!");
		}
		else
			System.out.println("you are fail");
		
	}
	
	

}
