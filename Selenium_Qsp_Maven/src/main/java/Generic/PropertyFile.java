package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
	
	public String readPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/data/SsPropertyData.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}

}
