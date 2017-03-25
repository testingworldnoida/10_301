package testing;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_case1 {
	
	
	@BeforeMethod(alwaysRun=true)
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod(alwaysRun=true)
	public void aftermethod()
	{
		System.out.println("After Method");
	}
	
	
	
	
	@Test(groups={"High","Medium"})
    public void testcase1()
    {
    	System.out.println("High & Smoke");
    }
	
	@Test(groups="Low","")
    public void testcase2()
    {
    	System.out.println("low");
        Assert.assertTrue(false);
    }
	
}
