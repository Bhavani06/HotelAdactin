package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest test;
	//@BeforeSuite
	public static void initdriver(){
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");  
			driver = new ChromeDriver();
		}
		//			System.out.println(System.getProperty("user.dir")+"\\ExtentReport.html");
		reports=new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport.html");
		//  test=reports.startTest("mvnRepo"); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	public static WebDriver driver() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe");  
			driver = new ChromeDriver();

			driver().get("http://adactinhotelapp.com/");
			driver.manage().window().maximize();
			initdriver();
		}

		return driver;
	}
	public void closeAllBrowsers() {

		reports.endTest(test);
		driver.close();
	}
	@AfterSuite
	public void flushReports() {
		reports.flush();
	}

}



