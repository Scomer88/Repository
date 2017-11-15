package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public abstract class Environment_Setup {
	
	  public static WebDriver driver;
	  
	  
	  
// ** Setting up the Browser Variables that can be set in the XML Run file ** 
		
	  @Parameters("browser")	 
	  @BeforeClass	 
	  public void browserChoice(String browser) {
 
	  if(browser.equalsIgnoreCase("chrome")) {	 
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	  	}	 
	  else if(browser.equalsIgnoreCase("firefox")) {	 
		  driver = new FirefoxDriver();	  	 
	  	}
	  else if (browser.equalsIgnoreCase("ie")) { 	  
		  driver = new InternetExplorerDriver();
	  	}
	  }

	  
// ** Setting up the URL Variables that can be set in the XML Run file ** 

	  @Parameters("URL")
	  @BeforeClass
	  public void urlChoice(String URL) {
		  if(URL.equalsIgnoreCase("it-qa")) {	 
		      driver.get("http://it-qa.iq-ity.org");
		  	}	
		  else if(URL.equalsIgnoreCase("it-release")) {	 
		      driver.get("http://it-release.iq-ity.org");
		  	}	
		  else if(URL.equalsIgnoreCase("staging")) {	 
		      driver.get("http://iq-iqity.com");
		  	}			  
	  }
	  	  
	public static String Organization = "rwd01";
	public static String User = "admin1";
	public static String Password = "password1";
}
