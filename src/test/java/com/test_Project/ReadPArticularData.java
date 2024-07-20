package com.test_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPArticularData {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\hp\\Documents\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("Sheet1");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		
		CellType ct = c.getCellType();
		
		if (ct.equals(ct.STRING)) {
			
			String stringCellValue = c.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		
		else if (ct.equals(ct.NUMERIC)) {
			
			double numericCellValue = c.getNumericCellValue();
			int in = (int)numericCellValue;
			System.out.println(in);
			
		}
		
		
	}
	

}
