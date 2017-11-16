package Homeroom;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Login.Login;
import Login.Logout;
import environment.Environment_Setup;

public class Homeroom_Regression extends Environment_Setup{
	

	@BeforeSuite
	public static void login() {
		Login.login();
	}
	@Test
	public static void hr_school_anouncement() {
		HR_School_Announcement.createSchoolAnnouncement();
	}
	@Test
	public static void hr_main_office_anouncement() {
		HR_Main_Office_Announcement.createMainOfficeAnnouncement();
	}
	@Test
	public static void hr_mc_create_message() {
		HR_MC_Create_Message.createMessage();
	}
	@Test
	public static void hr_user_profile() {
		HR_User_Profile.userProfile();
	}
	@AfterTest
	public static void logout() {
		Logout.logout();
	}
}
