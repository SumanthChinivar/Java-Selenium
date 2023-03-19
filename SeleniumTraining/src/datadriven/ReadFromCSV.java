package datadriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;


public class ReadFromCSV {
	public static void main(String[] args) throws IOException {
		File file=new File("./TestData/Data.csv");
		FileReader fr=new FileReader(file);
		CSVReader reader=new CSVReader(fr);
		String[] str=reader.readNext();
		for(String st:str)
		{
			System.out.println(st);
		}
	}
}
