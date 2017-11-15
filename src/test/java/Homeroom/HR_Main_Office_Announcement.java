package Homeroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_Main_Office_Announcement extends Environment_Setup{
	
	
	
// This Class will Create a New Main Office Announcement
	
	
	
// Create Main Office Announcement Function:
	
	@Test
	public static void createMainOfficeAnnouncement() {
		
	// Verify the Main Office Link is Visible
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navmainofficehome")));
		WebElement mainOfficeNavLink = driver.findElement(By.id("navmainofficehome"));
		Assert.assertTrue(mainOfficeNavLink.isDisplayed());
		
	// Click the Main Office Link
		mainOfficeNavLink.click();
		
	// Verify the User is on the Main Office Announcements Page		
		WebElement mainOfficeCreateAnnouncementButton = driver.findElement(By.className("createAnnouncementBtn"));
		
	// Create a Main Office Announcement
		mainOfficeCreateAnnouncementButton.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("subject")));
		WebElement subjectField = driver.findElement(By.id("subject"));
		Assert.assertTrue(subjectField.isDisplayed());
		
	// Enter Text in the Subject Field	
		subjectField.sendKeys("Automation Test Main Office Announcement");
				
	// Enter Text in the ckEditor Field
		WebElement ckeditorField = driver.findElement(By.cssSelector("#cke_1_contents > iframe")); 
		Assert.assertTrue(ckeditorField.isDisplayed());
		driver.switchTo().frame(ckeditorField);
		WebElement announcementBody = driver.findElement(By.tagName("body"));
		announcementBody.clear(); 
		announcementBody.sendKeys("Automation Test Main Office Announcement");
		driver.switchTo().defaultContent();
				
	// Click Save
		WebElement saveButton = driver.findElement(By.id("save"));
		Assert.assertTrue(saveButton.isEnabled());
		System.out.println("Save Button Enabled");
		saveButton.click();
		
	// Verify Announcement
		WebElement announcement = driver.findElement(By.className("panel-heading"));
		Assert.assertTrue(announcement.getText().contains("Automation Test Main Office Announcement"));		
	}
}
