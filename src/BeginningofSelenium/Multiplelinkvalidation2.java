package BeginningofSelenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinkvalidation2 
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		for(WebElement S:list)
		{
			String data=S.getAttribute("href");
			verify(data);
		}
	}
	public void verify(String data)
	{
		try
		{
			URL ob=new URL("https://www.google.com");
			HttpURLConnection li=(HttpURLConnection)ob.openConnection();
			li.connect();
			if(li.getResponseCode()==200)
			{
				System.out.println("pass");
			}
			else if(li.getResponseCode()==404)
			{
				System.out.println("broken link");
			}
		}
		    catch(Exception e)
		    {
		    	System.out.println(e.getMessage());
		    }
		}
	}


