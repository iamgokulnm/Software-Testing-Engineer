package BeginningofSelenium;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinkValidation<HttpURLConnection>
{
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		String data="https://www.google.com";
		driver.get(data);
	}
	@Test
	public void validation()
	{
		  List<WebElement> list = driver.findElements(By.tagName("a"));
		 for(WebElement S:list)
		 {
			 String link=S.getAttribute("href");
			 verify(link);
		 }
	}
	public void verify(String link)
	{
		try
		{
			String data="https://www.google.com";
			URL ob=new URL(data);
			HttpsURLConnection connection=(HttpsURLConnection)ob.openConnection();
			connection.connect();
			if(connection.getResponseCode()==200)
			{
				System.out.println("valid link");
			}
			else if(connection.getResponseCode()==404)
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
