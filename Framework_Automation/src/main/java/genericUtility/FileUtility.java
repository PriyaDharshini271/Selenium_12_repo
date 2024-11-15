package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * @author Mathi
 */

public class FileUtility {
       public String getDataProperty(String key) throws Throwable
       {
    	   FileInputStream fis=new FileInputStream("./src/test/resourse/TestData/commonData.properties");
    	   Properties prop=new Properties();
    	   prop.load(fis);
    	   return prop.getProperty(key);
       }

	public String properties(String string) {
		
		return null;
	}

	


	

	
}
