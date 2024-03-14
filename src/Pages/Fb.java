package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fb
{
	WebDriver driver;
	By email=By.id("email");
	By pass=By.name("pass");
	By log=By.name("login");
	
	public Fb(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String username,String Password)
	{
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(username);
		driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys(Password);
		
	}
	public void login()
	{
		driver.findElement(log).click();
	}

}
