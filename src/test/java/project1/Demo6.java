package project1;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo6 {

	public static void main(String[] args) throws Exception {
		Workbook wb = WorkbookFactory.create(new FileInputStream("./data/Book3.xlsx"));
		
		Sheet s = wb.getSheet("Sheet1");
		int rc=s.getLastRowNum();//index of last row
		
		for(int i=0;i<=rc;i++)//handle rows
		{
			try //handle blank row
			{
				int cc=s.getRow(i).getLastCellNum();//count of cells
				for(int j=0;j<cc;j++)//handle cells
				{
					try//handle blank cell
					{
						String v=s.getRow(i).getCell(j).toString();
						System.out.print(v+" ");
					}
					catch (Exception e)
					{
						System.out.print("-- ");
					}
				}
				System.out.println();
			}
			catch (Exception e) 
			{
				System.out.println("-- -- --");
				
			}
		}
		
		wb.close();
	}
}
