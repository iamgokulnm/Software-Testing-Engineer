package BeginningofSelenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrgrm 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select ob=new Select(day);
		ob.selectByValue("14");
		List<WebElement> Count = ob.getOptions();
		System.out.println("the count is : " + Count.size());
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select ob1=new Select(month);
		ob1.selectByIndex(7);
		List<WebElement> Counts = ob1.getOptions();
		System.out.println("The count is : " + Counts.size());
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select obj=new Select(year);
		obj.selectByVisibleText("1996");
		List<WebElement> Countss = obj.getOptions();
		System.out.println("The count is : " + Countss.size());
		
		
		
	}

}
