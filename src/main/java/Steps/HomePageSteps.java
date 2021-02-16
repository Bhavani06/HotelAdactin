/**
 * 
 */
package Steps;

import com.relevantcodes.extentreports.LogStatus;

import Page.HomePage;
import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class HomePageSteps extends HomePage{
	ReusableActions ra= new ReusableActions();
	
	public void BookedItinerary() {
		ra.Clicking(BookedItinerary);
	}
	public void ChangePassword() {
		ra.Clicking(ChangePassword);
		
}
	public void LogOut() {
		ra.Clicking(LogOut);
		test.log(LogStatus.PASS, "Logout Completed","Logged Out Successfully");
	}
}
