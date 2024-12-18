package com.generalUtilities;

import org.testng.annotations.Test;

import com.elementRepository.LoginPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	XSSFSheet sheet;
	
	public String ReadStringData(int i,int j )throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Excel ReadFile.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		sheet =book.getSheet("Sheet1");
		
			
		Row row = sheet.getRow(i);
		Cell cell = row.getCell(j);
		return cell.getStringCellValue();
		}
	}


