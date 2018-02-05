package pageobjects;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utility.Base_Class;


import utility.Base_Class;

public class HomePage extends Base_Class {
	private final static By loginBtnId = By.id("com.bt.bms:id/btnLogin");
	private final static By iWillSkipBtnId = By.id("com.bt.bms:id/btnNoThanks");

	public static void verifyHomePage() {
		assertEquals(driver.findElement(loginBtnId).getText(), "Login");
		assertEquals(driver.findElement(iWillSkipBtnId).getText(), "I'LL SKIP");
	}

	public static void clickIwillSkipBtn() {
		clickOnElement(iWillSkipBtnId);
		try {
			if (UnableToIdentifyLocationPopup.getIsPopupVisible()) {
				LoginPage.handleRegionPage();
			}
		} catch (NoSuchElementException e) {
		}
		waitForElement(MainTabPage.showcaseTabXpath);
	}

	public static void clickLoginBtn() {
		clickOnElement(loginBtnId);
		waitForElement(LoginPage.titleTextId);
	}
}