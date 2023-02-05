package shopping;

import java.util.*;
import java.util.ListIterator;

public class Cart {

	int cartId=0;
	List<Product> itemList;
	float cartTotal;
	
	public Cart() {
		this.cartId++;
		this.itemList = new ArrayList<Product>();
		this.cartTotal=0;
		
	}
	
	
	public void showCart() {
		try {
			ListIterator<Product> iterator = itemList.listIterator();
			while(iterator.hasNext()) {
				Product item1 = iterator.next();
				System.out.println(item1);
			}	
		}
		catch(Exception e) {
			System.out.println("Your cart is empty.");
		}
	}

	public void addToCart(Product item) {
		this.itemList.add(item);
	}
	
	public void removeFromCart(Product i) {
		ListIterator<Product> iterator = itemList.listIterator();
		while(iterator.hasNext()) {
			Product item2 = iterator.next();
			if (item2.name.equals(i.name)) {
				this.itemList.remove(i);
				break;
			}
		}
	}
	public float getCartTotal() {
		
		try {
			ListIterator<Product> iterator = itemList.listIterator();
			this.cartTotal=0;
			while(iterator.hasNext()) {
				Product item = iterator.next();
				this.cartTotal = this.cartTotal + (item.price * item.quantity);
			}
			return this.cartTotal;
		}catch(Exception e)
		{
			System.out.println("Your cart is empty.");
			return 0;
		}
	}
	
	
	

}
