import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\TestScript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	    Sheet data = wb.getSheet("Sheet1");
		Row r = data.getRow(1);
		Cell c = r.getCell(2);
		java.lang.String meta = c.getStringCellValue();
		System.out.println(meta);
		
		

	}

}
