package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker2 
{
	WebDriver driver;
	@BeforeTest
	public void link()
	{
		driver=new ChromeDriver();
		String url="https://www.trivago.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[1]/fieldset/button[1]")).click();
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/h3"));
			String text=month.getText();
			System.out.println(text);
			String expected="April 2024";
			if(text.equalsIgnoreCase(expected))
			{
				System.out.println(text);
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
			}
		}
		List<WebElement> Alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/button/time"));
		for(WebElement Dates:Alldates)
		{
			String day=Dates.getText();
			System.out.println("day");
			if(day.equals("10"))
			{
				Dates.click();
			}
		}
	}

}
