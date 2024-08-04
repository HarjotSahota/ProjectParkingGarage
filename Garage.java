public class Garage {
	int carCount;														// keeps track of cars
	int nfloors = 4;													
	int nslots = 42;
	parkingSpot[][] spots = new parkingSpot[nfloors][nslots];			// parking spots initialized
	public Garage(int nfloors, int nslots) {				
		for (int i = 0; i < nfloors; i++) {								
			for (int j = 0; j < nslots; j++) {
				for (int handicap = 0; handicap < 3; handicap++) {		// 0-2 are handicap spots on each floor
					spots[i][handicap] = new parkingSpot("Handicap");
				}
				for (int bike = 3; bike < 5; bike++) {					// 3-4 are bike spots on each floor
					spots[i][bike] = new parkingSpot("Bike");
				}
				for (int family = 5; family < 7; family++) {			// 5-6 are family spots on each floor
					spots[i][family] = new parkingSpot("Family");
				}
				for (int car = 7; car < nslots; car++) {				// 7-42 are normal spots on each floor
					spots[i][car] = new parkingSpot("Car");
				}
			}
		}
	}
	
	public String park(String type, String slotNumber, String timer) {	// how we can park the cars
		Vehicle vehicle = new Vehicle(type, slotNumber, timer);
		for (int i = 0; i < spots.length; i++) {
			
		}
		return null;
		
	}
	
	
	
}
