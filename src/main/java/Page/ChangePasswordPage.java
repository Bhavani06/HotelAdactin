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
public class ChangePasswordPage extends BaseClass {
public WebElement txtCurretPswd=driver().findElement(By.xpath("//input[@name='current_pass']"));
public WebElement txtNewPswd=driver().findElement(By.xpath("//input[@name='new_password']"));
public WebElement txtConfirmPswd=driver().findElement(By.xpath("//input[@name='re_password']"));
public WebElement SubmitBtn=driver().findElement(By.xpath("//input[@name='change_password_Submit']"));
}
