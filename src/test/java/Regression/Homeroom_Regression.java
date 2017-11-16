package Regression;

import org.testng.annotations.Test;

import Homeroom.HR_Calendar;
import Homeroom.HR_MC_Create_Message;
import Homeroom.HR_Main_Office_Announcement;
import Homeroom.HR_School_Announcement;
import Homeroom.HR_User_Profile;
import Login.Login;
import Login.Logout;
import environment.Environment_Setup;

public class Homeroom_Regression extends Environment_Setup{
	
	
	@Test
	public static void homeroomRegression() {
		
		Login.login();
		HR_School_Announcement.createSchoolAnnouncement();
		HR_Main_Office_Announcement.createMainOfficeAnnouncement();
		HR_MC_Create_Message.createMessage();
		HR_User_Profile.userProfile();
		HR_Calendar.calendar();
		Logout.logout();
	}
}
