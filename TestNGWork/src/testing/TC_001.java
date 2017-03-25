package testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_001 {

	@BeforeMethod(alwaysRun=true)
	public void bme()
	{
		System.out.println("Before M");
	}
	
	@AfterMethod(alwaysRun=true)
	public void ame()
	{
		System.out.println("After M");
	}
	
	@Test(groups={"High","Smoke"})
    public void tcae1()
    {
    	System.out.println("High & Smoke");
    }
	
	@Test(groups="Medium")
    public void tcae2()
    {
    	System.out.println("Medium");
    	Assert.assertTrue(false);
    }
	
}
