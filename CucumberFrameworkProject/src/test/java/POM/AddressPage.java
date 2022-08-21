package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	WebDriver driver;
	public AddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[contains(text(),\"My addresses\")]")
	WebElement addressbtn;

	@FindBy(xpath="//*[contains(text(),\"Update\")]")
	WebElement updatebtn;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement address;
	
	@FindBy(xpath="//select[@id='id_state']")
	WebElement statebtn;
	
	@FindBy(xpath="//option[@value='5']")
	WebElement stateoption;
	
	@FindBy(xpath="//*[contains(text(),'Save')]")
	WebElement savebtn;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div/ul/li[3]")
	WebElement companytxt;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div/ul/li[4]/span[1]")
	WebElement address1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[2]")
	WebElement statenamee;
	
	public void addressbtn()
	{
		addressbtn.click();
	}

	public void updatebtn()
	{
		updatebtn.click();
	}
	public void company(String name)
	{
		company.clear();
		company.sendKeys(name);
	}
	public void address(String name)
	{
		address.clear();
		address.sendKeys(name);
	}
	public void statebtn()
	{
		statebtn.click();
	}
	public void stateoption()
	{
		stateoption.click();
	}
	public void savebtn()
	{
		savebtn.click();
	}
	public String companytxt()
	{
		String cmpnytxt= companytxt.getText();
		return cmpnytxt;
	}
	public String address1()
	{
		String address= address1.getText();
		return address;
	}
	public String statename()
	{
		String statename= statenamee.getText();
		return statename;
	}

	

}
