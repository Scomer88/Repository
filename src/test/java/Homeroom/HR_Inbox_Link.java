package Homeroom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_Inbox_Link extends Environment_Setup{
	

	
// This Class will Open the Message Center Inbox using the Link at the Top of the Screen
		
	@Test
	public void inboxLink() {
		
	// Verify the Inbox link is appearing at the Top Right of the page
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navHdrInbox")));		  
	  WebElement inboxLink = driver.findElement(By.id("navHdrInbox"));
	  Assert.assertTrue(inboxLink.isDisplayed());
	  
	
	// Click the Inbox Link at the top of the page  
	  inboxLink.click();
	  
	  
	// Verify the user is brought to the Message Center Inbox 
	  WebElement messageList = driver.findElement(By.id("messageList"));
	  Assert.assertTrue(messageList.isDisplayed());
	  
  }
}
