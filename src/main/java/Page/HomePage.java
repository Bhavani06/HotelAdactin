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
public class HomePage extends BaseClass {
	public WebElement BookedItinerary=driver().findElement(By.xpath("//a[contains(text(),'Booked Itinerary')]"));
	public WebElement ChangePassword=driver().findElement(By.linkText("Change Password"));
	public WebElement LogOut=driver().findElement(By.xpath("//a[contains(text(),'Logout')]"));
}
