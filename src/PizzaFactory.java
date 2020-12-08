
public class PizzaFactory {
	
	public Pizza makePizza(String newPizzaType) {
		
		Pizza newPizza = null;
		
		if(newPizzaType.equals("Salami")) {
			
			return new PizzaSalami();
		}
		
		if(newPizzaType.equals("Tuna")) {
			
			return new PizzaTuna();
		}
		else return null;
		
	}
	
}
