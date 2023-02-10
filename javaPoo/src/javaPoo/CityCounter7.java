package javaPoo;

public class CityCounter7 {
	/**
	 * Accompli !
	 * Exercice Poo 1.7
	 * @param args
	 */
	
	
	// attributs
	public String city;
	public String country;
	public int people;

	public static int counter = 0;

	// constructeur

	public CityCounter7(String city, String country, int people) {

		setCity(city);
		setCountry(country);
		setPeople(people);
		counter++;

	}

	public CityCounter7(String city, int people) {
		setCity(city);
		// this.country = "unknown";
		setCountry("unknown");
		setPeople(people);

	}

	// accesseurs

	public int getPeople() {
		return people;

	}

	public void setPeople(int people) {
		if (people < this.people) {

			throw new RuntimeException("Vous ne pouvez pas mettre un nombre inférieur à " + this.people + " !");

		} else {
			this.people = people;
		}
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Méthode

	public void display() {
		if (getCity() == "Toulouse") {

			System.out.println(
					"ville de " + getCity() + " en " + getCountry() + " ayant " + this.getPeople() + " habitans");

		} else {

			System.out.println(
					"[City : " + getCity() + "] [Country : " + getCountry() + "] [People : " + this.getPeople() + "]");
		}
	}

	public String toString() {
		if (getCity() == "Toulouse") {
			return "ville de " + getCity() + " en " + getCountry() + " ayant " + this.getPeople() + " habitans";
		} else {

			return "[City : " + getCity() + "] [Country : " + getCountry() + "] [People : " + this.getPeople() + "]";
		}
	}

}
