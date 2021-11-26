package com.automationpractice.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	
	public static List<Map<String, String>> getTestDataInMap() {
		
		List<Map<String,String>> testDataAllRows = null;
		
		Map<String,String> testdata = null;
		
		File src = new File("./src/test/resources/TestData/Testdata.xlsx");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);
			int lastRowNumber = sheet.getLastRowNum();
			
			int lastColNumber = sheet.getRow(0).getLastCellNum();
			List list = new ArrayList();
			for(int i =0;i < lastColNumber; i++) {
				Row row = sheet.getRow(0);
				Cell cell = row.getCell(i);
				String rowHeader = cell.getStringCellValue().trim();
				list.add(rowHeader);
			}
			
			testDataAllRows = new ArrayList<Map<String,String>>();
			
			for(int j=1;j<=lastRowNumber;j++) {
				Row row = sheet.getRow(j);
				testdata=new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
				for(int k=0;k<lastColNumber;k++) {
					Cell cell = row.getCell(k);
					String colvalue = cell.getStringCellValue().trim();
					testdata.put((String) list.get(k), colvalue);
				}
				testDataAllRows.add(testdata);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return testDataAllRows;		
		
	}

}
