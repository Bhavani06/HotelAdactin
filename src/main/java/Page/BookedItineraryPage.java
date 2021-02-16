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
public class BookedItineraryPage extends BaseClass{
public WebElement txtSearchOrder=driver().findElement(By.name("order_id_text"));
public WebElement GoBtn=driver().findElement(By.name("search_hotel_id"));
public WebElement RadioBtn=driver().findElement(By.name("ids[]"));
public WebElement SearchHotelBtn=driver().findElement(By.name("search_hotel"));
public WebElement LogOutBtn=driver().findElement(By.name("logout"));
public WebElement SelectAllRadioBtn=driver().findElement(By.name("cancelall"));
public WebElement LogBackLnk=driver().findElement(By.cssSelector("a"));
}
