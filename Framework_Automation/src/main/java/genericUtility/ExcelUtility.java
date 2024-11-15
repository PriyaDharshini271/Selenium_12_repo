package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * This method is used to read String data from excel
	 * User must pass sheetName,RowIndex,ColumnIndex
	 * @param SheetName
	 * @param RowIndex
	 * @param ColumnIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String SheetName, int RowIndex, int ColumnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Excel.xlsx");
		 Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(SheetName).getRow(RowIndex).getCell(ColumnIndex).getStringCellValue();
		
	}
	

}
