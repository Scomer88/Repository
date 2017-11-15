package Homeroom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_GoTo_Homeroom extends Environment_Setup{
	

		
	@Test
	public static void goToHomeroom() {
		
	// Verify the Homeroom Tab is Visible in the Left NAv
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navHomeroom")));		  
	  WebElement homeroomNav = driver.findElement(By.id("navHomeroom"));
	  Assert.assertTrue(homeroomNav.isDisplayed());
	  
	
	// Click the Homeroom Tab in the Left NAv 
	  homeroomNav.click();
	  
	  
	// Verify the user is brought to the Homeroom Tab
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("createAnnouncementBtn")));
      WebElement createAnnouncementButton = driver.findElement(By.id("createAnnouncementBtn"));
	  Assert.assertTrue(createAnnouncementButton.isDisplayed());
	  
  }
}
