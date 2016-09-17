package vehicleAdverts;

import java.util.List;

public class CarAdvert extends Advert {

	protected CarAdvert(String typeOfVehicle, String brand, String model, String region, String engineType, int price,
			int firstRegistration, int mileage, int hp, boolean isNewImported, boolean hasGasSystem, boolean has4x4,
			boolean isMetallic, boolean hasAlloyWheels, boolean isWithRightSteering, RegistredUser owner,
			List<Photo> photos) {
		
		super(typeOfVehicle, brand, model, region, engineType, price, firstRegistration, mileage, hp, isNewImported,
				hasGasSystem, has4x4, isMetallic, hasAlloyWheels, isWithRightSteering, owner, photos);
	}

	

}
