package actitime.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {
	public String getDataFromProperties(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\selinium\\ActiTimeTestData.properties");
		Properties p=new Properties();
		p.load(fis);
		String value=p.getProperty(key);
		return value;
		
	}

	public String getDataFromExcelSheet(String Sheetnum,int Rownum,int cellnum) throws IOException
	{
		FileInputStream fis= new FileInputStream("E:\\ExcelSheets\\ActitimeTestData.xlsx");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(Sheetnum);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(Rownum).getCell(cellnum));
		return value;
	}
	}
