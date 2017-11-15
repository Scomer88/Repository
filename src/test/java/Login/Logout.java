package Login;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import environment.Environment_Setup;


	public class Logout extends Environment_Setup{
	
	
	public static void logout() {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("navHdrLogout")));
	
		WebElement logoutLink = driver.findElement(By.id("navHdrLogout"));
		logoutLink.click();
		
		WebElement organization = driver.findElement(By.id("organizationCustomId"));
		Assert.assertTrue(organization.isDisplayed());
		
		driver.close();
	}	
}