package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification1
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		WebElement A=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String  B=A.getAttribute("value");
		if(B.equals("Create my account>>"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	
	}

}
