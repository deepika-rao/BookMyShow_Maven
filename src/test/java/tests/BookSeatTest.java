package tests;

import org.testng.annotations.Test;

import pageobjects.*;
import utility.Base_Class;

public class BookSeatTest extends Base_Class{
	
	@Test
	public void testBookSeat() throws InterruptedException {
		HomePage.verifyHomePage();
		HomePage.clickIwillSkipBtn();
		MainTabPage.verifyMainTabs();
		MainTabPage.clickYouTab();
		MainTabPage.clickTicketsTab();
		TicketsPage.verifyTicketsPage();
		TicketsPage.verifyLocation();
		TicketsPage.clickMoviesMenu();
		MoviesPage.verifyMoviesPage();
		if (MoviesPage.searchForMovie()) {
			MovieDetailsPage.verifyMovieDetailsPage();
			MovieDetailsPage.clickBookBtn();
			PickVenuePage.verifyPickVenuePage();
			if (PickVenuePage.searchForVenue()) {
				ShowTimesPage.verifyShowTimesPage();
				if (ShowTimesPage.selectShowTime()) {
					if (ShowTimesPage.selectSeatCategory()) {
						HowManyTicketsPage.verifyHowManyTicketsPage();
						if (HowManyTicketsPage.selectSeatsQuantity()) {
							PickSeatsPage.verifyPickSeatsPage();
							PickSeatsPage.selectSeats();
						}
					}
				}
			}
		}
	}
}
