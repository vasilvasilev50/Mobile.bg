package vehicleAdverts2;

import java.util.ArrayList;
import java.util.List;

public abstract class Advert {
	
	private int price;
	private int year;
	private FuelType fuelType;
	private List<Photo> photos = new ArrayList<Photo>();
	
	public Advert(int price, int year, FuelType fuelType) {
		this.price = price;
		this.year = year;
		this.fuelType = fuelType;
	}

}
