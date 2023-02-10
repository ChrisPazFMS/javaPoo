package javaPoo;

public class CityConstructeur3 {
	
	/**
	 * Accompli !
	 * Exercice Poo 1.3
	 * @param args
	 */

	// attributs
	public String city;
	public String country;
	public int people;
	
	// constructeur

	public CityConstructeur3(String city, String country, int people) {

		setCity(city);
		setCountry(country);
		setPeople(people);

	}
	
	public CityConstructeur3(String city, int people) {
		setCity(city);
		//this.country = "unknown";
		setCountry("unknown");
		setPeople(people);
	}
	
	
	
	// accesseurs

	public int getPeople() {
		return people ;

	}
	
	public void setPeople(int people) {
		if (people < getPeople()) {
			
			throw new RuntimeException("Vous ne pouvez pas mettre un nombre inférieur à " +  getPeople() + " !");
			
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
			
		System.out.println(
				"[City : " + getCity() + "] [Country : " + getCountry() + "] [People : " + this.getPeople()+ "]");
		
	}

	public String toString(String string) {
		return "[City : " + getCity() + "] [Country : " + getCountry() + "] [People : " + this.getPeople()+ "]";
	}

}
