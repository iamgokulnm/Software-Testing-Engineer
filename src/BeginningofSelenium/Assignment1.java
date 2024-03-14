package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1
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
		Thread.sleep(10);
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobiles",Keys.ENTER);
	    driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	    driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]")).click();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gokulnm96@gmail.com");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='nav-xshop']/a[1]")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.findElement(By.xpath("//*[@id='nav-main']/div/a/span")).click();
	    driver.close();	}

}
