package BeginningofSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitle 
{

	public static void main(String[] args) 
	{
		ChromeDriver A=new ChromeDriver();
		A.get("https://www.facebook.com");
		String actualtitle=A.getTitle();
		System.out.println(actualtitle);
		String createdtitle="facebook";
		if(actualtitle.equals(createdtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			
	}

}
