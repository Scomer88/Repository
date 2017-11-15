package Regression;

import org.testng.annotations.Test;
import environment.Environment_Setup;

public class Full_Regression extends Environment_Setup{
	
	
	@Test
	public static void fullRegression() {
		Homeroom_Regression.homeroomRegression();
	}
}
