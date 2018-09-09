import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CartTest {

	Cart underTest = new Cart();

	@Test
	public void shouldAddAnItemToCart() {
		Item itemToPurchase = new Item("Shirt", 10, 1);
		underTest.add(itemToPurchase);
		int check = underTest.getSize();
		assertThat(check, is(1));
	}

	@Test
	public void shouldAddTwoItemsToCart() {
		Item itemToPurchase = new Item("Shirt", 10, 1);
		Item itemToPurchase2 = new Item("Shirt", 10, 1);
		underTest.add(itemToPurchase);
		underTest.add(itemToPurchase2);
		int check = underTest.getSize();
		assertThat(check, is(2));
	}

	@Test
	public void shouldReturnTotalPriceOf20() {
		Item itemToPurchase = new Item("Shirt", 10, 1);
		Item itemToPurchase2 = new Item("Shirt", 10, 1);
		underTest.add(itemToPurchase);
		underTest.add(itemToPurchase2);
		int check = underTest.displayTotalPrice();
		assertThat(check, is(20));
	}

	@Test
	public void shouldReturnTotalPriceOf10UponRemoval() {
		Item itemToPurchase = new Item("Shirt", 10, 1);
		Item itemToPurchase2 = new Item("Shorts", 10, 1);
		underTest.add(itemToPurchase);
		underTest.add(itemToPurchase2);
		underTest.remove("Shirt");
		int check = underTest.displayTotalPrice();
		assertThat(check, is(10));
	}

}
