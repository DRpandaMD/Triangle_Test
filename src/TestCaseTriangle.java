import static org.junit.Assert.*;

import org.junit.Test;

public class TestCaseTriangle 
{
	Triangle triangle;

	
	//Testing for E1
	@Test  
	public void testEquilateral() 
	{
		assertEquals("Equilateral", Triangle.Triangle_Test(3, 3, 3));
	}
	
	//Testing for E2
	@Test
	public void testScalene()
	{
		assertEquals("Scalene", Triangle.Triangle_Test(4, 3, 6));
	}
	
	//Testing for E3
	@Test
	public void testIsosceles()
	{
		assertEquals("Isosceles", Triangle.Triangle_Test(3, 3, 4));
	}
	
	//Testing for E4
	@Test
	public void testRightTriangle()
	{
		assertEquals("Right Triangle", Triangle.Triangle_Test(3, 4, 5));
	}
	
	//Testing for E5
	@Test
	public void testNotTriangle()
	{
		assertEquals("Not a Triangle", Triangle.Triangle_Test(1, 2, 10));
	}
	
	//Testing for E6
	@Test
	public void testUnderboundA()
	{
		assertEquals("value of a is out of range", Triangle.Triangle_Test(-1, 4, 4));
	}
	
	//Testing for E7
	@Test
	public void testUnderboundB()
	{
		assertEquals("value of b is out of range", Triangle.Triangle_Test(4, -1, 4));
	}
	
	//Testing for E8
	@Test
	public void testUnderboundC()
	{
		assertEquals("value of c is out of range", Triangle.Triangle_Test(4, 4, -1));
	}
	
	//Testing for E9
	@Test
	public void testOverboundA()
	{
		assertEquals("value of a is out of range", Triangle.Triangle_Test(201, 4, 4));
	}
	
	//Testing for E10
	@Test
	public void testOverboundB()
	{
		assertEquals("value of b is out of range", Triangle.Triangle_Test(4, 201, 4));
	}
	
	//Test for E11
	@Test
	public void testOverboudC()
	{
		assertEquals("value of c is out of range", Triangle.Triangle_Test(4, 4, 201));
	}
	

}
