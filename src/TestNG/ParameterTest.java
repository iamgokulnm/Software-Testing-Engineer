package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest
{
	@Parameters("a")
	@Test
	public void main(String A)
	{
		System.out.println("the name is :" + A);
	}

}
