/**
 * 
 */
package Steps;

import Page.ChangePasswordPage;
import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class ChangePasswordSteps extends ChangePasswordPage {
	ReusableActions ra= new ReusableActions();
	public void ChangePassword(String currentPswd, String newPswd,String confirmPswd) {
		ra.EnterText(currentPswd, txtCurretPswd);
		ra.EnterText(newPswd, txtNewPswd);
		ra.EnterText(confirmPswd, txtConfirmPswd);
		ra.Clicking(SubmitBtn);
	}
}
