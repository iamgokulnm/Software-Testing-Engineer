package TestNG;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class DataDrivenTest
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
		File a=new File("C:\\Users\\user\\Downloads\\Book1.xlsx");
		FileInputStream b=new FileInputStream(a);
		XSSFWorkbook ob=new XSSFWorkbook(b);
		XSSFSheet obj=ob.getSheet("Sheet1");
		System.out.println(obj.getLastRowNum());
		
		for(int i=1;i<=obj.getLastRowNum();i++)
		{
			String username=obj.getRow(i).getCell(0).getStringCellValue();
			String password=obj.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div/div[4]/span[2]/a")).click();
			String A=driver.getTitle();
			if(A.equalsIgnoreCase("Login"))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}
