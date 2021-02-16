/**
 * 
 */
package Steps;

import Page.NewUserRegistrationPage;
import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class NewUserRegistrationSteps extends NewUserRegistrationPage {
	ReusableActions ra= new ReusableActions();
	public void NewUserRegistration(String userName,String passWord,String confirmPswd,String fullName,String Email) {
		ra.EnterText(userName, txtFullName);
		ra.EnterText(passWord, txtPassword);
		ra.EnterText(confirmPswd, txtConfirmPswd);
		ra.EnterText(fullName, txtFullName);
		ra.EnterText(Email, txtEmailAddress);
		ra.Clicking(TermsRadioBtn);
		ra.Clicking(TermsLink);
		ra.Clicking(RegisterBtn);
}
}