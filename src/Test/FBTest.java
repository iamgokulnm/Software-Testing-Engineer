package Test;

import org.testng.annotations.Test;

import BasePkg.Baseclass;
import Pages.Fb;
import UtilityPkg.Excelpage;

public class FBTest extends Baseclass
{
	@Test
	public void testing()
	{
		Fb ob=new Fb(driver);
		String file="C:\\Users\\user\\Downloads\\Book1.xlsx";
		String sheet="Sheet1";
		int rowCount=Excelpage.getRowCount(file, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String username=Excelpage.getCellValue(file, sheet, i, 0);
			System.out.println(username);
			String pwrd=Excelpage.getCellValue(file, sheet, i, 1);
			System.out.println(pwrd);
			ob.setvalues(username, pwrd);
			ob.login();
		}
		
	}

}
