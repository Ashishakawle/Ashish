package java;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		   FileInputStream File=new FileInputStream("C:\\Users\\Admin\\Desktop\\ALL be software testing\\SerizeNumber.xlsx");	
		   Sheet sh=WorkbookFactory.create(File).getSheet("Sheet1");
		   int lastRowIndex = sh.getLastRowNum();
		   for (int i = 0; i <= lastRowIndex; i++) {
		   int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
		   for (int j = 0; j <= lastCellIndex; j++)  {
		   String value = sh.getRow(i).getCell(j).getStringCellValue();
		   System.out.print(value+" ");
		 }
		   System.out.println();
		}

	}

}
