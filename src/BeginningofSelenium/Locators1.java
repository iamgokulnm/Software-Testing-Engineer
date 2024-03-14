package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators1 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]")).click();
		driver.findElement(By.name("name1a450800")).sendKeys("GOKUL MOHAN");
		driver.findElement(By.name("login6f551dc6")).sendKeys("gokulnjattuvetty@rediffmail.com");
		driver.findElement(By.name("passwd6f551dc6")).sendKeys("Gokul@1996");
		driver.findElement(By.id("newpasswd1")).sendKeys("Gokul@1996");
		driver.findElement(By.name("altemail6f551dc6")).sendKeys("gokulsheebamohan@gmail.com");
		driver.findElement(By.name("mobno6f551dc6")).sendKeys("9656298720");
		WebElement day=driver.findElement(By.name("DOB_Day6f551dc6"));
		Select ob=new Select(day);
		ob.selectByValue("14");
		WebElement month=driver.findElement(By.name("DOB_Month6f551dc6"));
		Select obj=new Select(month);
		obj.selectByVisibleText("AUG");
		WebElement year=driver.findElement(By.name("DOB_Year6f551dc6"));
		Select objj=new Select(year);
		objj.selectByValue("1996");
	}

}
