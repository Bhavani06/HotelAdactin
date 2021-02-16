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
public class NewUserRegistrationPage extends BaseClass{
	public WebElement txtUserName=driver().findElement(By.xpath("//input[@name='username']"));
	public WebElement txtPassword=driver().findElement(By.xpath("//input[@name='password']"));
	public WebElement txtConfirmPswd=driver().findElement(By.xpath("//input[@name='re_password']"));
	public WebElement txtFullName=driver().findElement(By.xpath("//input[@name='full_name']"));
	public WebElement txtEmailAddress=driver().findElement(By.xpath("//input[@name='email_add']"));
	public WebElement TermsRadioBtn=driver().findElement(By.xpath("//input[@name='tnc_box']"));
	public WebElement TermsLink=driver().findElement(By.linkText("Terms & Conditions"));
	public WebElement RegisterBtn=driver().findElement(By.xpath("//input[@name='Submit']"));
	public WebElement ResetBtn=driver().findElement(By.xpath("//input[@name='rest']"));
}
