package com.code.abstr;

public abstract class Shape {
  private double x;
  private double y;
 public abstract double area();
  
public Shape()
{
	super();
}

public Shape(double x, double y) 
{
	super();
	this.x = x;
	this.y = y;
}

public String toString() 
{
return " "+x+" "+y;  
}
}