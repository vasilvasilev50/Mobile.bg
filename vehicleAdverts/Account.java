package vehicleAdverts;

public class Account {

	private String name;
	private String email;
	private String phoneNumber;
	private String password;

	public Account(String name, String email, String phoneNumber, String password) {
		if (areAllValid(name, email, phoneNumber, password)) {
			this.name = name;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.password = password;
		}
	}

	public String getEmail() {
		return this.email;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	private static boolean areAllValid(String name, String email, String phoneNumber, String password) {
		if (isValid(name) && isValid(email) && isValid(phoneNumber) && isValid(password)) {
			return true;
		}
		return false;
	}

	private static boolean isValid(String string) {
		if (string != null && string.trim().length() > 0) {
			return true;
		}
		return false;

	}

}
