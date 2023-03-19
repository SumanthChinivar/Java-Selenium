package datadriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

public class ToReadDataFromCSV {
	
	public static void main(String[] args) throws IOException {
		//Creation
		FileReader fr=new FileReader("./testData/testData.csv");
		
		//Creation of file object
		CSVReader reader=new CSVReader(fr);
		
		//readMethods
//		List<String[]> allData = reader.readAll();
//		for(String[] sarr:allData)
//		{
//			for(String arr:sarr)
//			{
//				System.out.print(arr+" ");
//			}
//			System.out.println();
//		}
		
		String[] arr=reader.readNext();
		for(String sr:arr)
		{
			System.out.print(sr+" ");
		}
		System.out.println();
		String[] arr1=reader.readNext();
		for(String sr:arr1)
		{
			System.out.print(sr+" ");
		}
	}
}
