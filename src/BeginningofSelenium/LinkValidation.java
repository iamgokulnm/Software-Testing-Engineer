package BeginningofSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkValidation 
{
	private static final String HttpURLConnection = null;
	ChromeDriver driver;
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		String link="https://www.facebook.com";
		driver.get(link);
	}
	@Test
	public void test() throws Exception
	{
		String link = "https://www.facebook.com";
		URL ob=new URL(link);
		HttpsURLConnection connection=(HttpsURLConnection)ob.openConnection();
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

}
 