package javaPoo;

public class TestCity {

	public static void main(String[] args) {

		// Test 1
		
		 /*
		 City1 toulouse = new City1("Toulouse", "France", 450000);
		 City1 pau = new City1("Pau", "France", 77215);
		 City1 Lisbonne = new City1("Lisbonne","Portugal", 509515);
		 City1 Berlin = new City1("Berlin", "Allemagne",3748148);
		 
		 
		 
		 toulouse.display();
		 
		 toulouse.people += 200000;
		 
		 toulouse.display();
		 
		 pau.display();
		 
		 Lisbonne.display();
		 
		 Berlin.display();
		 */
		 

		// Test 2
/*
		
		CityAccesseurs2 toulouse = new CityAccesseurs2("Toulouse", "France", 470000);

		System.out.println(toulouse);

		//toulouse.people -= 200; //Ne peut pas lire puisque priver + get()
		
		toulouse.setPeople(490000);

		System.out.println(toulouse);

		//toulouse.setPeople(480000);

		//System.out.println(toulouse);
		
*/
		// Test 3

		/*
		CityConstructeur3 rabat = new CityConstructeur3("Rabat", 577000);
		CityConstructeur3 toulouse = new CityConstructeur3("Toulouse", "France", 577000);

		rabat.display();

		rabat.setCountry("Maroc");

		rabat.display();

       */
		
		//test 4
		/*
		CityAttribut4 toulouse = new CityAttribut4("Toulouse", "France", 577000);
		
		toulouse.display();
		*/
		
		//test 5
		/*
		CityConstructeur3 toulouse = new CityConstructeur3("Toulouse", "France", 577000);
		
		
		toulouse.display();

		System.out.println(toulouse); // println affiche l'adresse mémoire de la class
		*/
		
		//test 6
		/*
		CityToString6 toulouse = new CityToString6("Toulouse", "France", 577000);
		
		System.out.println(toulouse);
		*/
		
		//test 7
		
		CityCounter7 paris = new CityCounter7("Paris","France",2000000);
		CityCounter7 nice = new CityCounter7("Nice", "France", 340000);
		
		paris.display();
		nice.display();
		
		System.out.println("nombre d'objet : " + CityCounter7.counter);
		
	}

}
