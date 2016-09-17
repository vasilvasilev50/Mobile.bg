package vehicleAdverts;

public class Models {
	private int id;
	private String name;

	protected Models(int id, String name) {
		if (id > 0) {
			this.id = id;
		}
		if (name != null && name.trim().length() > 0) {
			this.name = name;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
