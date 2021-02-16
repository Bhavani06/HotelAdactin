/**
 * 
 */
package Test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Steps.LoginSteps;
import Steps.BookedItinerarySteps;
import Steps.HomePageSteps;
import Steps.HotelBookingSteps;

/**
 * @author Bhavani
 *
 */
public class HotelBookingTest extends BaseClass{
	public void HotelBooking(HashMap<String ,String, String, String,String,String ,String, String, String, String, String, String, String, String> hmData) {
		try {
			
		LoginSteps ls=new LoginSteps();
		ls.Login(hmData.get("UserName"), hmData.get("Password"));
		HomePageSteps HomePageSteps = new HomePageSteps();
		HomePageSteps.BookedItinerary();
		HotelBookingSteps hbs=new HotelBookingSteps();
		hbs.HotelBooking(hmData.get("Location","Hotel","FirstName","LastName","Billing Address","CreditCardNo","Credit Card Type","ExpiryMonth","ExpiryYear","CvvNumber"));
		Thread.sleep(20000);
		String sValue = driver().findElement(By.name("order_no")).getAttribute("value");
		Assert.assertTrue(sValue.length()>0,"Checking whether the booking has been made");
		test.log(LogStatus.PASS, "Booking","Booking made succesfully");
		}
			catch(Exception e) {
				e.printStackTrace();
		}
		}
}
