
public class Triangle
{
	private double a;
	private double b;
	private double c;
	
	public Triangle(double side1, double side2, double side3)
	{
		a = side1;
		b = side2;
		c = side3;
	}
	
	public static String Triangle_Test(double a, double b, double c)
	{
		final double MIN = 1;
		final double MAX = 200;

		if(a < MIN || a > MAX)
			return "value of a is out of range"; 
		if(b < MIN || b > MAX)
			return "value of b is out of range"; 
		if(c < MIN || c > MAX)
			return "value of c is out of range"; 

		if(a < b+c && b < a+c && c < a+b) 
		{ // if triangle
			if(a == b && b == c)
			{
				return "Equilateral";
			}
			else if(a*a == ( b * b ) + (c * c))
			{
				return "Right Triangle";
			}
			else if(b * b == (a * a) + (c *c ))
			{
				return "Right Triangle";
			}
			else if(c * c == (a *a) + (b * b))
			{
				return "Right Triangle";
			}
			else if(a != b && a != c && b != c)
			{
				return "Scalene";
			}
			else
			{
				return "Isosceles";
			}	
		}
		else
		{
			return "Not a Triangle";
		}		    	
	}
}


