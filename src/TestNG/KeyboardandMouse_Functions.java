package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KeyboardandMouse_Functions
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		name.sendKeys("GOKUL MOHAN");
		WebElement id=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions ob=new Actions(driver);
		ob.keyDown(name, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		ob.keyDown(name, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		ob.keyDown(id, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		ob.perform();
	}

}
