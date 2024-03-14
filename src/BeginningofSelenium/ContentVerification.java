package BeginningofSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ContentVerification
{

	public static void main(String[] args) 
	{
		ChromeDriver A=new ChromeDriver();
		A.get("https://www.google.com");
		String B=A.getPageSource();
		if(B.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	

	}

}
