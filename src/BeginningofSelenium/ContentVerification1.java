package BeginningofSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVerification1 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String content=driver.getPageSource();
		if(content.contains("create new account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
