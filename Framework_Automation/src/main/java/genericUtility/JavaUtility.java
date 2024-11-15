package genericUtility;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;

import org.openqa.selenium.WebDriver;


public class JavaUtility {
	/**
	 * this method is uesed to generate random numbers within 1000
	 * @return String
	 */
       public void getTimeStamps() {
    	  String TimeStamp=LocalDateTime.now().toString().replace(":", "-");
    	   
       }
       public void MaxmizeWindow(WebDriver driver) {
    	   driver.manage().window().maximize();
       }
       public void ImplicitWait(WebDriver driver) {
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       }
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * this method is uesed to generate random numbers within 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
		
	}
}
