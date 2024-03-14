package BeginningofSelenium;


import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception 
	{
		File image =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(image,new File("D://ssss258.png"));
	}

}
