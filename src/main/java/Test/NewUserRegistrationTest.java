/**
 * 
 */
package Test;

import org.testng.annotations.Test;

import Steps.LoginSteps;
import Steps.NewUserRegistrationSteps;

/**
 * @author Bhavani
 *
 */
public class NewUserRegistrationTest extends BaseClass{
@Test
public void NewUserRegistration() {
	try
	{
		test=reports.startTest("Registartion");
		driver().get("http://adactinhotelapp.com/HotelAppBuild2/index.php");
	LoginSteps ls=new LoginSteps();
	ls.Login("BhavaniRV", "ABC123");
	NewUserRegistrationSteps nurs= new NewUserRegistrationSteps();
	nurs.NewUserRegistration("ABDEF", "ABC222", "ABC222", "ABDEFG", "ABD@123.com");
	reports.endTest(test);

	}
		catch(Exception e) {
			e.printStackTrace();
	}
}
}
