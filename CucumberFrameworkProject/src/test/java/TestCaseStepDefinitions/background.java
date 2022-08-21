package TestCaseStepDefinitions;

import org.openqa.selenium.WebDriver;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class background {
	WebDriver driver=hooks.driver;
	
	@Given("enter URL")
	public void enter_URL() {

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@Given("click the login button")
	public void click_the_login_button() {
		LoginPage lp = new LoginPage(driver);
		lp.loginButton();
	}
	
	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		LoginPage lp = new LoginPage(driver);
		lp.userId("ronaldo@gmail.com");
		lp.passwd("123456789");
	}
	
	@And("click the sign in  button")
	public void click_the_sign_in_button() {
		LoginPage lp = new LoginPage(driver);
		lp.signInButton();
	}

}
