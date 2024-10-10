package Automate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\TestScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("Pass");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\TestScript.xlsx");
		wb.write(fos);
		

	}

}
