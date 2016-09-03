package vehicleAdverts;

public class CarAdvert extends Advert {

	public CarAdvert(RegistredUser owner, String brand, String model, int year, int price) {
		super(owner, "Car", brand, model, year, price);
	}

}
