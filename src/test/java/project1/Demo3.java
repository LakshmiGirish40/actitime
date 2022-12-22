package project1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		//open the xl file
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book1.xlsx"));
		
		//goto sheet1->1st row->1st cell->get the value
		String v=wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		//String v1=wb.getSheet("Sheet1").getRow(0).getCell(1).toString(); // getting the values from row 0 and col1 (123)
		System.out.println(v);
		//System.out.println(v1); //here the values will print in double
		
		//close the file
		wb.close();
	}

}