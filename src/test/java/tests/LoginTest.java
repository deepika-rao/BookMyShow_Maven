package tests;

import org.testng.annotations.Test;
import pageobjects.*;

import utility.Base_Class;

public class LoginTest extends Base_Class{
	
	@Test
	public void testLoginLogout() {
		HomePage.verifyHomePage();
		HomePage.clickLoginBtn();
		LoginPage.verifyLoginPage();
		LoginPage.loginWithValidCredential();
		MainTabPage.clickYouTabAfterLogin();
		YouPage.verifyYouPageAfetrLogin();
		YouPage.logout();
		
	}
}