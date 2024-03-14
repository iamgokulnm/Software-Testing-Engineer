package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFunction 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/Software%20Testing/alert.html");
	}
	
	/*@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Gokul");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Mohan");
	}*/
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert A=driver.switchTo().alert();
		String B=A.getText();
		if(B.equals("I am an alert box"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		A.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Gokul");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Mohan");
	}

}
