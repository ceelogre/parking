package Parking;

public class ParkedCar {

	
	private String make, model, plateNumber, color;
	private double parkedMinutes;
	
	public ParkedCar() {
		super();
		
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public double getParkedMinutes() {
		return parkedMinutes;
	}
	public void setParkedMinutes(double parkedMinutes) {
		this.parkedMinutes = parkedMinutes;
	}

	public boolean contains(CharSequence s) {
		return make.contains(s);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBasicInfo() {
		return make + " " + color +" "+ model + " ";
	}
	
	public String toString() {
		return "ParkedCar info: make=" + make + ", model=" + model + ", plateNumber=" + plateNumber + ", color=" + color
				+ ", parkedMinutes=" + parkedMinutes + "";
	}
	
}
