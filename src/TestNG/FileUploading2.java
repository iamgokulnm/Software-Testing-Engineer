package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploading2 
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("E:\\Gokul's Phone\\Documents\\17.pdf");
	}
	public void fileupload(String A) throws AWTException
	{
		StringSelection path=new StringSelection(A);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		Robot ob=new Robot();
		ob.delay(3000);
		ob.keyPress(KeyEvent.VK_CONTROL);
		ob.keyPress(KeyEvent.VK_V);
		ob.keyRelease(KeyEvent.VK_V);
		ob.keyRelease(KeyEvent.VK_CONTROL);
		ob.keyPress(KeyEvent.VK_ENTER);
		ob.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
