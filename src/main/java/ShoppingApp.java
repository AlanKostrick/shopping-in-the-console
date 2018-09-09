import java.util.Scanner;

public class ShoppingApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Cart myCart = new Cart();

		System.out.println("Welcome to our shopping cart");

		String userChoice;

		do {
			System.out.println("Choose an option");
			System.out.println("Press 1 to add an item");
			System.out.println("Press 2 to remove an item");
			System.out.println("Press 3 to show cart details");
			System.out.println("Press 4 to exit");
			userChoice = input.nextLine();

			if (userChoice.equals("1")) {
				System.out.println("Enter name of item");
				String itemName = input.nextLine();
				System.out.println("Enter price");
				int price = input.nextInt();
				System.out.println("Enter quantity");
				int quantity = input.nextInt();
				input.nextLine();
				Item addedItem = new Item(itemName, price, quantity);
				myCart.add(addedItem);

			} else if (userChoice.equals("2")) {
				System.out.println("Enter name of item to remove");
				String itemToRemove = input.nextLine();
				myCart.remove(itemToRemove);

			} else if (userChoice.equals("3")) {
				myCart.showAllItems();
			}

		} while (!userChoice.equals("4"));

		System.out.println("Thanks for shopping your total cart price is " + myCart.displayTotalPrice());

	}
}
