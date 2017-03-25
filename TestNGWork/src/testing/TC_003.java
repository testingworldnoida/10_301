package testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_003 {

	@BeforeMethod
	public void bme()
	{
		System.out.println("Before M");
	}
	
	@AfterMethod
	public void ame()
	{
		System.out.println("After M");
	}
	
	@Test
    public void tcae1()
    {
    	System.out.println("Test");
    }
	
	
}
