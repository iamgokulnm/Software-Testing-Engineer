package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazedemoHW 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void code()
	{
		driver.findElement(By.name("name")).sendKeys("Gokul Mohan");
		driver.findElement(By.name("company")).sendKeys("sunface media");
		driver.findElement(By.id("email")).sendKeys("iamgokul88@gmail.com");
		driver.findElement(By.id("password")).sendKeys("gokul@1996");
		driver.findElement(By.id("password-confirm")).sendKeys("gokul@1996");
		driver.findElement(By.className("btn btn-primary")).click();
	}

}
