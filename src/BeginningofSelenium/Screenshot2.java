package BeginningofSelenium;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 
{
	ChromeDriver driver;
	@Before
	public void main()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		WebElement dayscreenshot=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File image = dayscreenshot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(image,new File("./Screenshot//Newimage.png"));
		
	}

}
