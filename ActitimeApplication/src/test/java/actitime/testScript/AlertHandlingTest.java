package actitime.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import actitime.genericlib.BaseClass;

public class AlertHandlingTest extends BaseClass {
	
	@Test
	public void handleAlert() throws IOException {
	String text="Are you sure you want to cancel the Type of Work creation?";
	driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
	driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
	driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	driver.findElement(By.name("name")).sendKeys(du.getDataFromExcelSheet("Sheet2", 0, 1));
	driver.findElement(By.xpath("//td[@id='ButtonPane']/input[@type='button']")).click();
	String msg=cu.getalertText(driver);
	//System.out.println(msg);
	Reporter.log(msg,true);
	cu.getalertcancel(driver);
	SoftAssert sa= new SoftAssert();
	sa.assertEquals(msg, text);
	System.out.println("tc pass");

	}
}