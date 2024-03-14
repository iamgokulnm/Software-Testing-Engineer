package UtilityPkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelpage
{
	public static String getCellValue(String file,String sheet,int r,int c)
	{
		try
		{
			File F=new File(file);
			FileInputStream fi=new FileInputStream(F);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFCell cell=(XSSFCell) wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				//double v=cell.getNumericCellValue();
				//int val=(int)v;
				//return String.valueOf(val);
				return cell.getRawValue();
			}
		}
		catch (Exception e)
		{
			return "";
			
		}
	}
	public static int getRowCount (String file,String sheet)
	{
		try
		{
			File F=new File(file);
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
