package BeginningofSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitCode 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void Titleverification()
	{
		String A=driver.getTitle();
		System.out.println(A);
		String B="google";
		if(A.equals(B))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void Contentverification()
	{
		String C=driver.getPageSource();
		if(C.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void close()
	{
		driver.quit();
	}

}
