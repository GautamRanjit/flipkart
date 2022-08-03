package maven.flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
     public WebDriver driver;
	public void intializabrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\my program testing\\opps\\flipkart\\browser\\chromedriver.exe");
			
		    driver=new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   
		   
		   driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		   
	}
}
