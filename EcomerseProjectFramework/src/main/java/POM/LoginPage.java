package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class=\"login\"]")
	WebElement loginbutton;

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement id;

	@FindBy(xpath = "//input[@id=\"passwd\"]")
	WebElement passwd;

	@FindBy(xpath = "//i[@class=\"icon-lock left\"]")
	WebElement signinbtn;

	public void loginButton() {
		loginbutton.click();
	}

	public void userId(String userid) {
		id.sendKeys(userid);
	}

	public void passwd(String Passwd) {
		passwd.sendKeys(Passwd);
	}

	public void signInButton() {
		signinbtn.click();
	}

	public String pagetitle() {
		String title = driver.getTitle();
		return title;
	}

}
