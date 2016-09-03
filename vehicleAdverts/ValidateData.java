package vehicleAdverts;

import exceptions.AdvertException;
import exceptions.MobileAccountException;

public class ValidateData {
	
	public static Advert checkThisAdvert(Advert advert) throws AdvertException {
		if (advert.getPrice() >= 0){
			return advert;
		}
		throw new AdvertException("Invalid price");
	}

	public static Account checkThisAccount(Account account) throws MobileAccountException {
		if (isValidPhoneNumber(account) && isValidEmail(account) && isValidPassword(account) && isValidName(account)) {
			return account;
		}
		throw new MobileAccountException("Invalid account!");
	}

	private static boolean isValidName(Account account) throws MobileAccountException {
		if (isValidString(account.getName())){
			return true;
		}
		throw new MobileAccountException("Invalid name!");
	}

	private static boolean isValidPassword(Account account) throws MobileAccountException {
		if (isValidString(account.getPassword())) {
			String password = account.getPassword().trim();
			if (password.length() > 5 && password.length() < 16) {
				return true;
			}
		}
		throw new MobileAccountException("Invalid password!");
	}

	private static boolean isValidEmail(Account account) throws MobileAccountException {
		if (isValidString(account.getEmail())) {
			int countMonkeys = 0;
			int monkeyIndex = 0;
			String email = account.getEmail().trim();
			for (int index = 0; index < email.length(); index++) {
				if (email.charAt(index) == '@') {
					countMonkeys++;
					monkeyIndex = index;
				}
			}
			int countPoints = 0;
			for (int index = monkeyIndex; index < email.length(); index++) {
				if (email.charAt(index) == '.') {
					countPoints++;
				}
			}
			if (countMonkeys == 1 && countPoints == 1) {
				return true;
			}
		}
		throw new MobileAccountException("Invalid email!");
	}

	private static boolean isValidString(String string) {
		if (string != null && string.trim().length() > 0) {
			return true;
		}
		return false;
	}

	private static boolean isValidPhoneNumber(Account account) throws MobileAccountException {
		if (isValidString(account.getPhoneNumber())) {
			String phoneNumber = account.getPhoneNumber().trim();
			if (phoneNumber.length() == 10) {
				for (int index = 0; index < phoneNumber.length(); index++) {
					if (phoneNumber.charAt(index) >= '0' && phoneNumber.charAt(index) <= '9') {
						return true;
					}
				}
			}
		}
		throw new MobileAccountException("Invalid phone number!");
	}
}
