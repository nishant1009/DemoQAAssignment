package com.demoqa.utlilities;

import java.io.File;

import jxl.Workbook;

public class ReadXls {
	
	public static String readXlsValue(int col,int row)
	{
		String Colvalue=null;
	try
	{
	File src=new File(System.getProperty("user.dir"+"src/test/resources/TestData/TestData.xls"));
	Workbook wb=Workbook.getWorkbook(src);
	Colvalue=wb.getSheet("Data").getCell(col, row).getContents();
	
	}catch(Exception e)
	{
		System.out.println(e);
		
	}
	return Colvalue;
	
	}
	

}
