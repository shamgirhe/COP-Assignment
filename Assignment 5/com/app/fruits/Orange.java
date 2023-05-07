package com.app.fruits;

public class Orange extends Fruit{
	
	public Orange(String color, double weight, String name, boolean fresh)
	{
		super(color,weight, name,fresh);
	}
	
	public void juice()
	{
		System.out.println("Name: "+super.getName()+"extracting juice!");
	}
	
	@Override
	public String taste()
	{
		return "sour";
	}
	
	@Override
	public String getName()
	{
		return super.getName();
	}
	
	@Override
	public String toString()
	{
		return super.toString();
	}

}
