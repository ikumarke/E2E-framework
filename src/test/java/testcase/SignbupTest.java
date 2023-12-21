package testcase;

import org.testng.annotations.Test;

import baseclasses.baseclass;
import pageobjects.Signup;

public class SignbupTest extends baseclass {
	
    @Test
	public void signup() throws InterruptedException {
		// TODO Auto-generated method stub
    	Signup signup = new Signup(driver);
    	signup.Click_signup_button();
    	Thread.sleep(3000);
    	signup.enterusername(prop.getProperty("username"));
    	signup.enterpassword(prop.getProperty("password"));
    	signup.entersignupbtn();

	}
	
}
