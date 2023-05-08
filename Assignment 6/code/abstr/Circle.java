package com.code.abstr;

public  class Circle extends Shape{
	private double r;
	
	
	public Circle()
	{
		super();
	}

	@Override
	public double area()
	{
		return 3.14*r*r;
	}
	
public Circle(double r) 
{
	this.r=r;	
}

@Override
public String toString()
{
	return super.toString()+this.r;
}

}
