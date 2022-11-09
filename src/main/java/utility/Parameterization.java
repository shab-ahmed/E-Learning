package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {

	public static String parameterization(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream a= new FileInputStream("D:\\Java Projects\\KhanAcademy\\src\\test\\resources\\khanAcademyData.xlsx");
		String testData= WorkbookFactory.create(a).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return testData;
	}
}
