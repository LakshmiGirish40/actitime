package project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book2.xlsx"));
		//existing row & existing cell	
		wb.getSheet("Sheet1").getRow(0).getCell(0).setCellValue("Lakshmi"); // sending the values to row 0 and col0
		//existing row & new cell
		wb.getSheet("Sheet1").getRow(0).createCell(1).setCellValue("Akshara2"); // sending the values to row 0 and col1
		//new row & new cell
		wb.getSheet("Sheet1").createRow(1).createCell(0).setCellValue("Akshara3");
		
		wb.write(new FileOutputStream("./data/Book2.xlsx"));//save as
		
		wb.close();
	}
}