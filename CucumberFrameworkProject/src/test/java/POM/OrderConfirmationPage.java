package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	WebDriver driver;
	public OrderConfirmationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class=\"box\"]/p/strong")
	WebElement confirmationtext;
	
	public String confirmationtext()
	{
		String cnfrmtext=confirmationtext.getText();
		return cnfrmtext;
	}
	public String pagetitle()
	{
		String title= driver.getTitle();
		return title;
	}
}
