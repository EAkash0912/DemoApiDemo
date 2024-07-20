package com.test_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\hp\\Documents\\Book2.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(fis);
		
		w.createSheet("Data").createRow(0).createCell(0).setCellValue("UserName");
		w.getSheet("Data").getRow(0).createCell(1).setCellValue("Password");
		w.getSheet("Data").createRow(1).createCell(0).setCellValue("Dhruv");
		w.getSheet("Data").getRow(1).createCell(1).setCellValue("e85f5");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		w.write(fos);
		System.out.println("Passed");		
		
	}	

}
