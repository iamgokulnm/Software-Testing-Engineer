package BeginningofSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTitleverification 
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
	public void titleverification()
	{
		String Title=driver.getTitle();
		System.out.println("The title is : " + Title);
		String Content=driver.getPageSource();
		if(Content.contains("Gmail"))
				{
					System.out.println("pass");
				}
				else
				{
					System.out.println("fail");
				}
		driver.quit();
	}

}
