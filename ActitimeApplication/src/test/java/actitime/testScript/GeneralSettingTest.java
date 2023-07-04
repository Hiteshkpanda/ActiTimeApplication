package actitime.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import actitime.genericlib.BaseClass;

public class GeneralSettingTest extends BaseClass {
	@Test
	public void TopGroupingLevel() {
		String text="MODIFICATIONS NOT SAVED";
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.xpath("//ul[@id='popup_menu_items_content']//li[4]")).click();
		WebElement dropdown=driver.findElement(By.name("firstHierarchyLevelCode"));
		cu.getselectbyValue(dropdown, "4");
		String msg=driver.findElement(By.xpath("//td[text()='MODIFICATIONS NOT SAVED']")).getText();
		//System.out.println(msg);
		Reporter.log(msg,true);
		Assert.assertEquals(msg,text);
		System.out.println("tc pass");

	}

}
