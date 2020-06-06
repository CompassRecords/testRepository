
public class App {

	public static void main(String[] args) {
		/*Week 1 Coding Assignment
		 * Coding Step #4
		 * Student: Greg Beinecke
		 */
		String firstname = "Greg";
		String lastname = "Beinecke";
		char middleinitial = 'J';
		int numfriends = 8;
		int ageyrs = 33;	
		
		System.out.println("My full name is " + firstname + " " + middleinitial + " " + lastname + ".");
		System.out.println("I am " + ageyrs + " years old.");
		System.out.println("I have " + numfriends + " good friends.");

		
		double itemprice = 5.25;
		double amountinwallet = 80.00;
		System.out.println("I had $" + amountinwallet + " in my wallet.");
		System.out.println("The item price was $" + itemprice + ".");
		amountinwallet = amountinwallet - itemprice;
		System.out.println("After purchasing the item, I had " + amountinwallet + " remaining in my wallet.");
	}

}