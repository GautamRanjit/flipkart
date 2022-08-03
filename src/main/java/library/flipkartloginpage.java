package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartloginpage 
{
	@FindBy(xpath="(//input[@type=\"text\"])[2]") private WebElement UN;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement PWD;
	@FindBy(xpath="//span[text()=\"Login\"]") private WebElement BTN;
	
	
    public flipkartloginpage (WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void setflipkartusername(String username)
    {
    	UN.sendKeys(username);
    }
    public void setflipkartpassword(String password)
    {
    	PWD.sendKeys(password);
    }
    public void clickflipkartbtn()
    {
    	BTN.click();
    }
	

}
