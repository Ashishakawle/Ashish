package parameterisation_new;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path ="C:\\Users\\admin\\Downloads\\19Febdata.xlsx";
		
		FileInputStream file=new FileInputStream(path);
	//String data	= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	        
	 //      System.out.println(data);
	       
	      String data2	= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	       System.out.println(data2);
	}
}
