package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDrivernTest2
{
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException
	{
		File A=new File("C:\\Users\\user\\Downloads\\Book1.xlsx");
		FileInputStream b=new FileInputStream(A);
		XSSFWorkbook ob=new XSSFWorkbook(b);
		XSSFSheet obj=ob.getSheet("Sheet1");
		for(int i=1;i<=obj.getLastRowNum();i++)
		{
			String user=obj.getRow(i).getCell(0).getStringCellValue();
			System.out.println(user);
			String pass=obj.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pass);
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(user);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(pass);
			driver.findElement(By.name("login")).click();
			
		}
	}

}
