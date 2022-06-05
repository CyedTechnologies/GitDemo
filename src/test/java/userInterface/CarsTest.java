package userInterface;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarsTest {
	@BeforeTest
	public void DifferentModels()
	{
		System.out.println("These are the different Models of Cars");
	}
	@Test
	public void Toyota ()
	{
		System.out.println("Corolla 2018");
		System.out.println("RAV4");
		System.out.println("Camry");
		System.out.println("Prius");
		System.out.println("This is a new line to see the changes for a new branch");
		System.out.println("This is 2nd line to see the changes for a new branch");
		
	}
	@BeforeTest
	public void Honda ()
	{

		System.out.println("Civic 2000");
		System.out.println("Accord");
		System.out.println("Civic 2002");
		System.out.println("Civic 2004");

		System.out.println("Civic 2001");
		System.out.println("Accord");
		System.out.println("Civic 2002");
		System.out.println("Civic 2003");

	}
	@Test
	public void Tesla ()
	{
		System.out.println("Model 1");
		System.out.println("Model 2");
		System.out.println("Model 3");
		System.out.println("Model 4");
	}
	@Test(enabled=true)
	public void Alphabits ()
	{
		System.out.println("This is test enabled and disabled");
	}

}
