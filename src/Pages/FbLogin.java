package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin 
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement fbmail;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement log;
	public FbLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void testing(String username,String Passwrd)
	{
		fbmail.sendKeys(username);
		password.sendKeys(Passwrd);
		log.click();
	}
	
	
}
