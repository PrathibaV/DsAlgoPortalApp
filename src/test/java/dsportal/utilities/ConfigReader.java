package dsportal.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	
	public Properties init_prop() {
		prop= new Properties();
		try {
			FileInputStream inputProp = new FileInputStream("src/test/resources/config/config.properties");
			prop.load(inputProp);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
