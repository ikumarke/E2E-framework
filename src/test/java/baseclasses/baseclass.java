package baseclasses;



import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.utlity;

public class baseclass extends utlity {
	@BeforeMethod
	public void Browsersetup() throws IOException {
	driver=driversetup();
	driver.get(prop.getProperty("url"));
		
}
	@AfterMethod
	public void browser_close() {
		driver.quit();
        }
}