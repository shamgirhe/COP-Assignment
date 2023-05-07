/*
 2.6 Add specific functionality , in the sub classes
In Mango : public void pulp()
 {Display name n color of the fruit + a mesg  creating  pulp!}
In Orange : public void juice()
{Display name n weight of the fruit + a mesg extracting juice!}
In Apple : public void jam() 
{Display name of the fruit + a mesg  making jam!}

 */

package com.app.fruits;

public class Mango extends Fruit {
	
	
	public Mango(String color, double weight, String name, boolean fresh)
	{
		super(color,weight,name,fresh);
	}
	
	@Override
	public String getName()
	{
		return super.getName();
	}

	public void pulp()
	{
		System.out.println("Name:"+super.getName()+" Color:"+super.getColor()+" creating  pulp...");
	}
	
	@Override
	public String taste()
	{
		return "sweet";
	}

	
	@Override
	public String toString()
	{
		return super.toString();
	}

}
