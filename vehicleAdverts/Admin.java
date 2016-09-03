package vehicleAdverts;

public class Admin extends RegistredUser {

	public Admin(SiteDatabase mySite, Account myAccount) {
		super(mySite, myAccount);
	}

	public void deleteUsers(String email) {
		super.getMySite().deleteThisUser(email);
	}

	public void deleteAdvert(Long advertNumber) {
		super.getMySite().deleteThisAdvert(advertNumber);
		System.out.println("Advert number " + advertNumber + " has been deleted!");
	}

	public void deletePhoto(long advertNumber, short photoNumber) {
		super.getMySite().deleteThisPhoto(advertNumber, photoNumber);
	}

}
