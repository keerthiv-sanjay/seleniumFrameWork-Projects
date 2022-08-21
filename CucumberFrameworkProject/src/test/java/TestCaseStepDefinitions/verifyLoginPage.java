package TestCaseStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import POM.LoginPage;
import io.cucumber.java.en.Then;

public class verifyLoginPage {

	private WebDriver driver = hooks.driver;
		
	
	@Then("Check the page title")
	public void check_the_page_title() {
		LoginPage lp = new LoginPage(driver);
		String title = lp.pagetitle();
		Assert.assertEquals("My account - My Store", title);
		
	}
	

}
