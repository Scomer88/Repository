package Homeroom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_User_Profile extends Environment_Setup{
	

		
	@Test
	public static void userProfile() {
		
	// Go to the Homeroom Tab	
	  HR_GoTo_Homeroom.goToHomeroom();	
		
	// Verify the User Profile Link is visible in the Left NAv
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navuserProfile")));		  
	  WebElement userProfileLink = driver.findElement(By.id("navuserProfile"));
	  Assert.assertTrue(userProfileLink.isDisplayed());
	  
	
	// Click the User Profile Link in the Left NAv 
	  userProfileLink.click();
	  
	  
	// Verify the user is brought to the User Profile Page
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[5]/div[1]")));
      WebElement userProfileInfo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[5]/div[1]"));
	  Assert.assertTrue(userProfileInfo.isDisplayed());
	  
	// ** Can Add more tests if needed ** 
	  
  }
}
