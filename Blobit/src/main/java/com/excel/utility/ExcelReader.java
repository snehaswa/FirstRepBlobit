package com.excel.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	XSSFWorkbook wb;
	static XSSFSheet sheet1;

	/*
	 * public ExcelReader(String excelpath) {
	 * 
	 * try { File src= new File(excelpath); FileInputStream fis=new
	 * FileInputStream(src);
	 * 
	 * 
	 * XSSFWorkbook wb=new XSSFWorkbook(fis);
	 * 
	 * //HSSFWorkbook hb XSSFSheet sheet1=wb.getSheetAt(0); } catch (Exception e) {
	 * // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * public String getData(String sheetName,int row,int col) {
	 * sheet1=wb.getSheet(sheetName); String
	 * data=sheet1.getRow(row).getCell(col).getStringCellValue(); return data; }
	 */

	public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
		// Sheet sheet;
		Workbook book = null;

		FileInputStream file = null;
		try {
			file = new FileInputStream(
					"/Users/sneharajkumarswami/git/FirstRepBlobit/Blobit/src/main/java/config/BlobitNew.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			try {
				book = WorkbookFactory.create(file);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet1 = (XSSFSheet) book.getSheet("Sheet1");
		// sheet1=book.getSheet(“Login”);
		Object[][] data = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() +“--------” );
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet1.getLastRowNum(); i++) {
			for (int k = 0; k < sheet1.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet1.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

}
