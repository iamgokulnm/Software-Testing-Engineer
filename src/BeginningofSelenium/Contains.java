package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gokul mohan");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ertyu");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
	}

}
