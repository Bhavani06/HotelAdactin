/**
 * 
 */
package Test;

import org.testng.annotations.Test;

import Steps.ChangePasswordSteps;
import Steps.LoginSteps;

/**
 * @author Bhavani
 *
 */
public class ChangePasswordTest extends BaseClass{
	@Test
	public void ChangePassword() {
		try {
			test=reports.startTest("ChangePassword");
			driver().get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
			LoginSteps ls=new LoginSteps();
			ls.Login("BhavaniRV", "ABC123");
			ChangePasswordSteps cps=new ChangePasswordSteps();
			cps.ChangePassword("ABC123", "ABC111", "ABC111");
			reports.endTest(test);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
