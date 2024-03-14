package UtilityPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenAssignmentExcel 
{
	public static String values(String path,String sheet,int row,int cell)
	{
		try
		{
			File F=new File(path);
			FileInputStream fi=new FileInputStream(F);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell data=(XSSFCell) wb.getSheet(sheet).getRow(row).getCell(cell);
			if(data.getCellType()==CellType.STRING)
			{
				return data.getStringCellValue();
			}
			else
			{
				return data.getRawValue();
			}
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int details(String path,String sheet)
	{
		try
		{
			File F=new File(path);
			FileInputStream fi=new FileInputStream(F);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			return 0;
		}
	}

}
