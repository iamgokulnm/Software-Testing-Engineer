package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");;
	}
	@Test
	public void tes()
	{
		//driver.findElement(By.name("q")).sendKeys("Cricbuzz");
		//driver.findElement(By.name("btnk")).click();
		
		driver.findElement(By.name("q")).sendKeys("cricbuzz",Keys.ENTER);
	}

}
