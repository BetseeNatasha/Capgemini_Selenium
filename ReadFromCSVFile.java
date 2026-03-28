package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;

public class ReadFromCSVFile {
@Test
public void readCsv() throws IOException {
	String line="";
	BufferedReader br=new BufferedReader(new FileReader("./src/test/resources/OrangeHRM_Common Data/sample.csv"));
	while((line=br.readLine())!=null) {
		String data[]=line.split(",");
		String key=data[0];
		String value=data[1];
		System.out.print(key);
		System.out.println(" "+value);
		
		
	}
}
}
