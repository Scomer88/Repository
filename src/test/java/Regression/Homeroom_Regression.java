package Regression;

import org.testng.annotations.Test;

import Homeroom.HR_GoTo_Homeroom;
import Homeroom.HR_MC_Create_Message;
import Homeroom.HR_Main_Office_Announcement;
import Homeroom.HR_School_Announcement;
import Login.Login;
import Login.Logout;
import environment.Environment_Setup;

public class Homeroom_Regression extends Environment_Setup{
	
	
	@Test
	public static void homeroomRegression() {
		Login.login();
		HR_GoTo_Homeroom.goToHomeroom();
		HR_School_Announcement.createSchoolAnnouncement();
		HR_Main_Office_Announcement.createMainOfficeAnnouncement();
		HR_MC_Create_Message.createMessage();
		Logout.logout();
	}
}
