import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.workshop.Hotel;
import com.bridgelabz.workshop.HotelReservation;

import junit.framework.Assert;

public class HotelReservationTest {
	HotelReservation hotel1;

	@Before
	public void setUp() {
		hotel1 = new HotelReservation();
	}

	@Test
	public void givenHotelNameWhenAddedReturnSize() {
		Assert.assertEquals(3, hotel1.addHotel());
	}
}
