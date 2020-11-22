package Academy.E2EProject;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialization() throws IOException {
		driver=initializeDriver();
		
	}
	
	
	
	@Test(dataProvider="getData")
	
	public void BasePageNavigation(String Username, String Password) throws IOException {
		
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.Login().click();
		LoginPage lp= new LoginPage(driver);
		lp.getEmail().sendKeys("Username");
		lp.getPassword().sendKeys("Password");
		lp.clickLogin().click();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="rahulraj.rox9692@gmail.com";
		data[0][1]="Hello";
		data[1][0]="rahulraj0906@gmail.com";
		data[1][1]="Selenium";
		return data;
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
