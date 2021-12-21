package com.bridgelabz.workshop;

import java.util.HashMap;

/* Hotel Reservation System 
 */
public class HotelReservation {

	HashMap<String, Hotel> addHotel = new HashMap<String, Hotel>();

	/**
	 * This method is used to add hotels to hotel reservation system
	 */
	public int addHotel() {
		Hotel LakeWood = new Hotel("LakeWood", 110, 90);
		Hotel BridgeWood = new Hotel("BridgeWood", 150, 50);
		Hotel RidgeWood = new Hotel("RidgeWood", 220, 150);
		addHotel.put(LakeWood.getHotelName(), LakeWood);
		addHotel.put(BridgeWood.getHotelName(), BridgeWood);
		addHotel.put(RidgeWood.getHotelName(), RidgeWood);
		return addHotel.size();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to hotel reservation system program");
	}

}
