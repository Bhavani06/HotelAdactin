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
public class LoginPage extends BaseClass{
public WebElement txtUserName=driver().findElement(By.id("username"));
public WebElement txtPassword=driver().findElement(By.id("password"));
public WebElement LoginBtn=driver().findElement(By.id("login"));
public WebElement ForgotPswdBtn=driver().findElement(By.linkText("Forgot Password?"));
public WebElement NewUserRgstLink=driver().findElement(By.linkText("New User Register Here"));
}

