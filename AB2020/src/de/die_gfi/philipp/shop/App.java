package de.die_gfi.philipp.shop;

import de.die_gfi.philipp.shop.data.*;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Shop aShop = ShopInit.initializeTestShop();

		System.out.println(aShop);
		System.out.println(aShop.inventoryToString());

		System.out.println();

		while (true) {
			switch (input.nextLine().toLowerCase()) {
			case "login":
				if (employeeLogin(input, aShop)) {
					System.out.println("Login success.");
				}
				break;
			case "alog":
				if (adminLogin(input, aShop)) {
					System.out.println("Logged in as admin");
				}
				break;
			case "purchase":
				if (purchase(input, aShop)) {
					break;
				} else {
					continue;
				}
			case "register":
				registerAsCustomer(input, aShop);
				continue;
			case "cancel":
			case "leave":
				break;
			default:
				System.err.println("Command not recognized!");
				continue;
			}
			break;
		}

	}

	private static boolean purchase(Scanner input, Shop shop) {
		System.out.println("Please enter your email address to make a purchase (To test use \"ooppitz@github.com\"): ");
		String str = input.nextLine();
		Customer customer = shop.getCustomer(str);
		if (customer != null) {
			System.out.println(
					customer.getName() + ", welcome to " + shop.getShopName() + "\nYou can now make a purchase.");
			return customer.makePurchase(input, shop);
		} else {
			System.out.println("Seems like you are not a customer of ours yet. Please register first.");
			return false;
		}
	}
	
	private static boolean employeeLogin(Scanner input, Shop shop) {
		System.out.print("Please enter user name: ");
		return false;
	}
	
	private static boolean adminLogin(Scanner input, Shop shop) {
		System.out.print("Please enter admin password: ");
		return shop.admin.login(input.nextLine());
	}
	
	private static void registerAsCustomer(Scanner input, Shop shop) {
		
	}
}
