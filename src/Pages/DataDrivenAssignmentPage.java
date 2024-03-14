package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DataDrivenAssignmentPage 
{
	WebDriver driver;
	By email=By.xpath("//*[@id=\"user-name\"]");
	By pass=By.xpath("//*[@id=\"password\"]");
	By log=By.xpath("//*[@id=\"login-button\"]");
	
	public DataDrivenAssignmentPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void  input(String username,String Password)
	{
		//driver.findElement(email).clear();
		driver.findElement(email).sendKeys(username);
		//driver.findElement(pass).clear();
		driver.findElement(pass).sendKeys(Password);
		driver.findElement(log).click();
	}

}
