package Academy.E2EProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class getNavBar extends base{
	
	@BeforeTest
	public void initialization() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test()
	
	public void BasePageNavigation() throws IOException {

		LandingPage l = new LandingPage(driver);
		AssertJUnit.assertTrue(l.getNavBar().isDisplayed());
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
	

}
