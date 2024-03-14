package BeginningofSelenium;
//Title verification


import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprgrm 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String A=driver.getTitle();
		System.out.println(A);
		String B="Google 123";
		if(A.equals(B))
				{
			System.out.println("Pass");
				}
		else
		{
			System.out.println("Fail");
		}
	}

}
