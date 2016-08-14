package vehicleAdverts;

public abstract class VisitorsWithAccount {
	
	private String name;
	private String email;
	private String phoneNumber;
	private String password;
	
	public VisitorsWithAccount(String name, String email, String phoneNumber, String password) {
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
		return "VisitorsWithAccount [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

}
