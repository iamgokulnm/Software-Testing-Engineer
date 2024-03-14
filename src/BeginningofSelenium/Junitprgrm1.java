package BeginningofSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitprgrm1 
{
	@Before
	public void open()
	{
		System.out.println("open the browser");
	}
	@Test
	public void test()
	{
		System.out.println("Testing is on progress");

	}
	@After
	public void close()
	{
		System.out.println("close the browser");
	}



}
