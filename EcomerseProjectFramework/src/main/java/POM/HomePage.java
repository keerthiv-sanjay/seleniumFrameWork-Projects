package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import TestCaseStepDefinitions.BaseClass;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class=\"logout\"]")
	WebElement signoutbtn;

	@FindBy(xpath = "//span[text()='My addresses']")
	WebElement myaddress;

	@FindBy(xpath = "//a[@title=\"Women\"]")
	WebElement womenbtn;

	@FindBy(xpath = "//a[@title=\"Summer Dresses\"]")
	WebElement summerdressbtn;

	@FindBy(xpath = "//div[@class=\"header_user_info\"]/a/span")
	WebElement MyAccount;

	public String pagetitle() {
		String title = driver.getTitle();
		return title;
	}

	public void signOutButton() {
		signoutbtn.click();
	}

	public void address() {
		myaddress.click();
	}

	public void womenbtn() {
		Actions a = new Actions(driver);
		a.moveToElement(womenbtn).perform();
	}

	public void summerdressbtn() {
		summerdressbtn.click();
	}

	public void MyAccount() {
		MyAccount.click();
	}

}
