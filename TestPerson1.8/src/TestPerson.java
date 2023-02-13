
public class TestPerson {

	/**
	 * Accompli !
	 * Exercice Poo 1.8
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Person manu = new Person("Macron", "Emmanuel", 43, "Elysee à Paris", new City("Amien", "France"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "Joe");

		
		
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);

	}

}
