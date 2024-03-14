package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePkg.DataDrivenAssignment;
import Pages.DataDrivenAssignmentPage;
import UtilityPkg.DataDrivenAssignmentExcel;

public class DataDrivenAssignmentTest extends DataDrivenAssignment
{
	WebDriver driver;
	@Test
	public void testing()
	{
		DataDrivenAssignmentPage ob=new DataDrivenAssignmentPage(driver);
		String path="C:\\Users\\user\\Documents\\A.xlsx";
		String sheet="Sheet1";
		int count=DataDrivenAssignmentExcel.details(path, sheet);
		for(int i=1;i<=count;i++)
		{
			String username=DataDrivenAssignmentExcel.values(path, sheet, i, 0);
			System.out.println(username);
			String Password=DataDrivenAssignmentExcel.values(path, sheet, i, 1);
			System.out.println(Password);
			ob.input(username, Password);
			
		}
	}
	

}
