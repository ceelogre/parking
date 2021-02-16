package Parking;

public class ParkingTicket {
	
	private ParkedCar illegallyParkedCar;
	private ParkingMeter meter;
	private final double fixedFine = 25, additionalFine = 10;
	private PoliceOfficer officer;
	
	//Constructors TO DO
	
	//Report a car
	public String reportCar() {
		return illegallyParkedCar.getBasicInfo();
	}
	
	public String reportOfficer() {
		return officer.getName() + " "+ officer.getBadgeNumber();
	}
	
	public Double getMinutesFine(Double minutes) {
		return additionalFine * minutes / 60;
	}
	public double reportFine() {
		Double diff = illegallyParkedCar.getParkedMinutes() - meter.getPurchasedMinutes();
		
		if(diff < 60)
			return getMinutesFine(diff);
		
		else {
			diff -= 60;
			Double fine = fixedFine;
			
			if(diff > 60) {
				fine += getMinutesFine(diff);
			}
			else {
				Double additionalHoursParked = diff / 60;
				
				fine += additionalHoursParked * additionalFine;
				
				diff -= additionalHoursParked * 60;
				//If there's still minutes get their fine
				if(diff != 0)
					fine += getMinutesFine(diff);
			}
			return fine;	
		}
		
	}
}
