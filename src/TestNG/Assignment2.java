package TestNG;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment2
{
		ChromeDriver driver;;
		@BeforeTest
		public void open()
		{
		    driver=new ChromeDriver();
			driver.get("https://rishiherbalindia.linker.store/");
			driver.manage().window().maximize();
		}
		@Test
		public void test1() throws Exception 
		{
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
			driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("iamgokul88@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Gokul@1996");
			driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary v2']")).click();
			driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input"));
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Gokul@1996");
			driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
			Thread.sleep(6000);
			driver.findElement(By.name("query")).sendKeys("HERBAL AGRO GROWTH BOOSTER",Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
			driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
			driver.navigate().back();
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/h4/a")).click();
			driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
			Thread.sleep(1000);
			JavascriptExecutor objj=(JavascriptExecutor)driver;
			objj.executeScript("window.scrollBy(0,2400)","");
			driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
		}
			@Test
			public void screencapture() throws Exception
			{
			    WebElement screenshot=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
			    File photo = screenshot.getScreenshotAs(OutputType.FILE);
			    FileHandler.copy(photo,new File("./image//Newimage22.png"));
			}
			@Test
			public void link() throws Exception
			{
				String data="https://rishiherbalindia.linker.store/";
				driver.get(data);
				URL obje=new URL(data);
				HttpURLConnection Check=(HttpURLConnection)obje.openConnection();
				Check.connect();
				if(Check.getResponseCode()==200)
				{
					System.out.println("Valid link");
				}
				else
				{
					System.out.println("Invalid link");
				}
			}
}

