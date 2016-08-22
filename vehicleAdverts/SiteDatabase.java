package vehicleAdverts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.management.relation.RelationServiceNotRegisteredException;

import exceptions.AdvertException;
import exceptions.MobileAccountException;

public class SiteDatabase {

	Scanner sc = new Scanner(System.in);

	public static final String SITE_NAME = "Mobile.bg";
	private static Long advertNumber = 1000000001L;

	private static Map<Long, Advert> adverts = Collections.synchronizedMap(new TreeMap<Long, Advert>());
	private Map<String, RegistredUser> registredUser = Collections
			.synchronizedMap(new TreeMap<String, RegistredUser>());
	private List<RegistredUser> admins = new ArrayList<RegistredUser>();

	public void addAdmin(RegistredUser admin) {
		this.admins.add(admin);
	}

	public void addAdvert(Advert advert) throws AdvertException {
		ValidateData.checkThisAdvert(advert);
		adverts.put(advertNumber++, advert);
	}

	public void printAllRegistredUsers() {
		for (RegistredUser user : registredUser.values()) {
			System.out.println(user.getMyAccount());
		}
	}

	public void printAllAdverts() {
		for (Entry<Long, Advert> advert : adverts.entrySet()) {
			System.out.println("Advert " + advert.getKey());
			System.out.println(advert.getValue());
		}

	}

	public void addAccount(RegistredUser user) throws MobileAccountException {
		ValidateData.checkThisAccount(user.getMyAccount());
		registredUser.put(user.getMyAccount().getEmail(), user);
	}

	public void deleteThisUser(String email) {
		registredUser.remove(email);
	}

	public void deleteThisAdvert(Long advertNumber) {
		adverts.remove(advertNumber);
	}

	public void deleteThisPhoto(long advertNumber, short photoNumber) {
		adverts.get(advertNumber).getPhotos().remove(photoNumber - 1);
	}

}
