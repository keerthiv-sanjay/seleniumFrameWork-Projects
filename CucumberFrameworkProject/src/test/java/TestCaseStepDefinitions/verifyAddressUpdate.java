package TestCaseStepDefinitions;

import org.openqa.selenium.WebDriver;

import POM.AddressPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class verifyAddressUpdate {

	WebDriver driver = hooks.driver;

	@When("click  myaddresses and update the address")
	public void click_myaddresses_and_update_the_address() {
		AddressPage ap = new AddressPage(driver);
		ap.addressbtn();
		ap.updatebtn();
		ap.company("qwerty");
		ap.address("43/1 anna nagar,srkv post,dhubai,china");
		ap.statebtn();
		ap.stateoption();
		ap.savebtn();

	}

	@Then("check the updated address")
	public void check_the_updated_address() {
		AddressPage ap = new AddressPage(driver);
		String company = ap.companytxt();
		String address = ap.address1();
		String statename = ap.statename();
		Assert.assertEquals(company, "qwerty");
		Assert.assertEquals(address, "43/1 anna nagar,srkv post,dhubai,china");
		Assert.assertEquals(statename, "California");
	}

}
