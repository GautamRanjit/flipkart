package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class flipkarthomepage
{
	@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]") private WebElement jagdish;
	@FindBy(xpath="//div [text()=\"Gift Cards\"]") private WebElement gift;

	
	public flipkarthomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonusername(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(jagdish).perform();
		gift.click();
	}
}
