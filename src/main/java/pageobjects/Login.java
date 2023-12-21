package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	public  Login(WebDriver driver) {
		// TODO Auto-generated method stub
this.driver=driver;
PageFactory.initElements(driver, this);

	}
	@FindBy(id="login2")
	WebElement clogin;
	
	
	@FindBy(id="loginusername")
	WebElement loginname;
	
	@FindBy(id="loginpassword")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[@onclick='logIn()']")
	WebElement clicklogin;
	
	
	public void loginusername(CharSequence username) {
		// TODO Auto-generated method stub
loginname.sendKeys(username);

	}
	public void loginpassword(CharSequence logpassword) {
		// TODO Auto-generated method stub
loginpassword.sendKeys(logpassword);
	}
	public void clicklogin() {
		// TODO Auto-generated method stub
clicklogin.click();
	}
	public void loginbtn() {
		// TODO Auto-generated method stub
clogin.click();
	}

}
