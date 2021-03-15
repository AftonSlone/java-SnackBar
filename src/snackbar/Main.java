package snackbar;

public class Main {
	

	public static void main(String[] args) {
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		//String name, int quantity, double cost, int vendingMachineId
		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());


		
		jane.buySnack(soda.getTotalCost(3));
		soda.buySnack(3);
		System.out.println(jane.getName() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
		System.out.println();

		jane.buySnack(pretzel.getTotalCost(1));
		pretzel.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println();

		bob.buySnack(soda.getTotalCost(2));
		soda.buySnack(2);
		System.out.println(bob.getName() + " cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
		System.out.println();

		jane.addCash(10.00);
		System.out.println(jane.getName() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println();

		jane.buySnack(chocolateBar.getTotalCost(1));
		chocolateBar.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + "$" + jane.getCashOnHand());
		System.out.println("Quantity of " + chocolateBar.getName() + " is " + chocolateBar.getQuantity());
		System.out.println();

		pretzel.addQuantity(12);
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println();

		bob.buySnack(pretzel.getTotalCost(3));
		pretzel.buySnack(3);
		System.out.println(bob.getName() + " cash on hand " + "$" + bob.getCashOnHand());
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println();

		System.out.println("Snack: " + chips.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + chips.getQuantity());
		System.out.println("Total Cost: " + "$" + chips.getTotalCost(chips.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + chocolateBar.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + chocolateBar.getQuantity());
		System.out.println("Total Cost: " + "$" + chocolateBar.getTotalCost(chocolateBar.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + pretzel.getName());
		System.out.println("Vending Machine: " + food.getName());
		System.out.println("Quantity: " + pretzel.getQuantity());
		System.out.println("Total Cost: " + "$" + pretzel.getTotalCost(pretzel.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + soda.getName());
		System.out.println("Vending Machine: " + drink.getName());
		System.out.println("Quantity: " + soda.getQuantity());
		System.out.println("Total Cost: " + "$" + soda.getTotalCost(soda.getQuantity()));
		System.out.println();

		System.out.println("Snack: " + water.getName());
		System.out.println("Vending Machine: " + drink.getName());
		System.out.println("Quantity: " + water.getQuantity());
		System.out.println("Total Cost: " + "$" + water.getTotalCost(water.getQuantity()));
		System.out.println();
		








	}
}