package TestCaseStepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verifyLogoutPage {
	private WebDriver driver = hooks.driver;
	
	@When("click the logout button")
	public void click_the_logout_button() {
		LoginPage lp=new LoginPage(driver);
		String title =lp.pagetitle();
		Assert.assertEquals("My account - My Store",title);
	    lp.signOutButton();
	    
	    
	}

	@Then("verify succesfull logout")
	public void verify_succesfull_logout() {
		LoginPage lp=new LoginPage(driver);
		String title =lp.pagetitle();
		Assert.assertEquals("Login - My Store",title);
	}

}
