package vehicleAdverts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Advert {
	
	private String typeOfVehicle;
	private String brand;
	private String model;
	private String region;
	private String engineType;
	private int price;
	private int firstRegistration;
	private int mileage;
	private int hp;
	private boolean isNewImported;
	private boolean hasGasSystem;
	private boolean has4x4;
	private boolean isMetallic;
	private boolean hasAlloyWheels;
	private boolean isWithRightSteering;
	protected final RegistredUser owner;
	private List<Photo> photos = new ArrayList<Photo>();
	
	

	protected Advert(String typeOfVehicle, String brand, String model, String region, String engineType, int price,
			int firstRegistration, int mileage, int hp, boolean isNewImported, boolean hasGasSystem, boolean has4x4,
			boolean isMetallic, boolean hasAlloyWheels, boolean isWithRightSteering, RegistredUser owner,
			List<Photo> photos) {
	
		this.typeOfVehicle = typeOfVehicle;
		this.brand = brand;
		this.model = model;
		this.region = region;
		this.engineType = engineType;
		this.price = price;
		this.firstRegistration = firstRegistration;
		this.mileage = mileage;
		this.hp = hp;
		this.isNewImported = isNewImported;
		this.hasGasSystem = hasGasSystem;
		this.has4x4 = has4x4;
		this.isMetallic = isMetallic;
		this.hasAlloyWheels = hasAlloyWheels;
		this.isWithRightSteering = isWithRightSteering;
		this.owner = owner;
		this.photos = photos;
	}



	@Override
	public String toString() {
		return "Advert [typeOfVehicle=" + typeOfVehicle + ", brand=" + brand + ", model=" + model + ", region=" + region
				+ ", engineType=" + engineType + ", price=" + price + ", firstRegistration=" + firstRegistration
				+ ", mileage=" + mileage + ", hp=" + hp + ", isNewImported=" + isNewImported + ", hasGasSystem="
				+ hasGasSystem + ", has4x4=" + has4x4 + ", isMetallic=" + isMetallic + ", hasAlloyWheels="
				+ hasAlloyWheels + ", isWithRightSteering=" + isWithRightSteering + ", owner=" + owner + ", photos="
				+ photos + "]";
	}



	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}



	public String getBrand() {
		return brand;
	}



	public String getModel() {
		return model;
	}



	public String getRegion() {
		return region;
	}



	public String getEngineType() {
		return engineType;
	}



	public int getPrice() {
		return price;
	}



	public int getFirstRegistration() {
		return firstRegistration;
	}



	public int getMileage() {
		return mileage;
	}



	public int getHp() {
		return hp;
	}



	public boolean isNewImported() {
		return isNewImported;
	}



	public boolean isHasGasSystem() {
		return hasGasSystem;
	}



	public boolean isHas4x4() {
		return has4x4;
	}



	public boolean isMetallic() {
		return isMetallic;
	}



	public boolean isHasAlloyWheels() {
		return hasAlloyWheels;
	}



	public boolean isWithRightSteering() {
		return isWithRightSteering;
	}



	public RegistredUser getOwner() {
		return owner;
	}



	public List<Photo> getPhotos() {
		return Collections.unmodifiableList(photos);
	}



}
