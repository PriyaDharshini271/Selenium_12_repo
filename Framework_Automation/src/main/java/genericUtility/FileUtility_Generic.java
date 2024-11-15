package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Mathi
 */
public class FileUtility_Generic {
	/**
	 * This Method is Used to Get data from property file
	 * This Method takes parameter and returns value
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String Key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
	}

}
