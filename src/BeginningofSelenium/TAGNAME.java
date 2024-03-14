package BeginningofSelenium;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TAGNAME
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		List<WebElement> Li = driver.findElements(By.tagName("a"));
		System.out.println(Li.size());
		for(WebElement A:Li)
		{
			String link=A.getAttribute("href");
			String text=A.getText();
			System.out.println(link + "==" + text);
		}
	}

}
