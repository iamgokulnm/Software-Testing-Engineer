package BeginningofSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookContent
{

	public static void main(String[] args) 
	{
		ChromeDriver ob=new ChromeDriver();
		ob.get("https://www.facebook.com");
		String contents=ob.getPageSource();
		if(contents.contains("Create new account"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
