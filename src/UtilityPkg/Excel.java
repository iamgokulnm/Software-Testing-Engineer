package UtilityPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	public static String getCellvalue(String file,String location,int r,int c)
	{
		try
		{
		File f=new File(file);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFCell cell=(XSSFCell)wb.getSheet(location).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else
		{
			return cell.getRawValue();
		}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getRowCount(String file,String location)
	{
		try
		{
			File f=new File(file);
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(location).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}
