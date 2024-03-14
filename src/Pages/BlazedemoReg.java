package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlazedemoReg 
{
	WebDriver driver;
	By name=By.name("name");
	By company=By.id("company");
	By email=By.id("email");
	By pass=By.xpath("//*[@id=\"password\"]");
	By conpass=By.xpath("//*[@id=\"password-confirm\"]");
	By reg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By login=By.xpath("/html/body/div/nav/div/div[2]/ul[2]/li[1]/a");
	By box=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
	By submit=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	public BlazedemoReg(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String N,String C,String E,String P,String CP)
	{
		driver.findElement(name).sendKeys(N);
		driver.findElement(company).sendKeys(C);
		driver.findElement(email).sendKeys(E);
		driver.findElement(pass).sendKeys(P);
		driver.findElement(conpass).sendKeys(CP);
		driver.findElement(reg).click();
		driver.navigate().back();
		driver.findElement(login).click();
	}
	public void login(String E,String P)
	{
		driver.findElement(email).sendKeys(E);
		driver.findElement(pass).sendKeys(P);
		driver.findElement(box).click();
		driver.findElement(submit).click();
	}

}
