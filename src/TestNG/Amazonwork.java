package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwork
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void method()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		Thread.sleep(15000);
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("Mobile Phones",Keys.ENTER);
		String heading=driver.getTitle();
		if(heading.equals("amazon.in:mobilephones"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		String parentwindow=driver.getWindowHandle();
		//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"productTitle\"]")).click(); 
		Set<String> child=driver.getWindowHandles();
		 for(String handle:child)
		 {
			 if(!handle.equalsIgnoreCase(parentwindow))
			 {
				 driver.switchTo().window(handle);
			     //driver.findElement(By.xpath("//*[@id=\"2\"]/div/label/i")).click();
				 //driver.findElement(By.xpath("//*[@id=\"a-autoid-22\"]/span/input")).click();
				 //driver.findElement(By.xpath("//*[@id=\"sw-gtc\"]/span/a")).click();
				 driver.close();
			 }
		 }
	}


}
