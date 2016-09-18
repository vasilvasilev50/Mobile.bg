package vehicleAdverts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo {

	private static final String SHOW_ALL_ADVERTS_IN_DB = "SELECT b.brand_name, m.model_name, "
			+ "a.price, a.first_registration, "
			+ "a.engine_type, a.mileage, a.hp, a.region, a.is_new_imported, "
			+ "a.has_gas_system, a.is_4x4, a.is_metalic, a.has_alloy_wheels, "
			+ "a.is_with_right_steering, acc.phone_number, acc.username, acc.email, md5(acc.password)"
			+ " FROM mobile_schema2.adverts a "
			+ "JOIN car_adverts ca "
			+ "ON (a.id = ca.Adverts_id) "
			+ "JOIN models m "
			+ "ON (ca.model_id = m.id) "
			+ "JOIN brands b "
			+ "ON (m.brand_id = b.id) "
			+ "JOIN accounts acc "
			+ "ON (a.username = acc.username)";
	private static final String DB_SCHEMA = "/mobile_schema2";
	private static final String DB_PORT = "3306";
	private static final String DB_HOST = "localhost:";
	private static final String DB_PASSWORD = "admin";
	private static final String DB_USERNAME = "admin";
	private static final String DATABASE_PATH = "jdbc:mysql://";
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(DATABASE_PATH+DB_HOST+DB_PORT+DB_SCHEMA ,DB_USERNAME,DB_PASSWORD);
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(SHOW_ALL_ADVERTS_IN_DB);
			
			List <Advert> adverts = new ArrayList<Advert>();
			int countAdvert=1;
			while (resultSet.next()){
				String brandName = resultSet.getString("b.brand_name");
				String modelName = resultSet.getString("m.model_name");
				int price = resultSet.getInt("a.price");
				int firstReg = resultSet.getInt("a.first_registration");
				String engineType = resultSet.getString("a.engine_type");
				int mileage = resultSet.getInt("a.mileage");
				int hp = resultSet.getInt("a.hp");
				String region = resultSet.getString("a.region");
				String newImport = resultSet.getString("a.is_new_imported");
				String gasSystem = resultSet.getString("a.has_gas_system");
				String is4x4 = resultSet.getString("a.is_4x4");
				String metallic = resultSet.getString("a.is_metalic");
				String alloyWheels = resultSet.getString("a.has_alloy_wheels");
				String rightSteering = resultSet.getString("a.is_with_right_steering");
				String phoneNumber = resultSet.getString("acc.phone_number");
				String username = resultSet.getString("acc.username");
				String email = resultSet.getString("acc.email");
				String password = resultSet.getString("md5(acc.password)");
				
				Account account = new Account(username, email, phoneNumber, password);
				adverts.add(new Advert(brandName, modelName, region, engineType, 
						price, firstReg, mileage, hp, newImport, gasSystem, is4x4, 
						metallic, alloyWheels, rightSteering, account, null));
				System.out.println("Обява №" + countAdvert++);
				System.out.print("Марка: " + brandName);
				System.out.print(", модел: " + modelName);
				System.out.print(", цена: " + price + "лв");
				System.out.println(", първа регистрация: " + firstReg + "г.");
				System.out.print("Тип двигател: " + engineType);
				System.out.print(", пробег: " + mileage + "км.");
				System.out.print(", регион: " + region);
				System.out.println(", нов внос: " + newImport);
				System.out.print("Газова уредба: " + gasSystem);
				System.out.print(", 4х4: " + is4x4);
				System.out.print(", металик: " + metallic);
				System.out.print(", лети джанти: " + alloyWheels);
				System.out.println(", Десен волан: " + rightSteering);
				System.out.println("ДАННИ ЗА СОБСТВЕНИК");
				System.out.print("тел: " + phoneNumber);
				System.out.println(", потребител: " + username);
				System.out.print("Email: " + email);
				System.out.println(", парола: " + password);
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
