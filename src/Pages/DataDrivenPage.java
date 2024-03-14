package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataDrivenPage 
{
	WebDriver driver;
	By email=By.name("email");
	By password=By.name("pass");
	By log=By.name("login");
	
	public DataDrivenPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String username,String passwrd)
	{
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(username);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(passwrd);
		driver.findElement(log).click();
	}

}
