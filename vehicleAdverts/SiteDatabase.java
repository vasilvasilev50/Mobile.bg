package vehicleAdverts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class SiteDatabase {
	
	Scanner sc = new Scanner(System.in);
	
	public static final String SITE_NAME = "Mobile.bg";
	private static long advertNumber;
	
	private static Map<Integer, Advert> adverts = new TreeMap<Integer, Advert>();
	private Map<String, RegistredUser> registredusers = new TreeMap<String, RegistredUser>();
	private List<Admin> admins = new ArrayList<Admin>();
	
	static Set<Advert> getMyAdverts(String email) {
		return (Set<Advert>) SiteDatabase.adverts.get(email);
	}

	public void addAdmin(Admin admin) {
		this.admins.add(admin);
	}

	public void createNewAccount(String name, String email, String phoneNumber, String password) {
//		Admin adminOnWork = admins.get(new Random().nextInt(admins.size()));
//		RegistredUser newUser = adminOnWork.checkThisAccount(name, email, phoneNumber, password);
//		if (newUser != null) {
//			this.registredusers.put(newUser.getEmail(), newUser);
//		} else {
//			System.out.println("Popylneni sa nevalidni danni za account! ");
//		}
	}

	public void createNewAdvert(Advert advert) {
			adverts.put(advert.hashCode(), advert);
	}

	public void printAllRegistredUsers() {
		for (RegistredUser user : registredusers.values()){
			System.out.println(user);
		}
	}

	public void printAllAdverts() {
		for (Advert advert : adverts.values()){
			System.out.println(advert);
		}
		
	}

	public void search() {
		System.out.println("Izberete marka");
		String brand = sc.next();
		
	}

	public Admin getAdmin() {
		return admins.get(new Random().nextInt(admins.size()));
	}
	
}
