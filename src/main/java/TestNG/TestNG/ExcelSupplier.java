package TestNG.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.hssf.record.chart.DataFormatRecord;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelSupplier {
	
	@DataProvider
	public String[][] getExcelData() throws IOException
	{
		File fis= new File("../TestNG/Excel/LoginExcelData.xlsx");
		System.out.println(fis.exists());
		
	    FileInputStream file= new FileInputStream(fis);
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("UserloginData");
		// count the number of row
	     int noofRows = sheet.getPhysicalNumberOfRows();
	     
	     // count the number of column in row
	     int noofColumn = sheet.getRow(0).getLastCellNum();
		
	     String [] [] data= new String[noofRows-1] [noofColumn];
	     
		for (int i = 0; i <noofRows-1; i++) 
		{
			for (int j = 0; j <noofColumn; j++) 
			{
			//	DataFormatter df= new DataFormatter();
				data[i][j]=sheet.getRow(i+1).getCell(j).getStringCellValue();
						
				
			}
		}
	
		workbook.close();
		file.close();
		
		/*
		 * for(String[] dataerr: data) { System.out.println(Arrays.toString(dataerr));
		 * 
		 * }
		 */
		
		return data;
		
		
		
	}
	
	
	

}
