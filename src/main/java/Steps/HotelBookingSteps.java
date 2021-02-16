/**
 * 
 */
package Steps;

import Page.HotelBookingPage;
import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class HotelBookingSteps extends HotelBookingPage{
	ReusableActions ra= new ReusableActions();
	public void HotelBooking(String location,int hotels,int roomtype,String noofrooms, String checkindate, String checkoutdate,String adutlsperroom,String childrenperroom,String firstName, String lastName, String address, String cardNo, String cardType, String expiryMonth, String expiryYear, String cvvNo) {
		//ReusableActions ra=new ReusableActions();
		ra.SelectOption(location,Location,"ByValue");
		ra.SelectOption(hotels, Hotels);
		ra.SelectOption(roomtype, RoomType);
		ra.SelectOption(noofrooms, NumberOfRooms);
		ra.EnterText(checkindate,txtCheckINDate );
		ra.EnterText(checkoutdate,txtCheckOutDate );
		ra.SelectOption(adutlsperroom,AdultsPerRoom,"ByValue");
		ra.SelectOption(childrenperroom,ChildrenPerRoom,"ByValue");
		ra.Clicking(SearchBtn);
		ra.Clicking(SelectRdBtn);
		ra.Clicking(ContinueBtn);
		//ra.Clicking(CancelBtn);
		ra.EnterText(firstName, txtFirstName);
		ra.EnterText(lastName, txtLastName);
		ra.EnterText(address, txtAddress);
		ra.EnterText(cardNo, CardNumber);
		ra.SelectOption(cardType, CardType);
		ra.SelectOption(expiryMonth, ExpiryMonth);
		ra.SelectOption(expiryYear, ExpiryYear);
		ra.EnterText(cvvNo, CvvNumber);
		ra.Clicking(BookNowBtn);
		//ra.Clicking(BookingCancelBtn);
		//ra.Clicking(BookedItineraryBtn);
	}
}
