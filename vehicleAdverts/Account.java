package vehicleAdverts;

public class Account {
	
	private String name;
	private String email;
	private String phoneNumber;
	private String password;
	
	public Account(String name, String email, String phoneNumber, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
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

}
