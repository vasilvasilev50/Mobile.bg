package vehicleAdverts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class RegistredUser extends VisitorsWithAccount {
	
	public RegistredUser(String name, String email, String phoneNumber, String password) {
		super(name, email, phoneNumber, password);
	}

	public void printMyAdverts(){
		for (Advert advert : myAdverts()){
			System.out.println(advert);
		}
	}
	
	private Set<Advert> myAdverts(){
		return SiteDatabase.getMyAdverts(super.getEmail());
	}
	
	public void newAdvert(Advert advert, SiteDatabase mobileBG){
		Admin admin = mobileBG.getAdmin();
		admin.checkThisAdvert(advert);
	}

}
