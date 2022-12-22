package project1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		//open the xl file
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//goto sheet1->1st row->1st cell
		Sheet s1 = wb.getSheet("Sheet1");
		Row r = s1.getRow(0);
		Cell c = r.getCell(0);
	
		//get the cell value in String format and print it 
		String v=c.getStringCellValue();
		System.out.println(v);
		
		
		
		
		//close the file
		wb.close();
	}

}