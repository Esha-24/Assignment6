package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product p1 = new Product("Mobile","Samsung",2,14999);
		Product p2 = new Product("TV","Sony",5,24999);
		Product p3 = new Product("Laptop","HP",12,54999);
		Product p4 = new Product("AC","Hitachi",8,20000);
		Product p5 = new Product("Mobile","Redmi",12,12999);
		
		ArrayList<Product> plist = new ArrayList<Product>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);
				
		Customer c = new Customer();
		c.setName("Anwesha");
		c.setPhone(9800123456L);
		c.setEmail("anu@gmail.com");
		Cart cart = new Cart();
		
		System.out.println("\n_______Available Products are_______\n");
		for(Product p:plist)
		{
			System.out.println(p.name+"\t"+p.brand+"\t\t"+p.quantity+"\tleft only.hurry up!!!");
		}
		
		System.out.println("\nEnter 1 to add item to your cart.\nEnter 2 to remove item form your cart\nEnter 3 to see your cart items\nEnter 4 to get cart total.\nEnter 0 to exit.");
		System.out.println("\nEnter your choice : ");
		int choice = sc.nextInt();
		switch(choice) 
		{
		case 1:
			System.out.println("Which product you want to add to your cart?");
			System.out.println("Enter product name : ");
			String option = sc.next();
			System.out.println("Enter quantity : ");
			int itemCount = sc.nextInt();
			if(option.equalsIgnoreCase(p1.name) && p1.quantity>=itemCount)
			{
				cart.addToCart(p1);
			}
			else if(option.equalsIgnoreCase(p2.name) && p2.quantity>=itemCount)
			{
				cart.addToCart(p2);
			}
			else if(option.equalsIgnoreCase(p3.name) && p3.quantity>=itemCount)
			{
				cart.addToCart(p3);
			}
			
			break;
		case 2:
			cart.removeFromCart(p2);
			break;
		case 3:
			cart.showCart();
			break;
		case 4:
			cart.getCartTotal();
			break;
		case 0 :
			System.out.println("Thank you!!!visit again.");
			break;
		default :
			System.out.println("Wrong choice...try again!!!");
			break;
		
		}

	}

}
