package vehicleAdverts;

public class Demo {

	public static void main(String[] args) {
		
		SiteDatabase mobileBG = new SiteDatabase();
		mobileBG.addAdmin(new Admin("admin1", "admin1@mobile.bg","0898555666", "Admin1@%25!"));
		mobileBG.addAdmin(new Admin("admin2", "admin2@mobile.bg","0888111222", "Admin2@%38!"));
		RegistredUser pesho = new PrivateUser("Pesho", "pesho@abv.bg", "0878123456", "parolatami");
//		mobileBG.createNewAccount("Pesho", "pesho@abv.bg", "0878123456", "parolatami");
//		mobileBG.createNewAccount("Gosho", "gosho@abv.bg", "0878123777", "qwerty132");
//		mobileBG.createNewAccount("Maria", "maria@abv.bg", "0878123999", "StrongPassword852");
		
		
		mobileBG.printAllRegistredUsers();
//		
//		mobileBG.createNewAdvert();
//		mobileBG.createNewAdvert();
//		
//		mobileBG.printAllAdverts();
//		
//		mobileBG.search();
		Advert sadd = new CarBMW(BMWModels.SERIES_3, 2014, 20000);
			
		pesho.newAdvert(sadd, mobileBG);
	
		mobileBG.printAllAdverts();
		
		
	}

}
