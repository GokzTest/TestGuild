package com.billingsoftware.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	private static      XSSFWorkbook excelWBook; //Excel WorkBook
    private static      XSSFSheet    excelWSheet; //Excel Sheet
   

    // This method has two parameters: "Test data excel file name" and "Excel sheet name"
    // It creates FileInputStream and set excel file and excel sheet to excelWBook and excelWSheet variables.
public static String getCellData(int RowNum, int ColNum) throws IOException {
      
        // Open the Excel file
    	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
                 + "/testdatas.xlsx");
        excelWBook = new XSSFWorkbook(ExcelFile);
        excelWSheet = excelWBook.getSheetAt(0);
        return excelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue();
    }
public static int getNumericCellData(int RowNum, int ColNum) throws IOException {
    
    // Open the Excel file
	 FileInputStream ExcelFile = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources"
             + "/testdatas.xlsx");
    excelWBook = new XSSFWorkbook(ExcelFile);
    excelWSheet = excelWBook.getSheetAt(0);
    Double d = excelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
    Double newData = new Double(d);
    int value = newData.intValue();
    return value;

}
    //return (int) excelWSheet.getRow(RowNum).getCell(ColNum).getNumericCellValue();
}
