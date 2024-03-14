package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploading_using_RobotClass
{
	WebDriver driver;
	@BeforeTest
	public void initialize()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void link()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() throws AWTException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		uploadingfile("E:\\Gokul's Phone\\Download");
	}
	public void uploadingfile(String A) throws AWTException
	{
		//to copy the path to the clipboard
		
		StringSelection path=new StringSelection(A);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		//to paste into system window
		
		Robot ob=new Robot();
		ob.delay(6000);
		ob.keyPress(KeyEvent.VK_CONTROL);
		ob.keyPress(KeyEvent.VK_V);
		ob.keyRelease(KeyEvent.VK_V);
		ob.keyRelease(KeyEvent.VK_CONTROL);
		ob.keyPress(KeyEvent.VK_ENTER);
		ob.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
