package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
public WebDriver driver;

	public Signup(WebDriver driver) {
		// TODO Auto-generated constructor stub
this.driver=driver;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin2")
	WebElement signupbutton;
	
	@FindBy(id="sign-username")
	WebElement signusername;
	
	
	@FindBy(id="sign-password")
	WebElement signpassword;
	
	@FindBy(xpath="//button[@onclick=\"register()\"]")
	WebElement signupenterbiutton;
	
	public void Click_signup_button() {
		// TODO Auto-generated method stub
		signupbutton.click();

	}
	public void enterusername(String username) {
		// TODO Auto-generated method stub
signusername.sendKeys(username);
	}
	public void enterpassword(String password) {
		// TODO Auto-generated method stub
signpassword.sendKeys(password);
	}
	public void entersignupbtn() {
		// TODO Auto-generated method stub
signupenterbiutton.click();
	}

}
