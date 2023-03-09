package utilityMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	/**
	 * This method is used to read all the data from a given excel sheet
	 * @param path-Provide the path of the file
	 * @param filename-Enter the name of the file
	 * @return The method return date and time in @LocalDateTime format
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static String[][] readAllData(String path,String filename) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		int rowNum=sname.getPhysicalNumberOfRows();
		int colNum=sname.getRow(0).getPhysicalNumberOfCells();
		
		String[][] data=new String[rowNum-1][colNum];
		
		for(int i=0;i<rowNum-1;i++) {
			for(int j=0;j<colNum;j++) {
				data[i][j]=sname.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
	}
	
	/**
	 * This method is used to read date and Time from a particular cell
	 * @param path-This parameter holds particular path for a file
	 * @param filename-This is used to hold filename parameter for a file
	 * @param sheet-This parameter holds the sheet name for a particular excel file
	 * @param rowNum-Provide the row number from where the file needs to be readed
	 * @param cellNum-Provide the cell number from where the file needs to be readed
	 * @return -This method returns date in @LocalDateTime format
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static LocalDateTime readDateAndTime(String path,String filename,String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		LocalDateTime dateAndTime=sname.getRow(rowNum).getCell(cellNum).getLocalDateTimeCellValue();
		return dateAndTime;
	}
	
	/**
	 * 
	 * @param path-This parameter holds particular path for a file
	 * @param filename-This is used to hold filename parameter for a file
	 * @param sheet-This parameter holds the sheet name for a particular excel file
	 * @param rowNum-Provide the row number from where the file needs to be readed
	 * @param cellNum-Provide the cell number from where the file needs to be readed
	 * @return- This method returns double value from a particular cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static double readNumericValueFromACell(String path,String filename,String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		double data=sname.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
		return data;
	}
	
	/**
	 * 
	 * @param path-This parameter holds particular path for a file
	 * @param filename-This is used to hold filename parameter for a file
	 * @param sheet-This parameter holds the sheet name for a particular excel file
	 * @param startRow-Enter the starting row number
	 * @param endRow-Enter the ending row number
	 * @param cellNum-Enter the column value via a cell number
	 * @return-This method returns an array of integer values from a particular column
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int[] readAllValuesFromAColumn(String path,String filename,String sheet,int startRow,int endRow,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		int k=0;
		int arr[]=new int[endRow];
		for(int i=startRow;i<=endRow;i++)
		{
			arr[k++]=(int)sname.getRow(i).getCell(cellNum).getNumericCellValue();
		}
		return arr;
	}
	
	/**
	 * 
	 * @param path-This parameter holds particular path for a file
	 * @param filename-This is used to hold filename parameter for a file
	 * @param sheet-This parameter holds the sheet name for a particular excel file
	 * @param rowNum-Provide the row number from where the file needs to be readed
	 * @param cellNum-Provide the cell number from where the file needs to be readed
	 * @return- This method returns boolean value from a particular cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static boolean readBooleanValueFromACell(String path,String filename,String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		boolean data=sname.getRow(rowNum).getCell(cellNum).getBooleanCellValue();
		
		return data;
	}
	
	/**
	 * 
	 * @param path-This parameter holds particular path for a file
	 * @param filename-This is used to hold filename parameter for a file
	 * @param sheet-This parameter holds the sheet name for a particular excel file
	 * @param rowNum-Provide the row number from where the file needs to be readed
	 * @param cellNum-Provide the cell number from where the file needs to be readed
	 * @return- This method returns long value from a particular cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static long readLongValueFromACell(String path,String filename,String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		long data=(long)sname.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
		return data;
	}
	
	/**
	 * 
	 * @param path-This parameter holds particular path for a file
	 * @param filename-This is used to hold filename parameter for a file
	 * @param sheet-This parameter holds the sheet name for a particular excel file
	 * @param rowNum-Provide the row number from where the file needs to be readed
	 * @param cellNum-Provide the cell number from where the file needs to be readed
	 * @return- This method returns int value from a particular cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public static int readIntValueFromACell(String path,String filename,String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		int data=(int)sname.getRow(rowNum).getCell(cellNum).getNumericCellValue();
		
		return data;
	}
	
	public static String readStringValueFromACell(String path,String filename,String sheet,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		File file=new File(path+filename);
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sname = workbook.getSheet("sheetName");
		String data=sname.getRow(rowNum).getCell(cellNum).toString();
		
		return data;
	}
}
