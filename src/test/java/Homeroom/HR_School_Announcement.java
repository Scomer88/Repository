package Homeroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_School_Announcement extends Environment_Setup{
	
	
	
// This Class will create a new announcement on the Homeroom Tab	
	
	
	
// Create Announcement Function:
	
	@Test
	public static void createSchoolAnnouncement() {
		
	// Verify the Create Announcement Button is Visible
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("createAnnouncementBtn")));
		WebElement createAnnouncementButton = driver.findElement(By.id("createAnnouncementBtn"));
		Assert.assertTrue(createAnnouncementButton.isDisplayed());
		
	// Click the Create Announcement Button	
		createAnnouncementButton.click();
		
	// Verify the Create Announcement field appears (Subject Field)	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("subject")));
		WebElement subjectField = driver.findElement(By.id("subject"));
		Assert.assertTrue(subjectField.isDisplayed());
		
	// Enter Text in the Subject Field	
		subjectField.sendKeys("Automation Test Announcement");
				
	// Enter Text in the ckEditor Field
		WebElement ckeditorField = driver.findElement(By.cssSelector("#cke_1_contents > iframe"));
		Assert.assertTrue(ckeditorField.isDisplayed());
		driver.switchTo().frame(ckeditorField);
		WebElement announcementBody = driver.findElement(By.tagName("body"));
		announcementBody.clear(); 
		announcementBody.sendKeys("Automation Test Announcement");
		driver.switchTo().defaultContent();
				
	// Click Save
		WebElement saveButton = driver.findElement(By.id("save"));
		Assert.assertTrue(saveButton.isEnabled());
		saveButton.click();
		
	// Verify Announcement
		WebElement announcement = driver.findElement(By.className("panel-heading"));
		Assert.assertTrue(announcement.getText().contains("Automation Test Announcement"));
		
	}
}
