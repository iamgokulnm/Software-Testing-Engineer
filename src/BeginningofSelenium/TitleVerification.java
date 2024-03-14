package BeginningofSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		String Newtitle="facebook";
		if(Title.equals(Newtitle))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
