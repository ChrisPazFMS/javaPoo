package javaPoo;

public class City1 {

	/**
	 * Accompli !
	 * Exercice Poo 1.1
	 * @param args
	 */
	
	// attributs
	public String city;
	public String country;
	public int people;

	// constructeur

	public City1(String city, String country, int people) {

		this.city = city;
		this.country = country;
		this.people = people;
	}

	// Méthode
	public void display() {
		System.out.println("City : " + this.city + " - Country : " + this.country + " - Number : " + this.people);
	}
	

}
