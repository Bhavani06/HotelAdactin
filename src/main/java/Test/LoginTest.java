/**
 * 
 */
package Test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Steps.LoginSteps;

/**
 * @author Bhavani
 *
 */
public class LoginTest extends BaseClass{
	@Test
	public void Login() {
		LoginSteps ls=new LoginSteps();
		//System.out.println("hi");
		test=reports.startTest("LoginTest");
	//driver().get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
		ls.Login("AdacUser5", "ABC123");
		driver().findElement(By.xpath("//*[text()='Logout']")).click();
		reports.endTest(test);
		//closeAllBrowsers();
		//HomePageSteps hps=new HomePageSteps();
	//hps.LogOut();
	
}
}
