/**
 * 
 */
package Steps;

import Page.BookedItineraryPage;
import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class BookedItinerarySteps extends BookedItineraryPage{
	ReusableActions ra= new ReusableActions();
	public void BookedItinerary(String searchOrder) {
		ra.EnterText(searchOrder, txtSearchOrder);
		ra.Clicking(GoBtn);
		ra.Clicking(RadioBtn);
		ra.Clicking(SelectAllRadioBtn);
		ra.Clicking(SearchHotelBtn);
		ra.Clicking(SearchHotelBtn);
		ra.Clicking(LogOutBtn);
		ra.Clicking(LogBackLnk);
	}
}
