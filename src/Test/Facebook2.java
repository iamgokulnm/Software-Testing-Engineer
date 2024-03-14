package Test;

import org.testng.annotations.Test;

import BasePkg.Base;
import Pages.Facebook;
import UtilityPkg.Excel;

public class Facebook2 extends Base
{
	@Test
	public void testing()
	{
		Facebook ob=new Facebook(driver);
		String file="C:\\Users\\user\\Downloads\\Book1.xlsx";
		String location="Sheet1";
		int rowcount=Excel.getRowCount(file,location);
		for(int i=1;i<=rowcount;i++)
		{
			String user=Excel.getCellvalue(file,location,i,0);
			System.out.println(user);
			String pwrd=Excel.getCellvalue(file, location, i, 1);
			System.out.println(pwrd);
			ob.input(user, pwrd);
			
		}
		
	}
}
