package javaPoo;

public class CityAccesseurs2 {

	/**
	 * Accompli !
	 * Exercice Poo 1.2
	 * @param args
	 */
	
	// attributs
	private String city;
	private String country;
	private int people;
	
	// constructeur

	public CityAccesseurs2(String city, String country, int people) {

		setCity(city);
		setCountry(country);
		setPeople(people);

	}

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
				"City : " + getCity() + "Country : " + getCountry() + " People : " + this.getPeople());
	}

	public String toString() {
		return "City : " + getCity() + " - Country : " + getCountry() + " - People : " + this.getPeople();
	}

}
