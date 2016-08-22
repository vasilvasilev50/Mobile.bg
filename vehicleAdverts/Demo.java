package vehicleAdverts;

import exceptions.AdvertException;
import exceptions.MobileAccountException;

public class Demo {

	public static void main(String[] args) {
		
		SiteDatabase mobileBG = new SiteDatabase();
		
		Admin admin1 = new Admin(mobileBG, new Account("admin2", "admin2@mobile.bg","0888111222", "Admin2@%38!"));
	
		mobileBG.addAdmin(admin1);
		
		RegistredUser user1 = new PrivateUser(mobileBG, new Account("Pesho", "pesho@abv.bg", "0878123456", "parolatami"));
		RegistredUser user2 = new PrivateUser(mobileBG, new Account("Gosho", "gosho@abv.bg", "0878123777", "qwerty132"));
		RegistredUser user3 = new PrivateUser(mobileBG, new Account("Maria", "maria@abv.bg", "0878123999", "StrongPword852"));
		try {
			mobileBG.addAccount(user1);
			mobileBG.addAccount(user2);
			mobileBG.addAccount(user3);
		} catch (MobileAccountException e) {
			System.out.println(e.getMessage());
		}
		
//		admin1.deleteUsers("pesho@abv.bg");
		mobileBG.printAllRegistredUsers();
		
		try {
			user1.createAdvert(new CarAdvert(user1, "BMW", "Series5", 2014, 200));
			user1.createAdvert(new CarAdvert(user1, "BMW", "Series3", 2010, 10000));
			user2.createAdvert(new CarAdvert(user2, "Porshe", "cabrio", 2016, 45200));
			user2.createAdvert(new CarAdvert(user2, "Opel", "vectra", 2000, 1200));
			user3.createAdvert(new CarAdvert(user3, "Toyota", "Supra", 2013, 4200));
		} catch (AdvertException e) {
			System.out.println(e.getMessage());
		}
		
//		admin1.deleteAdvert(1000000001L);
		mobileBG.printAllAdverts();
	
////		mobileBG.search();
		
		
	}

}
