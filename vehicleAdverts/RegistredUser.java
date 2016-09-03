package vehicleAdverts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import exceptions.AdvertException;

public abstract class RegistredUser {

	private SiteDatabase mySite;
	private Account myAccount;
	private List<Advert> myAdverts = new ArrayList<Advert>();

	public RegistredUser(SiteDatabase mySite, Account myAccount) {
		this.mySite = mySite;
		this.myAccount = myAccount;
	}

	public Account getMyAccount() {
		return myAccount;
	}

	public void createAdvert(Advert advert) throws AdvertException {
		mySite.addAdvert(advert);
		myAdverts.add(advert);
	}

	public SiteDatabase getMySite() {
		return mySite;
	}

}
