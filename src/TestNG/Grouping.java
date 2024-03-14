package TestNG;

import org.testng.annotations.Test;

public class Grouping 
{
	@Test(groups= {"sanity"})
	public void main1()
	{
		System.out.println("test 1");
	}
	@Test(groups= {"smoke","sanity"})
	public void main2()
	{
		System.out.println("test 2");
	}
	@Test(groups= {"regression"})
	public void main3()
	{
		System.out.println("test 3");
	}

}
