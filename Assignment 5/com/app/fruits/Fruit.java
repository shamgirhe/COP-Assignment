/*
 Task 2
 
2.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?

Use tight encapsulation.

2.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean

2.3 Add suitable constructor.

2.4 Override  toString correctly to return state of all fruits 
(return only  : name ,color , weight )

 * 2.5 Add a taste() method to return String form of the
	 *  taste of the Fruit
eg :  public String taste()

For Fruit : Can you identify taste of any general fruit ?
So  return :  "no specific taste" 

Apple : should return  "sweet n sour"
Mango : should return  "sweet"
Orange : should return  "sour"
 */

package com.app.fruits;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruit(String color, double weight, String name, boolean fresh)
	{
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	public String getName()
	{
		return this.name;
	}
	public boolean getfreshness()
	{
		return fresh;
	}
	
  @Override
	public String toString()
	{
		return name+" "+color+" "+weight;
	}
  
  public void setFresh(boolean fresh) 
  {
	this.fresh = fresh;
  }
public void pulp()
	{
		System.out.println(" ");
	}

	public String getColor() {
	return color;
}
public double getWeight() {
	return weight;
}
	public String taste()
	{
		return "no specific taste";
	}

}