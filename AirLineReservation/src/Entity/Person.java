package Entity;

public abstract class Person {
	
	private String firstName;
	private String lastName;
	private String Gender;
	private String city;
	private String email;
	private String password;
	
	public abstract Registration insert();

	public abstract void display();

	


	public String getFirstName() {
		return firstName;
	}

	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public  String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		 this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




	
}

