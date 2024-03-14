package Test;

import org.testng.annotations.Test;

import BasePkg.DataDrivenBaseclass;
import Pages.DataDrivenPage;
import UtilityPkg.DataDrivenExcel;

public class DatDrivenTest extends DataDrivenBaseclass
{
	@Test
	public void testing()
	{
		DataDrivenPage ob=new DataDrivenPage(driver);
		String path="C:\\Users\\user\\Documents\\datadriven.xlsx";
		String sheet="Sheet1";
		int count=DataDrivenExcel.rowcount(path, sheet);
		for(int i = 1;i<=count;i++)
		{
			String username=DataDrivenExcel.input(path, sheet, i, 0);
			System.out.println(username);
			String passwrd=DataDrivenExcel.input(path, sheet, i,1);
			System.out.println(passwrd);
			ob.setvalues(username, passwrd);
			
			
		}
	}

}
