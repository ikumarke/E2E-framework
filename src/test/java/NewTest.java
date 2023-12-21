import org.testng.annotations.Test;

import baseclasses.baseclass;
import pageobjects.Login;
import pageobjects.Signup;

public class NewTest extends baseclass {
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

	@Test
	public void Login() {
		// TODO Auto-generated method stub
		Login login = new Login(driver);
		login.loginbtn();
		login.loginusername(prop.getProperty("username"));
		login.loginpassword(prop.getProperty("password"));
		login.clicklogin();

	}

}
