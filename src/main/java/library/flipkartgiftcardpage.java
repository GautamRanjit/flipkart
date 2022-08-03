package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartgiftcardpage 
{

	@FindBy(xpath="//a [text()=\"Flights\"]")private WebElement flight;
	
	public flipkartgiftcardpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getflipkartgiftcard()
	{
		    String air= flight.getText();
		    return air;
		
	}
}
