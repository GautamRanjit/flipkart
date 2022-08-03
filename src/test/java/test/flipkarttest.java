package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.flipkartgiftcardpage;
import library.flipkarthomepage;
import library.flipkartloginpage;
import maven.flipkart.base;
import maven.flipkart.utlity;

public class flipkarttest extends  base
{


	flipkartloginpage log1;
	flipkarthomepage  home;
	flipkartgiftcardpage plane;
	int TCID;
	@BeforeClass
	public void openbrowser()
	{
		intializabrowser();
	
	    log1=new flipkartloginpage(driver);
	    home=new flipkarthomepage (driver);
		plane=new flipkartgiftcardpage(driver); 

	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		
		
		log1.setflipkartusername(utlity.getPFData("UN"));
		log1.setflipkartpassword(utlity.getPFData("PWD"));
		log1.clickflipkartbtn();
		
		Thread.sleep(3000);
		home.clickonusername(driver);
		
	}
	
	@Test
	 public void verifyflight() throws EncryptedDocumentException, IOException, InterruptedException
	 {
		
		String act= plane.getflipkartgiftcard();
		String exp=utlity.getid(0, 2);
		
		Assert.assertEquals(act, exp,"failed");
	 }
	
	@AfterMethod
	public void logoutFromApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			utlity.captureScreenshot(driver, TCID);
		}
				
	}
	
	
}
