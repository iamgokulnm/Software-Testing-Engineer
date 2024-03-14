package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick 
{
	ChromeDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	@Test
	public void clicking()
	{
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		WebElement dble=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions ob=new Actions(driver);
		ob.contextClick(right);
		ob.contextClick(edit);
		ob.perform();
		Alert A=driver.switchTo().alert();
		String B=A.getText();
		System.out.println(A);
		A.accept();
		ob.doubleClick(dble);
		ob.perform();
		Alert C=driver.switchTo().alert();
		String D=C.getText();
		System.out.println(D);
		C.accept();
		
	}

}
