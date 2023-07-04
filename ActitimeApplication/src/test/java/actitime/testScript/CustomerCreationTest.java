package actitime.testScript;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import actitime.genericlib.BaseClass;

public class CustomerCreationTest extends BaseClass {
	@Test
	public void CreateCustomer() throws IOException {
		String text="hitesh";
		String customername =du.getDataFromExcelSheet("Sheet3", 1, 0);
		int num = cu.getrandom();
		customername=customername+num;
		
		driver.findElement(By.id("container_tasks")).click(); 
		driver.findElement(By.className("plusIcon")).click();
	    driver.findElement(By.className("createNewCustomer")).click();
	    driver.findElement(By.className("newNameField")).sendKeys(customername);
	    driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Qspider");
	    driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	    cu.ExplicitWait(driver,By.cssSelector(".titleEditButtonContainer>.title"), customername);
	    String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
	    //System.out.println(actualcustomername);
	    Reporter.log(actualcustomername,true);
	    Assert.assertTrue(actualcustomername.contains(text));
	    System.out.println("tc pass");
	}

}
