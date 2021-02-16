package Parking;

public class ParkingMeter {

	private double purchasedMinutes;

	public double getPurchasedMinutes() {
		return purchasedMinutes;
	}


	public void setPurchasedMinutes(int purchasedMinutes) {
		this.purchasedMinutes = purchasedMinutes;
	}

	@Override
	public String toString() {
		return "ParkingMeter [purchasedMinutes=" + purchasedMinutes + "]";
	}
}