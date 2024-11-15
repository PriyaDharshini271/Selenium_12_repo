package genericUtility;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;


public class BaseClass {
	public ExtentTest test;
	public ExtentReports extReport;
	public WebDriver driver;
	public  WebDriver sdriver;
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
	public FileUtility futil=new FileUtility();
	public ExcelUtility eutil=new ExcelUtility();

	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;

	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Report_"+jutil.getSystemTime()+".html");
		extReport=new ExtentReports();
		extReport.attachReporter(spark);
	}
	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();	
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();	
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		sdriver=driver;
		wutil.maximizeWindow(driver);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(futil.properties("url"));
		}
	@BeforeMethod
	public void login() throws IOException {
		wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(futil.properties("email"));
		lp.getPasswordTextField().sendKeys((futil).properties("password"));
		lp.getLoginButton().click();
		
	}
	@AfterMethod
	public void logout() {
		hp=new HomePage(driver);
	    hp.getLogoutLink().click();
	}
	@AfterSuite
	public void reportBackup() {
		extReport.flush();
	}

       
       
       
}   
