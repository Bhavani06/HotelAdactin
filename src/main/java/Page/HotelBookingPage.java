/**
 * 
 */
package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Test.BaseClass;

/**
 * @author Bhavani
 *
 */
public class HotelBookingPage extends BaseClass{
	public WebElement Location=driver().findElement(By.name("location"));
	public WebElement Hotels=driver().findElement(By.name("hotels"));
	public WebElement RoomType=driver().findElement(By.name("room_type"));
	public WebElement NumberOfRooms=driver().findElement(By.name("room_nos"));
	public WebElement txtCheckINDate=driver().findElement(By.name("datepick_in"));
	public WebElement txtCheckOutDate=driver().findElement(By.name("datepick_out"));
	public WebElement AdultsPerRoom=driver().findElement(By.name("adult_room"));
	public WebElement ChildrenPerRoom=driver().findElement(By.name("child_room"));
	public WebElement SearchBtn=driver().findElement(By.name("Submit"));
	//public WebElement ResearchBtn=driver().findElement(By.id("Reset"));		
	public WebElement SelectRdBtn=driver().findElement(By.xpath("(//input[@type='radio'])[1]"));
	public WebElement ContinueBtn=driver().findElement(By.id("continue"));
	//public WebElement CancelBtn=driver().findElement(By.id("cancel"));
	public WebElement txtFirstName=driver().findElement(By.id("first_name"));
	public WebElement txtLastName= driver().findElement(By.id("last_name"));
	public WebElement txtAddress=driver().findElement(By.id("address"));
	public WebElement CardNumber= driver().findElement(By.id("cc_num"));
	public WebElement CardType = driver().findElement(By.id("cc_type"));
	public WebElement ExpiryMonth = driver().findElement(By.id("cc_exp_month"));
	public WebElement ExpiryYear = driver().findElement(By.id("cc_exp_year"));
	public WebElement CvvNumber = driver().findElement(By.id("cc_cvv"));
	public WebElement BookNowBtn = driver().findElement(By.id("book_now"));
	//public WebElement BookingCancelBtn = driver().findElement(By.name("cancel"));
	//public WebElement BookedItineraryBtn=driver().findElement(By.xpath("//a[contains(text(),'Booked Itinerary')]"));
}
