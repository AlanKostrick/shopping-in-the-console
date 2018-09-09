import java.util.ArrayList;
import java.util.List;

public class Cart {

	List<Item> items = new ArrayList<>();

	public void add(Item itemToPurchase) {
		items.add(itemToPurchase);

	}

	public int getSize() {
		return items.size();
	}

	public int displayTotalPrice() {
		int totalPrice = 0;
		for (Item item : items) {
			totalPrice += item.getPrice() * item.getQuantity();
		}
		return totalPrice;
	}

	public void remove(String itemName) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if ((items.get(i).getName()).equals(itemName)) {
				items.remove(i);
			}
		}
	}

	public void showAllItems() {
		for (Item item : items) {
			System.out.println("Item: " + item.getName() + " " + "Price: " + item.getPrice() + " " + "Quantity: "+ item.getQuantity());
		}
	}

}
