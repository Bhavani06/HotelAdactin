/**
 * 
 */
package Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;

import Utility.ReusableActions;

/**
 * @author Bhavani
 *
 */
public class BookingTest extends BaseClass{
	@org.testng.annotations.Test
	public void TestCases() throws InvalidFormatException, IOException {
		
		ReusableActions ra = new ReusableActions();
		HashMap<String, HashMap>  hmExcelData = ra.readExcel();			
		driver().manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Set<String> s = hmExcelData.keySet();
		Iterator<String> iterator = s.iterator(); 
		HotelBookingTest HotelBookTest = new HotelBookingTest();
		
		
		while(iterator.hasNext()) {
//			for(int rowDataIter=0;rowDataIter<hmExcelData.get(s).size();rowDataIter++) {
				HashMap<String, String> hmRowdata = hmExcelData.get(iterator.next());
				if(hmRowdata.get("TestCaseName").contains("TicketBooking1")) {
					test=reports.startTest(hmRowdata.get("TestCaseName"));
					HotelBookingTest.HotelBooking(hmRowdata);
					
					reports.endTest(test);
				}
				else if(hmRowdata.get("TestCaseName").contains("TicketBooking1")) {
					
				}
//			}
		}
		flushReports();
	}
	

}


