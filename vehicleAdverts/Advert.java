package vehicleAdverts;

import java.util.ArrayList;
import java.util.List;

public class Advert {
	
	private String typeOfVehicle;
	private String brand;
	private String model;
	private double price;
	private int year;
	private List<Photo> photos = new ArrayList<Photo>();
	
	public Advert(String typeOfVehicle, String brand, String model, int year, double price) {
		this.typeOfVehicle = typeOfVehicle;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Advert [typeOfVehicle=" + typeOfVehicle + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", year=" + year + ", photos=" + photos + "]";
	}

	public String getModel() {
		return model;
	}


}
