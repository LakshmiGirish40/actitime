package project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo8 {

	public static void main(String[] args) throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Information.xlsx")); 
		
		CellType ct1 = wb.getSheet("Sheet1").getRow(0).getCell(0).getCellType(); // here getting datatype of string in excel
		System.out.println(ct1);
		
		double v1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getNumericCellValue(); // here getting the value of string in excel
		System.out.println(v1);
		
		String s1= wb.getSheet("Sheet1").getRow(2).getCell(0).toString();  // here getting the value of strin from excel
		System.out.println(s1);
		
		CellType ct2 = wb.getSheet("Sheet1").getRow(3).getCell(2).getCellType(); // here getting what type of value
		System.out.println(ct2);
		
		double v2 = wb.getSheet("Sheet1").getRow(3).getCell(1).getNumericCellValue(); // here getting the  Numeric value of from excel
		System.out.println(v2);
		
		String s2= wb.getSheet("Sheet1").getRow(3).getCell(2).toString(); // here getting the  Numeric value of from excel
		System.out.println(s2);
		
		String s3= wb.getSheet("Sheet1").getRow(3).getCell(2).toString(); // here getting the  Numeric value of from excel without decimals 
		System.out.println(s2);
		System.out.println(s3);

		
		wb.close();
	}
}