package com.code.abstr;

public class Square extends Shape{
  private double side;
  
  public Square()
  {
	  
  }
  
  public double area() {
	  return side*side;
  }

public Square(double side) {

	this.side = side;
}
  
}
