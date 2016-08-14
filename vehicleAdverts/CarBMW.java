package vehicleAdverts;

import java.util.List;
import java.util.ListIterator;

public class CarBMW extends CarAdvert {
	
	private BMWModels model;

	public CarBMW(BMWModels model, int year, double price) {
		super("Car", "BMW", model.name(), year, price);
		// TODO Auto-generated constructor stub
	}



}
