package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAmazon
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(180);
		driver.findElement(By.xpath("//*[@id='nav-search']/div/form")).sendKeys("Mobiles",Keys.ENTER);
	}

}
