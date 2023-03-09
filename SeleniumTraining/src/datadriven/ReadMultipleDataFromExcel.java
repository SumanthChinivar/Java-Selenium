package datadriven;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File file=new File("C:\\Users\\vms16\\eclipse-workspace\\SeleniumTraining\\testData\\testData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet agodaSheet = workbook.getSheet("Agoda");
		int rowNum=agodaSheet.getPhysicalNumberOfRows();
		int colNum=agodaSheet.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=0;i<rowNum-1;i++) {
			for(int j=0;j<colNum;j++) {
				data[i][j]=agodaSheet.getRow(i+1).getCell(j).toString();
				System.out.print(data[i][j]);
			}
			System.out.println();
		}
	}
}
