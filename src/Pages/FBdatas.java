package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FBdatas
{
     WebDriver driver;
     By email=By.xpath("//*[@id=\"email\"]");
     By pass=By.xpath("//*[@id=\"pass\"]");
	 By login=By.name("login");
	
	public FBdatas(WebDriver driver)
	{
		this.driver=driver;
	
	}
	public void input(String username,String password)
	{
		driver.findElement(email).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
	}
	public void click()
	{
		driver.findElement(login).click();
	}
	

}
