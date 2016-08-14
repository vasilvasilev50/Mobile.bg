package vehicleAdverts;

public class Admin extends VisitorsWithAccount{

	public Admin(String name, String email, String phoneNumber, String password) {
		super(name, email, phoneNumber, password);
	}
	
	public RegistredUser checkThisAccount(String name, String email, String phoneNumber, String password) {
		//TODO check user data
		return new PrivateUser(name, email, phoneNumber, password);
	}

	public Advert checkThisAdvert(Advert advert) {
		// TODO check advert data
		return advert;
	}
	

}
