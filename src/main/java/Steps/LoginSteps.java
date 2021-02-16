/**
 * 
 */
package Steps;

import com.relevantcodes.extentreports.LogStatus;

import Page.LoginPage;
import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class LoginSteps extends LoginPage{
	ReusableActions ra= new ReusableActions();
public void Login(String sUserName,String sPassword) {
	ra.EnterText(sUserName,txtUserName );
	ra.EnterText(sPassword,txtPassword);
	ra.Clicking(LoginBtn);
	test.log(LogStatus.INFO, "Login Completed");
	
}
}
