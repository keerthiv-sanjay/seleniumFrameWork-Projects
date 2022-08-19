package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	WebDriver driver;
	public OrderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class='cart_navigation clearfix']/a/span")
	WebElement summary_proceedtocheckout;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement address_proceedtocheckout;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	WebElement shipping_proceedtocheckout;
	
	@FindBy(xpath="//*[@type=\"checkbox\"]")
	WebElement agreecheckbox;
	
	@FindBy(xpath="//a[@class=\"bankwire\"]")
	WebElement bybankwire;
	
	@FindBy(xpath="//button[@class=\"button btn btn-default button-medium\"]/span")
	WebElement confirmorder;
	
	public void summary_proceedtocheckout()
	{
		summary_proceedtocheckout.click();
	}
	
	public void address_proceedtocheckout()
	{
		address_proceedtocheckout.click();
	}
	public void agreecheckbox()
	{
		agreecheckbox.click();
	}
	
	public void shipping_proceedtocheckout()
	{
		
		shipping_proceedtocheckout.click();
	}
	public void bybankwire()
	{
		bybankwire.click();
	}
	public void confirmorder()
	{
		confirmorder.click();
	}
	
	

}
