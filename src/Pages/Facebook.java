package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook 
{
	WebDriver driver;
	By email=By.name("email");
	By pass=By.name("pass");
	By log=By.name("login");
	
	public Facebook(WebDriver driver)
	{
		this.driver=driver;
	}
	public void input(String user,String pwrd)
	{
		driver.findElement(email).sendKeys(user);
		driver.findElement(pass).sendKeys(pwrd);
		driver.findElement(log).click();
	}

}
