package Homeroom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_MC_Create_Message extends Environment_Setup{
	

		
	@Test
	public static void createMessage() {
		
	// Go to the Homeroom Tab	
	  HR_GoTo_Homeroom.goToHomeroom();	
		
	// Verify the Message Center Link is Visible in the Left NAv
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navnavMessageCenter")));		  
	  WebElement messageCenterLink = driver.findElement(By.id("navnavMessageCenter"));
	  Assert.assertTrue(messageCenterLink.isDisplayed());
	  
	
	// Click the Message Center Link in the Left Nav 
	  messageCenterLink.click();
	  
	  
	// Verify the user now sees the Create Message Link in the Left Nav
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navcreatemessage")));
      WebElement createMessageLink = driver.findElement(By.id("navcreatemessage"));
	  Assert.assertTrue(createMessageLink.isDisplayed());
	  
	  
    // Click the Create Message Link
	  createMessageLink.click();
	  
	  
	// Verify the user is now on the Create Message Page
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("messageContainer")));
      WebElement createMessagePage = driver.findElement(By.id("messageContainer"));
	  Assert.assertTrue(createMessagePage.isDisplayed());
	  
	  
    // Select a Recipient
	  WebElement toRecipient = driver.findElement(By.id("btn-add-to"));
	  toRecipient.click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addressBookModal\"]/div/div/div[2]/div[1]/div[1]/div/button/span[1]")));
	  WebElement selectRecipient = driver.findElement(By.xpath("//*[@id=\"addressBookModal\"]/div/div/div[2]/div[1]/div[1]/div/button/span[1]"));
	  selectRecipient.click();
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"addressBookModal\"]/div/div/div[2]/div[1]/div[1]/div/div/ul/li[2]/a/span[1]")));
	  WebElement adminGroup = driver.findElement(By.xpath("//*[@id=\"addressBookModal\"]/div/div/div[2]/div[1]/div[1]/div/div/ul/li[2]/a/span[1]"));
	  adminGroup.click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/div/div[5]/div[2]/form/div[1]/div/div/div/div[2]/div[3]/div/div[1]/span[1]/input")));
	  WebElement recipient = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[5]/div[2]/form/div[1]/div/div/div/div[2]/div[3]/div/div[1]/span[1]/input"));	  
	  recipient.click();
	  
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("selectAddressesBtn")));
	  WebElement selectRecipients = driver.findElement(By.id("selectAddressesBtn"));
	  selectRecipients.click();
	  
	  
	// Enter a Subject
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("subject")));
	  WebElement subjectField = driver.findElement(By.id("subject"));
	  subjectField.sendKeys("Automation Message");
	  
	  
	// Enter a Message
	  WebElement messageField = driver.findElement(By.cssSelector(".cke_wysiwyg_frame"));
	  Assert.assertTrue(messageField.isDisplayed());
	  driver.switchTo().frame(messageField);
	  WebElement announcementBody = driver.findElement(By.tagName("body"));
	  announcementBody.clear(); 
	  announcementBody.sendKeys("Automation Test Message");
	  driver.switchTo().defaultContent();

	  
	// Send Message 
	  WebElement sendMessage = driver.findElement(By.xpath("//*[@id=\"messageContainer\"]/div[8]/div[2]/button"));
      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", sendMessage);
      sendMessage.click();
  }
}
