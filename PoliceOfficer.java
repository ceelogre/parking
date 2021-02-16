package Parking;

public class PoliceOfficer {

	private int badgeNumber;
	private String name;
	
	private ParkedCar Benz;
	private ParkingMeter meter;
	private ParkingTicket ticket;
	
	public int getBadgeNumber() {
		return badgeNumber;
	}
	public void setBadgeNumber(int badgeNumber) {
		this.badgeNumber = badgeNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Boolean isCarParkedIllegally() {
		return Benz.getParkedMinutes() > meter.getPurchasedMinutes()? true: false;
	}
	public void issueTicket() {
		
			Double fine = ticket.reportFine();
	}
	@Override
	public String toString() {
		return "PoliceOfficer [badgeNumber=" + badgeNumber + ", name=" + name + "]";
	}
	
}
