import java.util.Scanner;

public class OrderPizza {

	public static void main(String[] args) {
		
		PizzaFactory pizzaFactory = new PizzaFactory();
		
		Pizza thePizza = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type of Pizza? (Salami / Tuna)");
		
		if(userInput.hasNextLine()) {
			
			String typeOfPizza = userInput.nextLine();
			
			thePizza = pizzaFactory.makePizza(typeOfPizza);
		}
		
		System.out.println("Your " + thePizza.getName() + " is in the making!");

	}

}
