package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title=\"Orders\"]/span")
	WebElement orderhistory;

	@FindBy(xpath = "//a[@title=\"Credit slips\"]/span")
	WebElement creditslips;

	@FindBy(xpath = "//a[@title=\"Addresses\"]/span")
	WebElement myaddresses;

	@FindBy(xpath = "//a[@title=\"Information\"]/span")
	WebElement personalinfo;

	@FindBy(xpath = "//a[@title=\"My wishlists\"]/span")
	WebElement mywishlists;

	public void orderhistory() {
		orderhistory.click();
	}

	public void creditslips() {
		creditslips.click();
	}

	public void myaddresses() {
		myaddresses.click();
	}

	public void personalinfo() {
		personalinfo.click();
	}

	public void mywishlists() {
		mywishlists.click();
	}

	public String title() {
		String title = driver.getTitle();
		return title;
	}
	
	public void goback() {
		driver.navigate().back();
	}

}
