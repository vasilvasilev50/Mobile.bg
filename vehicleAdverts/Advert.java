package vehicleAdverts;

import java.util.ArrayList;
import java.util.List;

public class Advert {
	
	private String typeOfVehicle;
	private String brand;
	private String model;
	private int price;
	private int year;
	protected final RegistredUser owner;
	private List<Photo> photos = new ArrayList<Photo>();
	
	public Advert(RegistredUser owner, String typeOfVehicle, String brand, String model, int year, int price) {
		this.typeOfVehicle = typeOfVehicle;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.year = year;
		this.owner = owner;
	}

	@Override
	public String toString() {
		System.out.println("Published by " + this.owner.getMyAccount());
		return "Advert [typeOfVehicle=" + typeOfVehicle + ", brand=" + brand + ", model=" + model + ", price=" + price
				+ ", year=" + year + ", photos=" + photos + "]";
	}

	public String getModel() {
		return model;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public List<Photo> getPhotos() {
		return photos;
	}


}
