package shape;
class Shapes{
public class Rectangle
{

public void area(long x,long y)
	{
		System.out.println("area of rectangle is:"+(x*y));
	}
}

public class Square
{
	public void area(long x,long y)
	{
		if(x==y)
		{
		    System.out.println("The area of Square is:"+(x*y));
		}
		else
		{
		    System.out.println("Invalid dimensions...");
		}
	}
}

public class Triangle
{
	public void area(long x,long y)
	{
		System.out.println("the area of triangle is:"+(x*y*0.5));
	}
}
}