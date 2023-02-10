
public class Person {
	
	/**
	 * En cours!
	 * Exercice Poo 1.8
	 * @param args
	 */

	public String lastName;
	public String firstName;
	public int age;
	public String address;

	public Person(String lastName, String firstName, int age, String address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}

	public Person(String lastName, String firstName, int age) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(address == null) {
			this.address = "unknow";
		}else {
			
		this.address = address;
		}
	}

	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", address=" + address
				+ "]";
	}

}
