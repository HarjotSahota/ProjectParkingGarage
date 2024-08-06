public class Garage {
	int carCount;														// keeps track of cars
	int nfloors = 4;													
	int nspots = 42;
	parkingSpot[][] spots = new parkingSpot[nfloors][nspots];			// parking spots initialized
	public Garage(int nfloors, int nspots) {				
		for (int i = 0; i < nfloors; i++) {								
			for (int j = 0; j < nspots; j++) {
				for (int handicap = 0; handicap < 3; handicap++) {		// 0-2 are handicap spots on each floor
					spots[i][handicap] = new parkingSpot("Handicap");
				}
				for (int bike = 3; bike < 5; bike++) {					// 3-4 are bike spots on each floor
					spots[i][bike] = new parkingSpot("Bike");
				}
				for (int family = 5; family < 7; family++) {			// 5-6 are family spots on each floor
					spots[i][family] = new parkingSpot("Family");
				}
				for (int car = 7; car < nspots; car++) {				// 7-42 are normal spots on each floor
					spots[i][car] = new parkingSpot("Car");
				}
			}
		}
	}
	
	public int park(String type, String spotNumber, int ticket) {	// how we can park the cars
		Vehicle vehicle = new Vehicle(type, spotNumber, ticket);
		for (int i = 0; i < nfloors; i++) {
			for (int j = 0; j < nspots; j++) {
				parkingSpot spot = spots[i][j];
				if (spot.type == type && spot.equals(null)) {
					spot.spotNumber = spotNumber;
					spot.ticket = ticketMaker(++i, ++j);
					return spot.ticket;
				}
			}
		}
		System.out.println("No spots availible, come again later!");
		return 0;
	}
	
	private int ticketMaker(int floor, int spot) {
		return floor*100 + spot; 
	}
	
	/*
	public String exit(String ticket) {
		
	}
	*/
	
}










