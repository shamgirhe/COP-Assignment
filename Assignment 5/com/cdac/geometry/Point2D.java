/*
 Task 1
Create a  class Point2D  , under package "com.cdac.geometry" for 
representing a point in x-y co-ordinate system.

1.1 Create a parameterized constructor to accept x & y co-ords.

1.2 Add public String show()) --to return point's x & y co-ords

1.3 Add isEqual method to Point2D class : boolean returning method :
 must return true if both points are having same x,y co-ords or 
 false otherwise.

1.4 Add a method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

 */
 
  
  package com.cdac.geometry;
 

public class Point2D {
private int x;
private int y;

public Point2D(int x, int y) {
	this.x = x;
	this.y = y;
}

public String show()
{
	return "The co-ordinates are:"+"x: "+x+" y: "+y;
}

public boolean isEqual(Point2D p1,Point2D p2)
{
	if(p1.x==p2.x && p1.y==p2.y )
	{
		System.out.println("points are same");
		return true;
	}
	else
		return false;
}

public void calDistance(Point2D p1,Point2D p2)
{
	 double distance= Math.sqrt(p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y);
	 System.out.println("Distance="+distance);		
}
}
