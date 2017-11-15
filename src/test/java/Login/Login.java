package Login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import environment.Environment_Setup;

public class Login extends Environment_Setup{
	
	
	@BeforeTest
	public static void login() {
						
		WebElement organization = driver.findElement(By.id("organizationCustomId"));
		organization.sendKeys(Organization);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(User);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(Password);
		
		WebElement submit = driver.findElement(By.id("submitBtn"));
		submit.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navHomeroom")));
		WebElement homeroomTab = driver.findElement(By.id("navHomeroom"));
		Assert.assertTrue(homeroomTab.isDisplayed());		
	}	
}