package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutLocators {
	public LogoutLocators(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutButton;
	
	public WebElement getlogoutButton(){
		return logoutButton;
	}
	
	public void logoutApp() 
	{
		getlogoutButton().click();
	}

}
