/*
 * 7:Create Student class with rollno,name address.
Write business logic for auto incrment of rollno(don't accept roll no from user)
Write parameterised constr for accepting name and address only
Write getter and setter and display function
7.1 Test Student class by creating  5 diff object.and display aal details(chk rollno created automatically)
7.2 Create an array of 5 students and show only names 

 */
 package code;
 

public class Student {
	private int rollno;
	private String name;
	private String city;
	private static int rollcounter;
	
	static
	{
		rollcounter++;
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRollno() {
		return rollno;
	}
	
	public void Display()
	{
		System.out.println("Roll no:"+rollno+"Name: "+name+"city: "+city);
	}

}
