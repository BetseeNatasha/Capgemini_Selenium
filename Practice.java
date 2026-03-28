package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.testng.annotations.Test;

public class Practice {
	@Test
	public void readData() throws Exception {
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHRM_Common Data/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("browser");
		String ValidUserName = prop.getProperty("username");
		String ValidPassword = prop.getProperty("password");
		//write
		FileOutputStream fos = new FileOutputStream("./src/test/resources/OrangeHRM_Common Data/commondata.properties");
		prop.setProperty("CandidateName", "Thomas");
		prop.store(fos, null);
		
		
	}
}