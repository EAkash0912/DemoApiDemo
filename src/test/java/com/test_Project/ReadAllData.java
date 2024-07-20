package com.test_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\\\Users\\\\hp\\\\Documents\\\\Book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("Sheet1");
		
		int physicalNumberOfRows = s.getPhysicalNumberOfRows();
		
		for (int i = 0; i < physicalNumberOfRows; i++) {
			
			Row row = s.getRow(i);
			
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < physicalNumberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					
					String cellValue = cell.getStringCellValue();
					
					System.out.println(cellValue);
					
				}
				
				else if(cellType.equals(cellType.NUMERIC)) {
					
					double numericCellValue = cell.getNumericCellValue();
					
					System.out.println(numericCellValue);
					
				} 				
				
			}		
			
		}	
		
	}	

}
