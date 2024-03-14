package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassWork
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert A=driver.switchTo().alert();
		String B=A.getText();
		if(B.equals("i am alert box"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		//A.accept();
		A.dismiss();
	}

}
