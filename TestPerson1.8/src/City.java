
public class City {
	String country;
	String city;
	int numberInhabitants;
	

	public City(String country,String city, int numberInhabitants) {
		this.country = country;
		this.city = city;
		this.numberInhabitants = numberInhabitants;
	}
	
	public City(String country,String city) {
		this.country = country;
		this.city = city;
		this.numberInhabitants = 0;
	}



	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getNumberInhabitants() {
		return numberInhabitants;
	}


	public void setNumberInhabitants(int numberInhabitants) {
		if(numberInhabitants > 0) {
			this.numberInhabitants = numberInhabitants;
		}else {
			this.numberInhabitants = 0;
			
		}
	}


	@Override
	public String toString() {
		return "City [country=" + country + ", city=" + city + ", numberInhabitants=" + numberInhabitants + "]";
	}


	

	
	
	
	
	
}
