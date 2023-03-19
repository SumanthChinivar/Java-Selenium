package datadriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSON {
public static void main(String[] args) throws IOException, ParseException {
	File file=new File("./testData/Data.json");
	FileReader fr=new FileReader(file);
	JSONParser parser=new JSONParser();
	JSONObject obj = (JSONObject)parser.parse(fr);
	System.out.println((String)obj.get("name"));
}
}