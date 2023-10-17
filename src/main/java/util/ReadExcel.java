package util;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
	
	public static String readExcelValuesSheets(String excelFileName,String sheetName,int col,int row) throws BiffException, IOException{
		FileInputStream fis=new FileInputStream("D:\\Raghav\\Eclipse\\GmailLogIn\\TestData.xls");
		Workbook workbook=Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet("TestCaseData");
		Cell cell=sheet.getCell(col,row);
		String name=cell.getContents();
		return name;
	}

}
