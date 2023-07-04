package actitime.genericlib;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtility {
		public int getrandom()
		{
			Random r=new Random();
			int num=r.nextInt(10000);
			return num;
		}
		
		public void getalertcancel(WebDriver driver)
		{
			Alert alt=driver.switchTo().alert();
			alt.dismiss();
		}
		
		public void getalertaccept(WebDriver driver)
		{
			Alert alt=driver.switchTo().alert();
			alt.accept();
		}
		
		public String getalertText(WebDriver driver)
		{
			Alert alt=driver.switchTo().alert();
			String text=alt.getText();
			return text;
		}
		
		public void ExplicitWait(WebDriver driver, By locator, String Text) {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), Text));
		}
		
		public void getselectbyValue(WebElement dropdown,String Value)
		{
			Select s=new Select (dropdown);
			s.selectByValue(Value);
		}
		
		public void getselectbyVisibleText(WebElement dropdown, String VisibleText) {
			Select s=new Select(dropdown);
			s.selectByVisibleText(VisibleText);
		}
		
		public void getselectbyIndex(WebElement dropdown,int Index) {
			Select s=new Select(dropdown);
			s.selectByIndex(Index);
		}
		
		public void getoptions(WebElement option)
		{
			Select s=new Select(option);
			s.getOptions();
		}


		public void doubleclick(WebDriver driver,WebElement element)
		{
			Actions act=new Actions(driver);
			act.doubleClick(element).perform();
		}


}
