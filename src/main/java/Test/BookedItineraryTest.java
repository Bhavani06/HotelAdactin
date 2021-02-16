/**
 * 
 */
package Test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Steps.BookedItinerarySteps;
import Steps.HomePageSteps;
import Steps.LoginSteps;

/**
 * @author Bhavani
 *
 */
public class BookedItineraryTest extends BaseClass{

public void BookedItinerary(HashMap<String, String> hmData) {
	try {
		
	LoginSteps ls=new LoginSteps();
	ls.Login(hmData.get("UserName"), hmData.get("Password"));
	HomePageSteps HomePageSteps = new HomePageSteps();
	HomePageSteps.BookedItinerary();
	BookedItinerarySteps bis=new BookedItinerarySteps();
	bis.BookedItinerary(hmData.get("SearchOrderId"));
	Thread.sleep(20000);
	String sValue = driver().findElement(By.xpath("(((//form[@id='booked_form']/table/tbody//tbody)[2]/tr)[2]/td)[2]/input")).getAttribute("value");
	Assert.assertTrue(sValue.length()>0,hmData.get("SearchOrderId"));
	test.log(LogStatus.PASS, "Search Booking","Order No has been searched succesfully");
	}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
