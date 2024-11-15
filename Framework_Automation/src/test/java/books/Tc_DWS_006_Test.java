package books;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import io.netty.handler.codec.EncoderException;
import lombok.Data;
import objectRepository.HomePage;

public class Tc_DWS_006_Test extends BaseClass {
    


		@Test
       public void clickonComputers()throws EncoderException {
    	   
		 hp = new HomePage(driver);
		 hp.getBooks().click();
		
		Assert.assertEquals(driver.getTitle(),elib.getString@DatapomExcel("computers",1,0), "cmputer page is not displayed");
		test.log(Status.PASS,"compters page is displayed");
       }

		
		
}
