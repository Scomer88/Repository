package Homeroom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import environment.Environment_Setup;

public class HR_Calendar extends Environment_Setup{
	

		
	@Test
	public static void calendar() {
		
	// Go to the Homeroom Tab	
	  HR_GoTo_Homeroom.goToHomeroom();	
		
	// Verify the Calendar Link is visible in the Left NAv
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("navcalendar")));		  
	  WebElement calendarLink = driver.findElement(By.id("navcalendar"));
	  Assert.assertTrue(calendarLink.isDisplayed());
	  
	
	// Click the User Profile Link in the Left NAv 
	  calendarLink.click();
	  
	  
	// Verify the user now sees the Calendar
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fullCalendar")));
      WebElement calendar = driver.findElement(By.id("fullCalendar"));
	  Assert.assertTrue(calendar.isDisplayed());
	  
	// ** Can Add more tests if needed ** 
	  
  }
}
